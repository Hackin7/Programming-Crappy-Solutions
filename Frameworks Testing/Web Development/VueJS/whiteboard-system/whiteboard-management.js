Vue.component('whiteboard-management',{
	props : ['whiteboardData','wbwidth','wbheight','noedit'],
	template:`
	<div>
	Pages 
	<button class="badge badge-light" v-if="!noedit" v-on:click="newPage();">+</button>: 
	<span class="badge badge-light"v-for="d,index in whiteboardData" >
		<button v-on:click="currentPage=index;$forceUpdate();"
			v-bind:style='{padding:0,border:"none",background:"none", paddingLeft:"0.5em",color:currentPage==index?"red":"black"}'
			>{{index+1}}</button>
		<button v-if="!noedit" v-on:click="whiteboardData.splice(index,1);$forceUpdate();"
			v-bind:style='{padding:0,border:"none",background:"none", paddingLeft:"0.5em"}'>&times;</button>
	</span>
	<br>
	<color-palette v-if="!noedit" @changeColor="markercolor=$event; refreshWhiteboard=!refreshWhiteboard;"></color-palette>
	
	<span v-if="whiteboardData.length > 0" v-for="w,page in whiteboardData">
	<whiteboard v-if="page==currentPage" v-bind:wbwidth="wbwidth" v-bind:wbheight="wbheight" v-bind:givencolor="markercolor"
	v-bind:savedata="w" v-bind:noedit="noedit" linewidth="2" :key="refreshWhiteboard"></whiteboard>
	</span>
	
	</div>
	`,
	data : function(){return{
		markercolor:'#000000',
		currentPage : 0,
		refreshWhiteboard:0,
	};},
	methods : {
		newPage(){
			this.whiteboardData.push({});
			this.currentPage = this.whiteboardData.length-1;
			this.$forceUpdate();
			this.refreshWhiteboard = !this.refreshWhiteboard;
		},
	},
	created : function(){
		this.markercolor = this.givencolor;
	},
	mounted : function(){
	},
})
