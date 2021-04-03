taggingSystem = {};
taggingSystem.query="";
taggingSystem.tags = {}; //Selected Items Tree
taggingSystem.tagSelect = {};// {"Subject":{"hello":1}}; //Selected Items Tree

taggingSystem.found = {};// Index of found items
taggingSystem.selected = {};

// Tagging System //////////////////////////////////////
taggingSystem.updateTags = function(){
	allTags = {};
	itemIndex = taggingSystem.found;

	itemList = taggingSystem.itemsList;

	for (i in itemIndex){
		q = itemIndex[i];
		skipItem = false;
		itemTags = itemList[q].tags;
		for (cat in itemTags){ // category
			if (!allTags.hasOwnProperty(cat)){allTags[cat] = [];}
      //Adding tags//////////////////////////
			for (tag in itemTags[cat]){
        if (!allTags[cat].includes(itemTags[cat][tag]) ){
					allTags[cat].push(itemTags[cat][tag]);
				}
			}
      ///////////////////////////////////////////
		}
	}
	taggingSystem.tags = allTags;
}
taggingSystem.tagSelectVarInitalisation = function(category, name){
  // Variable initialisation
  if (!taggingSystem.tagSelect.hasOwnProperty(category)){
    taggingSystem.tagSelect[category]={};
  }
  if (!taggingSystem.tagSelect[category].hasOwnProperty(name)){
    taggingSystem.tagSelect[category][name]=0;
  }
  //////////////////////////
}
taggingSystem.getTagSelect = function (category, name){
  taggingSystem.tagSelectVarInitalisation(category,name);
  return taggingSystem.tagSelect[category][name];
}
taggingSystem.setTagSelect = function (category, name, value){
  taggingSystem.tagSelectVarInitalisation(category,name);
  taggingSystem.tagSelect[category][name] = value;
}
// Get stuff //////////////////////////////////////////
taggingSystem.searchItems = function(){
	//Renaming
  let query = taggingSystem.query;
	let givenTags = taggingSystem.tagSelect;
  //Basic Initialisation of variables
  taggingSystem.found=[];

	for (q in taggingSystem.itemsList){
    //If substring cannot be found, ignore/////////////////////
		if (!JSON.stringify(taggingSystem.itemsList[q]).includes(query)){
			continue;
		}

		skipItem = false;
		itemTags = taggingSystem.itemsList[q].tags;
		//Item Checking//////////////////////////////////////////////
		for (cat in givenTags){
			//All tags
			for (tag in givenTags[cat]){
				if (givenTags[cat][tag] &&
            (!itemTags.hasOwnProperty(cat) ||
             (itemTags.hasOwnProperty(cat) && !itemTags[cat].includes(tag)) )
           ){
					//Skip This Item
					skipItem = true;
					break;
				}
			}
			if (skipItem){break;}
		}
    //Items////////////////////////////////
		if (!skipItem){
			taggingSystem.found.push(q);
		}
	}
}
taggingSystem.processing = function(){
  taggingSystem.searchItems();
  taggingSystem.updateTags();
}
// Selection ////////////////////////////////////
taggingSystem.selected = {};
taggingSystem.selectAll = function(){
	var selecting = false; //Deselecting
	var checking = function(value){return value};
	for (i in taggingSystem.found){
		if (taggingSystem.selected[taggingSystem.found[i]] != true){
			selecting = true; //Selecting
		}
	}
	for (i in taggingSystem.found){
		taggingSystem.selected[taggingSystem.found[i]] = selecting;
	}
};
taggingSystem.getSelected = function(){
  let items = [];
	for (i in taggingSystem.selected){
		if (taggingSystem.selected[i]){
			items.push(taggingSystem.itemsList[i]);
    }
	}
  return items;
}
// Random ///////////////////////////////////////
taggingSystem.randomQuantity = 2;
taggingSystem.randomSelect =  function(){
  n = taggingSystem.randomQuantity;
  taggingSystem.searchItems();

  //Deselect all
  for (i in taggingSystem.selected){
    taggingSystem.selected[i] = false;
  }
  //Random Selection
  len = taggingSystem.found.length;
  if (n>=len){taggingSystem.selectAll();return;}
  //No questions
  for (var i=0;i<n;i++){
    var x = taggingSystem.found[Math.floor(Math.random() * len)];
    while (taggingSystem.selected[x]){var x = Math.floor(Math.random() * len);}
    taggingSystem.selected[x]=true;
  }
}

///////////////////////////////////////////////////////////////////////////////

searchView = {};
searchView.search = taggingSystem;

searchView.setup = function(){
  let searchField = document.getElementById("search-field");
  searchField.addEventListener("keyup", function(e){
    searchView.search.query=e.target.value;
    searchView.update();
  });
}

searchView.setup();
searchView.update = function(){
  searchView.search.processing();

  let tags = searchView.search.tags;
  let tagsSection = document.getElementById("tags-section");

  tagsSection.innerHTML = "";
  var catcount = 0;
  //HTML update//////////////////////////////////
  for (var category in tags){
    tagsSection.innerHTML +="<b>"+category+"</b><br>"
    for (var property in tags[category]){
      let id = "search-"+catcount+"-"+property;
      let name = tags[category][property];
      tagsSection.innerHTML += "<span><input id='"+id+"' type='checkbox''/>  "+
        name+"<br></span>";
    }
    catcount++;
  }
  // Tag interactivity //////////////////////////////////
  catcount=0;
  for (var category in tags){
    for (var property in tags[category]){
      let id = "search-"+catcount+"-"+property;
      let cat = category;
      let name = tags[category][property];

      let checkbox = document.getElementById(id);
      checkbox.checked = searchView.search.getTagSelect(category,name);
      checkbox.addEventListener("change",function(){
        searchView.search.setTagSelect(cat,name,checkbox.checked);
        searchView.update();
      });
    }
    catcount++;
  }

  // Random //////////////////////////////////
  let random = document.getElementById("search-random-no");
  random.value = searchView.search.randomQuantity;
  random.addEventListener("change",function(){
    searchView.search.randomQuantity = random.value;
    searchView.update();
  })
  // Items //////////////////////
  let itemsSection = document.getElementById("items-section");
  itemsSection.innerHTML = "";
  for (var i in searchView.search.found){
    let itemIndex = searchView.search.found[i];
    let checkboxid = "item-"+itemIndex;
    itemsSection.innerHTML += itemFormat(checkboxid,searchView.search.itemsList[itemIndex])
	//"<input type='checkbox' id="+checkboxid+"> "+searchView.search.itemsList[itemIndex].name+"<br>";
  }
  for (var i in searchView.search.found){
    let itemIndex = searchView.search.found[i];
    let checkboxid = "item-"+itemIndex;

    let checkbox = document.getElementById(checkboxid);
    checkbox.checked = searchView.search.selected[itemIndex];
    checkbox.addEventListener("change",function(){
        searchView.search.selected[itemIndex] = checkbox.checked;
        searchView.update();
    });

  }
}

function defaultItemFormat(checkboxid, item){
	var isHidden = ""; //isHidden = "hidden";
	return "<input type='checkbox'"+isHidden+" id="+checkboxid+"> "+item.name+"<br>";
}
if (itemFormat == null){
	console.log("itemFormat not given in tagging system, loading default function.")
	var itemFormat = defaultItemFormat;
}


allItems = [
  {"name":"Tagging System cannot load data",
   "tags":{"Tag 1":["1"],
           "Tag 2":["1"]}
  },
  {"name":"so play with this makeshift data for now",
   "tags":{"Tag 1":["1"],
           "Tag 2":["2"]}
  },
]
if (taggingSystemData == null){
    console.log("Data not given in tagging system, loading default data.")
    var taggingSystemData = allItems;
}

taggingSystem.itemsList = taggingSystemData;
searchView.update();

