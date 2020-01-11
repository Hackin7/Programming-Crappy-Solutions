import { useState } from 'react';
import * as React from "react";
import './App.css';


import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link, Redirect
} from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';
import {Button,Form,Card,Navbar,Nav,Dropdown,DropdownButton} from 'react-bootstrap';

import * as Redux from 'redux';
import { Provider, connect } from 'react-redux'
//https://stackoverflow.com/questions/41966762/reactjs-how-to-transfer-data-between-pages

import cookie from "react-cookies";

function POSTRequest(jsonData,url,action){
    var sendData = JSON.stringify(jsonData);
    fetch(url,{
        method: 'POST',
        headers: {
            Accept: 'application/json',
            'Content-Type': 'application/json',
        },
        body: sendData
    })
    .then((response) => response.json())
    .then(action).catch((error) => {console.error(error);});
}
////Global State Code///////////////////////////////////////////////////
const format = {};
const reducer = (state=format, action) => {
    console.log(action);
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

store.dispatch(updateStore({name:"", password:"", id:""}));
////////////////////////////////////////////////////////////////////////
//https://www.tutorialspoint.com/redux/redux_react_example.htm
console.log(store.getState());
const mapStateToProps = (state, ownProps = {}) => {
   return {data:state};
};
const mapDispatchToProps = (dispatch) => {
    return {
        update:(parts)=>dispatch(updatePartStore(parts))
    }
}

////////////////////////////////////////////////////////////////////////
class L extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            creating:false, //
            name:"",//this.data.name,
            password:"",
            id:""
        }//this.data.password};
    }
    render(){
        
        const updateName = (e)=> {
            this.setState({name: e.target.value });
            this.props.update({name:e.target.value});
        }
        const updatePassword= (e)=> {
            this.setState({password: e.target.value });
            this.props.update({password:e.target.value});
        }
        const updateID = (val)=>{
            if (val != ""){
                let loginAuth = JSON.stringify({id:val, name:this.state.name});
                cookie.save("loginAuth", loginAuth, {path: "/"});
            }
            this.setState({id: val });
            this.props.update({id:val});
        }

        const handleSubmit = ()=>{
            if (this.state.creating){
                POSTRequest({name:this.state.name, password:this.state.password},
                '/createaccount', (responseJson)=>{
                    if (responseJson.valid){
                        alert("Account Created");
                        this.setState({creating:false});
                        this.handleSubmit();
                    }else{
                        alert("Account Creation Failed:\nMaybe an account with the same name exists?");
                    }
                });
            }else{
                POSTRequest({name:this.state.name, password:this.state.password},
                '/login', (responseJson) => {
                  updateID(responseJson.id);
                  if (responseJson.id==""){alert("Username and Password not found");}
                  else{}
                });
            }         
        }
        return (
            <header className="App-header">
            {(this.state.id=="" || this.state.id==null) ?  this.state.id==null: <Redirect to="/" />}
            <Form>
             <h2>{this.state.creating ? "Create Account" : "Login"}</h2>
              <Form.Group controlId="formBasicEmail">
                <Form.Label>Username</Form.Label>
                <Form.Control type="name" placeholder="Enter Name" 
                    value={this.state.name} 
                    onChange={updateName}/>
              </Form.Group>
              
              <Form.Group controlId="formBasicPassword">
                <Form.Label>Password</Form.Label>
                <Form.Control type="password" placeholder="Password"
                    value={this.state.password}
                    onChange={updatePassword} />
              </Form.Group>
             
             
             <Button variant="primary" onClick={handleSubmit}>
                {this.state.creating ? "Create" : "Login"}
              </Button>
              <br/><a onClick={()=>{this.setState({creating:!this.state.creating});}}
                style={{fontSize:"0.7em"}}>
                {!this.state.creating ? "Create an account instead" : "Login instead"}
              </a>
            </Form>
            </header>
        );
    }
}

const Login = connect(mapStateToProps, mapDispatchToProps)(L);

//https://reacttraining.com/react-router/web/guides/quick-start
//////////////////////////////////////////////////////////////////////
function useForceUpdate(){
    const [value, setValue] = useState(0); // integer state
    return () => setValue(value => ++value); // update the state to force render
}

function Top(props){
    const forceUpdate = useForceUpdate();
    var loginAuth = cookie.load('loginAuth');
    //alert(window.loggedin);
    if (loginAuth != null && store.getState().id != ""){
        //let loginAuthData = JSON.parse(loginAuth);
        //alert(loginAuth);
        POSTRequest({id:loginAuth.id, name:loginAuth.name},
        '/authid',
        (responseJson) => {
          if (responseJson.valid){
              //alert(JSON.stringify(responseJson));
              props.update({id:loginAuth.id,
                name:loginAuth.name,
                password:responseJson.password});
              //alert();
            }
            else{
                alert("Session Expired");
            }
            forceUpdate();
        });
        props.update({id:loginAuth.id, name:loginAuth.name});
    }
    const logout = ()=>{
        //alert("Logging Out");
        cookie.remove("loginAuth", {path: "/"});
        props.update({id:""});
        forceUpdate();
    }
    
    const UserMenu = 
        <DropdownButton title={store.getState().name} variant="secondary"
                        style={{paddingLeft:"5em"}}>
                <Dropdown.Item onClick={logout}>Logout</Dropdown.Item>
        </DropdownButton>;
        
    return(
      <Navbar bg="dark" variant="dark">
      {store.getState().id=="" || store.getState().id==null ? <Redirect to="/login"/> : ''}
    <Navbar.Brand href="/home">Notes</Navbar.Brand>
    <Nav className="mr-auto">
      {/*<Nav.Link href="/home">Home</Nav.Link>*/}
    </Nav>
    {UserMenu}
  </Navbar>);
}

Top = connect(mapStateToProps, mapDispatchToProps)(Top);
function Group(props){
    return (
    <Card style={{margin:"1em"}}>
        <Card.Header>{props.name}</Card.Header>
        <Card.Body>
        {props.components}
        </Card.Body>
    </Card>
    );

}
function NotesView(props){
    return(
    <div>
    {props.text}
    <br/><br/>
    <Button variant="primary" type="submit" onClick={props.select}>
    Open</Button>
    <Button variant="danger" type="submit" onClick={props.delete}>
    Delete</Button>
    </div>
    );
}

class NotesEditor extends React.Component{
    constructor(props) {
        super(props)
        this.state = {data:this.props.data};
    }

    render(){
        const updateData = (e)=>{
            this.setState({data:e.target.value});
        }
        return(
            <div>
            <textarea style={{width:"100%",height:"50vh"}} 
            value={this.state.data} onChange={updateData}>
            </textarea>
            <br/>
            <Button variant="primary" onClick={()=>this.props.save(this.state.data)}>
            Done</Button>
            </div>
        );
    }
}
class Home extends React.Component{
    constructor(props) {
        super(props);
        this.state={
            mode:false,
            data:[], 
            current:0
        };
    }
    
    componentDidMount() {
        const updateData = (responseJson)=>{this.setState({data:responseJson.notes});}
        POSTRequest({userID:store.getState().id},'/notes',updateData);
    }
    render(){
        const editmode = (index)=>{
            this.setState({mode:true, current:index});
        }
        const addNote = ()=>{
            let newData = this.state.data;
            newData.push(""); //Delete Item
            this.setState({mode:false, data:newData});
            var sendData = {userID:store.getState().id};
            POSTRequest(sendData, '/add', ()=>{});
        }
        const deleteNote = (index)=>{
            let newData = this.state.data;
            newData.splice(index, 1); //Delete Item
            this.setState({mode:false, data:newData, current:index});
            var sendData = {userID:store.getState().id, noteID:index};
            POSTRequest(sendData, '/delete', ()=>{});
        }
        
        const saveNote = (index, value)=>{
            let newData = this.state.data;
            newData[index] = value;
            this.setState({mode:false, data:newData, current:index});
            var sendData = {userID:store.getState().id, noteID:index, value:value};
            POSTRequest(sendData, '/update', ()=>{});
        }
        
        
        
        let datas = this.state.data.map((note,index)=> 
            <Group name={"Note "+index} components=
                <NotesView text={note} select={()=>editmode(index)} 
                delete={()=>deleteNote(index)}/> 
            />);
        return (
            <div>
            <Top/>
            { this.state.mode == 0 ?
            <div style={{marginLeft:"auto",marginRight:"auto",width:"60%"}}>
                <h1 style={{marginTop:"1em",marginBottom:"1em"}}>Notes</h1>
                <Button variant="primary" type="submit" onClick={addNote}>
                Add Note</Button>
                {datas}
            </div>
                :
                <div style={{marginLeft:"auto",marginRight:"auto",width:"60%"}}>
                    <h1 style={{marginTop:"1em",marginBottom:"1em"}}>Editor</h1>
                    <Group name={"Edit Node "+this.state.current} components=
                        <NotesEditor data={this.state.data[this.state.current]} 
                        save={(data)=>saveNote(this.state.current,data)}/>/>
                </div>
            }
            
            </div>
        );
    }
}
//Home = connect(mapStateToProps)(Home);

//https://reacttraining.com/react-router/web/guides/quick-start
function App(props){
    return (
    <Provider store={store}>

    <div>
      
    <Router>
        <Switch>
          <Route path="/login">
            <Login/>
          </Route>
          <Route path="/">
            <Home/>
          </Route>
        </Switch>
    </Router>
    </div>
    </Provider>
    );
}
export default App;
