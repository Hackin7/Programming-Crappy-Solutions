#include <bits/stdc++.h>
using namespace std;
typedef unsigned long long ull;

int power(ull x, ull y, ull p) 
{ 
    int res = 1;      // Initialize result 
  
    x = x % p;  // Update x if it is more than or  
                // equal to p 
  
    while (y > 0) 
    { 
        // If y is odd, multiply x with result 
        if (y & 1) 
            res = (res*x) % p; 
  
        // y must be even now 
        y = y>>1; // y = y/2 
        x = (x*x) % p;   
    } 
    return res; 
}
ull gcd(ull a, ull b){
    if (b==0)return a;
    return gcd(b, a%b);
}
int main(){
    ull a,b;
    cin >> a >> b;
    if (a==0||b==0){cout<<-1;}
    else if (a>=b){cout<<power(a,b,1000000007);}//(unsigned long long)pow(a,b)%1000000007;}
    else{cout<<gcd(a,b)%1000000007;}
    return 0;
}
