#include <bits/stdc++.h>
using namespace std;

string reverseS(string x){
    string a=x;
    for(int i=0;i<(int)x.length();i++){
        a[x.length()-1-i] = x[i];
    }
    return a;
}
string stepNum(string x){
    string a=x;
    for(int i=(int)a.length()-1;i>=0;i--){
        if (a[i] == '9'){a[i]='0';}
        else{
            a[i]++;
            return a;
        }
    }
    return "1"+a;
}

int mod=1000000007;
bool smallNum(string a, string b){ //check if a<b
    if (a.length()!=b.length()){
        return a.length()<b.length();
    }else if(a==b){return true;
    }else{
        for(int i=0;i<(int)a.length();i++){
            if (a[i]==b[i]){continue;}
            return a[i]<b[i];
        }
    }
    return true;
}
int main() {
    int N; cin>>N;
    string X; cin>>X;
    string Y; cin>>Y;
    
    string x=X,y=reverseS(Y);//cout<<"["<<x<<","<<y<<"]\n";
    int ans=0;
    if (x==y){
        ans=((unsigned long long)stoi(Y)+1)%mod;
    }
    else {
        deque<int> stuff;
        int nextchoice=0;
        for(int i=0;i<N;i++){//Take digit as pivot
            int v1=x[i]-'0'+1,v2=y[i]-'0'+1;//+1 because 0 is a choice
            //Take the smaller choice
            if (nextchoice==0){stuff.push_back(min(v1,v2)%mod);}
            else if (nextchoice==1){ //Take Y choice 
                int combi1=(stuff.back()-1)*v2; //0...stuff.back()-1
                int combi2= min(v1,v2);
                //cout<<combi1<<",,"<<combi2<<" ";
                stuff.push_back(combi1+combi2%mod);
            }
            else if (nextchoice==2){ //Take X Choice
                int combi1=(stuff.back()-1)*v1; //0...stuff.back()-1
                int combi2= v1;//min(v1,v2);
                //cout<<combi1<<","<<combi2<<" ";
                stuff.push_back(combi1+combi2%mod);
            }
            
            if (v1<v2){nextchoice=1;}//Used X 
            else{nextchoice=2;} //Used Y
            
            //cout<<stuff.back()<<endl;
            //ans+=(x[i]-'1')*pow(10,N-i-1);
            //cout<<ans<<","<<x[i]<<endl;
        }
        ans=stuff.back();
    }
    cout<<ans;
}

/*
//Working
01:10
02:20
03:30
04:40
05:50
06:60 //Mark out

If X is the limit
00:00
10:01 -> 11:11 -> 12:21 -> 13:31 -> 14:41 //Can Choose Y
20:02 -> 21:12 -> 22:22 ->23:32 ->/ 24:42
//3 possible choices for first digit
30:03//Rejected

if (digit<2){take X choice for next digit}
else{choice smaller choice for next digit}
* 
if Y is the limit 2 53 83
00:
10:
20:02 -> 21:12 -> .... 28:82 //Can choose X
30:03 -> 31:13 -> 32:23 -> 33:33 -> 34:43 -> 38:83 //Can choose X


000:00
100:001 -> 11:11 -> 12:21 -> 13:31 -> 14:41 //Can Choose Y
200:002 -> 21:12 -> 22:22 ->23:32 ->/ 24:42
//3 possible choices for first digit
30:03//Rejected
*/

/*
2
23
59

7
9130980
9013402
*/
