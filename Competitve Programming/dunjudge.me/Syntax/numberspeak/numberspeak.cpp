#include <bits/stdc++.h>
using namespace std;

string no(char x){
    string data="fail";
    //cout<<x<<int(x);
    switch( int(x) ){
        case int('0'):data= "zero";break;
        case int('1'):data="one";break;
        case int('2'):data="two";break;
        case int('3'):data="three";break;
        case int('4'):data="four";break;
        case int('5'):data="five";break;
        case int('6'):data="six";break;
        case int('7'):data="seven";break;
        case int('8'):data="eight";break;
        case int('9'):data="nine";break;
    }
    return data;
}
int main(){
    int t; cin>>t;
    for (int i=0;i<t;i++){
        string n;cin>>n;
        string output="";
        for (int j=0;j<(int)n.length();j++){
            output+=no(n[j]);
            if (j!=(int)n.length()-1)output+=" ";
        }
        output[0] = toupper(output[0]);
        cout<<output; if (i<t-1)cout<<endl;
    }
    return 0;
}
