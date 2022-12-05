Jaga had gained interest in custom keyboards and has created a platform to create your own keebs! We know we created his custom keeb on the 22nd of September 2022, at **09:41:17** SGT. Oddly specific but we know it's true.

## Solution

```python
@app.post("/build")
def build(request: Request, name: str = Form(...), frameColor: str = Form(...), keyColor: str = Form(...), textColor: str = Form(...), specialColor: str = Form(...)):
    t = datetime.datetime.now(pytz.timezone('Asia/Singapore'))
    seed = int(t.timestamp())
    random.seed(seed)
    token = ''.join(random.choices('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789', k=16))
    with shelve.open('keebdb') as db:
        db[token] = {
            'name': name,
            'frameColor': hex_to_rgb(frameColor),
            'keyColor': hex_to_rgb(keyColor),
            'textColor': hex_to_rgb(textColor),
            'specialColor': hex_to_rgb(specialColor),
            'text': 'default'
        }
    img = draw_keeb(name, hex_to_rgb(frameColor), hex_to_rgb(keyColor), hex_to_rgb(textColor), hex_to_rgb(specialColor))
    img.save(f'keebs/keeb-{token}.png')
    request.session['token'] = token
    return templates.TemplateResponse("build.html", {"request": request, "resp": "Success!", "token": token})

```

Need to do 2 things

1. Reverse Admin Token
2. Reverse key


Ctrl-F find things to do with timestamp - which includes token generation

Admin token is hardcoded, but maybe we can reverse using the timestamp

```
rMwwbpMkzAwyRoWs
```


Can reverse the key

```python
with shelve.open('keebdb') as db:
    db[ADMIN_TOKEN] = {
            'name': adminName,
            'frameColor': adminFrame,
            'keyColor': adminKeys,
            'textColor': adminText,
            'specialColor': adminKeys,
            'text': KEY
        }
...
img = draw_heatmap(adminName, adminFrame, adminKeys, adminText, adminKeys, KEY)
```

The `draw_heatmap` function seems interesting

Check `keebcreator.py`

```python
def draw_heatmap(name, frameColor, keyColor, textColor, specialColor, htext, keeb=keeb, height=580, width=1720, unit=100):

    def draw_key(image, key, x, y, w, h, color):
        x = int(x)
        y = int(y)
        text = key['t']
        if text == '':
            color = specialColor
        elif text in htext:
            color = (255, 84, 84)
        image[y:int(y+h), x:int(x+w)] = color
        img_pil = Image.fromarray(image)
        draw = ImageDraw.Draw(img_pil)
        font = ImageFont.truetype('Poppins-Regular.ttf', 20)
        textsize = font.getsize(text)
        textX = (w - textsize[0]) / 2
        textY = (h + textsize[1]) / 2
        draw.text((x+textX, y+textY), text, textColor, font=font, align='center')
        return np.array(img_pil)

    image = np.zeros((height, width, 3), np.uint8)
    image[:] = frameColor
    img_pil = Image.fromarray(image)
    draw = ImageDraw.Draw(img_pil)
    font = ImageFont.truetype('Poppins-Regular.ttf', 20)
    textsize = font.getsize(name)
    textX = (width - textsize[0]) / 2
    textY = height - 30
    draw.text((textX, textY), name, (255,255,255,255), font=font, align='center')
    image = np.array(img_pil)
    x = 30
    y = 30
    for row in keeb:
        gap = (width - x * 2 - unit * sum([key['w'] for key in row])) / (len(row) - 1)
        for key in row:
            w = unit * key['w']
            h = unit
            image = draw_key(image, key, x, y, w, h, keyColor)
            x += w + gap
            # draw gap
        x = 30
        y += unit + 5
    
    image = Image.fromarray(image)
    return image
```

especially these lines

```python
		elif text in htext:
            color = (255, 84, 84)
```

I mainly just overlaid the images to get the characters used
https://overlay.imageonline.co/

![[heatkeeb-1.png]]


Since the key is likely a word I then unscrambled them
https://word.tips/unscramble/ASERTGHNIL/

![[heatkeeb-2.png]]


![[heatkeeb-3.png]]


# Flag

`STF22{h34t_k3yb04rD}`