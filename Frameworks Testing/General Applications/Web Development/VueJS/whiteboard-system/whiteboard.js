Vue.component('whiteboard',{
	props: ['givencolor','wbwidth','wbheight','savedata','linewidth','noedit'],
   template : `
   <span>
	<br>
	<canvas ref="wb" style="border-style: solid;">
		Sorry, your browser does not support HTML5 canvas technology.
	</canvas>
   </span>
   `,
   data : function(){return{
   }},
   methods:{
   },
   mounted : function(){
		this.markercolor = this.givencolor;//Prevent errors
		this.myCanvas = this.$refs.wb;
		this.ctx = this.myCanvas.getContext("2d");
		var myCanvas = this.myCanvas;
		var ctx = this.ctx;
		
		myCanvas.width=this.wbwidth;
		myCanvas.height=this.wbheight;
		
		// Set Background Color
		//ctx.clearRect(0, 0, myCanvas.width, myCanvas.height);
		ctx.fillStyle="#fff";
		if(this.savedata.data != undefined){// && typeof(this.savedata.data)==ImageData){
			ctx.putImageData(this.savedata.data,0,0);
			console.log(this.savedata.data);
		}else{
			ctx.fillRect(0,0,myCanvas.width,myCanvas.height);
			console.log(this.savedata);
		}
		
		ctx.strokeStyle = this.markercolor;
		//console.log(ctx.strokeStyle);
		ctx.lineWidth = this.linewidth;
		
		function startDrawing(x,y){
			vm.ctx.strokeStyle = vm.markercolor;
			ctx.beginPath();
			ctx.moveTo(x, y);
		}
		function continueDrawing(x, y){
			ctx.lineTo(x, y);
			ctx.stroke();
		}
		var vm = this;
		function finishDrawing(){
			ctx.closePath();
			vm.savedata.data = ctx.getImageData(0, 0, myCanvas.width, myCanvas.height);
			vm.savedata.color = vm.markercolor;
		}
		if (!this.noedit){
			// Mouse ////////////////////////////////////////////////////////////
			if(myCanvas){
				var isDown = false;
				myCanvas.addEventListener('mousedown',function(e){
					isDown = true;
					//alert(e.pageX - myCanvas.offsetLeft);
					//console.log([e.pageX,myCanvas.offsetLeft,e.pageY,myCanvas.offsetTop, e.pageX - myCanvas.offsetLeft,e.pageY - myCanvas.offsetTop]);
					startDrawing(e.offsetX, e.offsetY);
				});
				myCanvas.addEventListener('mousemove',function(e){
					if(isDown !== false) {continueDrawing(e.offsetX, e.offsetY);}
				});
				myCanvas.addEventListener('mouseup',function(e){
					isDown = false;
					finishDrawing();
				});
				myCanvas.addEventListener('mouseleave',function(e){
					isDown = false;
					finishDrawing();
				});
			}
			// Touch Screen ////////////////////////////////////////////////////////
			function getOffsetPosition(evt, parent){
				var rect = myCanvas.getBoundingClientRect();
				var position = {
					x:  evt.targetTouches[0].pageX - rect.left,
					y: evt.targetTouches[0].pageY - rect.top
				};
				/*
				while(parent.offsetParent){
					position.x -= parent.offsetLeft - parent.scrollLeft;
					position.y -= parent.offsetTop - parent.scrollTop;

					parent = parent.offsetParent;
				}
				position.y+=425;//Offset for touch screen devices
				*/
				return position;
			}
			draw = {
				started: false,
				start: function(evt) {
					var position = getOffsetPosition(evt, myCanvas);
					console.log(position);
					
					startDrawing(position.x,position.y);//evt.touches[0].offsetX,evt.touches[0].offsetY
					this.started = true;
				},
				move: function(evt) {
					if (this.started) {
						var position = getOffsetPosition(evt, myCanvas);
						continueDrawing(position.x,position.y);//(evt.touches[0].offsetX,evt.touches[0].offsetY);
					}
				},
				end: function(evt) {
					this.started = false; finishDrawing();
				}
			};
			
			// Touch Events
			myCanvas.addEventListener('touchstart', draw.start, false);
			myCanvas.addEventListener('touchend', draw.end, false);
			myCanvas.addEventListener('touchmove', draw.move, false);
		}
		myCanvas.addEventListener('touchmove',function(evt){ //Prevent scrolling
			evt.preventDefault();
		},false);
   }
});
Vue.component('color-palette',{
	props:['colorObject'],
	template:`
	<span>
	Colours <input type="color" v-bind:value="this.markercolor" ref="colorpicker" @change="updateColor($event.target.value)">
    <button class="badge badge-light" v-on:click="colors.push(markercolor);">+</button>: 
	<br>
	<button v-for="color in colors" v-bind:style="'border:1px solid black;height:1em;width:1em;margin:0.1em;background-color:'+color+';'"
		v-on:click="updateColor(color);"></button>
	<br>
	</span>
	`,
	data : function(){return{
		markercolor:'#000000',
		colors:['#000000','#ff0000'],
	};},
	methods : {
		updateColor: function(val){
			this.markercolor = val;
			this.$forceUpdate();			
			this.$emit('changeColor', val);
		},
	},
	created : function(){
	},
	mounted : function(){
	},
})
Vue.component('basic-whiteboard',{
	props : ['whiteboardData','wbwidth','wbheight','noedit'],
	template:`
	<span>
	<color-palette v-if="!noedit" @changeColor="markercolor=$event; refreshWhiteboard=!refreshWhiteboard;"></color-palette>

	
	<whiteboard v-bind:wbwidth="wbwidth" v-bind:wbheight="wbheight" v-bind:givencolor="markercolor"
	v-bind:savedata="whiteboardData" v-bind:noedit="noedit" linewidth="2" :key="refreshWhiteboard"></whiteboard>
	
	</span>
	`,
	data : function(){return{
		markercolor:'#000000',
		refreshWhiteboard:0,
	};},
});
