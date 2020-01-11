import { hot } from 'react-hot-loader/root';

import React, { Component} from "react";


import * as Redux from 'redux';
import { Provider, connect } from 'react-redux'
//https://stackoverflow.com/questions/41966762/reactjs-how-to-transfer-data-between-pages
////Global State Code///////////////////////////////////////////////////
const format = {text:"asdfgh"};
const reducer = (state=format, action) => {
    return action.value;
};

const store = Redux.createStore(reducer);
const updateStore = function(value){
    return {type:"",value:value};
};
const updatePartStore = function(parts){
    var data = store;
    for(var key in parts){
        data[key] = parts[key];
    }
    return{type:"",value:data};
};
store.dispatch(updateStore(format));

//https://www.tutorialspoint.com/redux/redux_react_example.htm
const mapStateToProps = (state, ownProps = {}) => {
   return {data:state};
};
const mapDispatchToProps = (dispatch) => {
    return {
        update:(parts)=>dispatch(updatePartStore(parts))
    }
}

////Components//////////////////////////////////////////////////////////

class UnconnectedComponent extends React.Component{
    constructor(props) {
        super(props);
        this.state = format;
        this.props.update({text:this.state.text});
    }
    render(){
        //const[data,update] = this.props;
        const updateText= (e)=> {
            this.setState({text: e.target.value });
            this.props.update({text:e.target.value});
        }
        
        return (
        <div>
            <b>Text:</b>
             <input type="name" placeholder="Enter Name" 
                    value={this.state.text} 
                    onChange={updateText}/>
        </div>
        );
    }
}
const ConnectedComponent = connect(mapStateToProps, mapDispatchToProps)(UnconnectedComponent);

function getText(){
    alert("Text:"+store.text);
    console.log(store.text);
}
class App extends Component{
  render(){
    return(
      <div className="App">
        <h1>Data Flow with React Redux</h1>
        <Provider store={store}><div>
            <ConnectedComponent/>
            {/*Get the value*/}
            <button onClick={getText}>Get Text</button>
        </div></Provider>
      </div>
    );
  }
}
//App = connect(mapStateToProps, mapDispatchToProps)(App);

export default hot(App);
