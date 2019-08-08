#include <bits/stdc++.h>
using namespace std;

/*threepalindrome
int main(){
    char N[3]; cin>>N;
    if (N[0] == N[2]) cout<<"Yes";
    else cout<<"No";
    return 0;
}
*/
/*sccpuzzle
int main(){
    long long S,c;cin>>S>>c;
    if(S*2>=c){
        cout<< c/2;return 0;
    }
    else{
        c-=S*2;
        cout<<S+c/4;
    }
}
*/        
/*rangeproduct
int main(){
    int a,b;cin>>a>>b;
    if (a>0 and b>0){cout<<"Positive";return 0;}    
    else if (a<=0 and b>=0){cout<<"Zero";return 0;}
    else if (a<0 and b<0){
        if ((b-a+1)%2==0)cout<<"Positive";
        else cout<<"Negative";
        return 0;
    }
    int product=1;
    for (int i=a;i<=b;i++){
        product*=i;
    }
    if (product == 0)cout<<"Zero";
    else if (product > 0)cout<<"Positive";
    else if (product < 0)cout<<"Negative";    
}
*/

/*dogmonkey*/
unsigned long long factorial(long long a, long long times){
    if (a==0 or times == 0) return 1;
    return a * factorial(a-1, times-1);
}
int main(){
    long long N,M;cin>>N>>M;
    cout<<"Factorial N:"<<factorial(N,N)%1000000007<<endl;
    cout<<"Factorial M:"<<factorial(M,M)%1000000007<<endl;
    if (abs(N-M)>1){cout<<0;return 0;}
    else if (N!=M){
        cout << (factorial(N,N)*factorial(M,M))%1000000007;
    }
    else cout << (factorial(N,N)*factorial(M,M)*2)%1000000007;
    return 0;
}

/*colordominoes
int factorial(int a, int times){
    if (a==0 or times == 0) return 1;
    return a * factorial(a-1, times-1);
}
int Per(int n, int r){ //Permutations
    return factorial(n,r);
}
int main(){
    int N;cin>>N;
    string S1,S2; cin>>S1>>S2;
    for (int i=1;i<S1.length();i++){
        
    
    if (N<=3){
        cout<<Per(3,N);
        return 0;
    }
}
*/
