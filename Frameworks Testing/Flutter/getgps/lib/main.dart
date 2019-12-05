import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:location/location.dart';
import 'dart:async';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(title: 'GPSGet'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {

  var location = new Location();
  LocationData currentLocation;
  
   void initState() {
	   //forceGet();
	   //Update as moving around
	   location.onLocationChanged().listen((LocationData cl) async {
		  print(cl.latitude);
		  print(cl.longitude);
		  setState(() {currentLocation = cl;});
		});
   }
  void forceGet() async{
	//Force update when moving around
	// Platform messages may fail, so we use a try/catch PlatformException.
	try {
	  currentLocation = await location.getLocation();
	} on PlatformException catch (e) {
	  if (e.code == 'PERMISSION_DENIED') {
		String error = 'Permission denied';
		print(error);
	  } 
	  currentLocation = null;
	}
	
  }

  
  @override
  Widget build(BuildContext context) {
	String latitude = "Retrieving";
	String longitude = "Retrieving";
	try{
		if (currentLocation != null){
			latitude = "${currentLocation.latitude}°";longitude = "${currentLocation.longitude}°";
		}
	}on Exception{}
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text(
              "Latitude:\n"+latitude+"\n",
			  style: Theme.of(context).textTheme.display1,
            ),
			Text(
              "Longitude:\n"+longitude+"",
			  style: Theme.of(context).textTheme.display1,
            ),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton.extended(
		label: Text("Refresh Data"),
        onPressed: (){ forceGet();},
        //tooltip: 'Increment',
        //child: Text("Get Data"),
      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
