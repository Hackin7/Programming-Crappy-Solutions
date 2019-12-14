#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    long s,e,a,b;cin>>s>>e>>a>>b;
    for (long i=s; i<=e; i++){
        if (i%a == 0 && i%b == 0)cout<<"FizzBuzz"<<endl;
        else if (i%a == 0)cout<<"Fizz"<<endl;
        else if (i%b == 0)cout<<"Buzz"<<endl;
        else cout<<i<<endl;
    }
    return 0;
}
