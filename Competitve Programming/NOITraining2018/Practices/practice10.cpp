#include <bits/stdc++.h>
using namespace std;

/*digits
long long digits(long long A, long long B){
    long long noDigits = B* log10(A) + 1;
    return noDigits;
    //string data=to_string((unsigned long long)pow(A,B));
    //return (unsigned long long)data.length();//*B;
}
int main(){
    long long TC; cin >> TC;
    for (long long i=0;i<TC;i++){
        long long A,B; cin >> A >> B;
        cout<< digits(A,B)<<endl;
    }
    return 0;
}
*/
/* exponentiate
string exponentiate(long long A, long long B, long long M){
    string data=to_string((unsigned long long)pow(A,B)%M);
    //cout<<data<<endl;
    return data;
}
int main(){
    long long T; cin >> T;
    for (long long i=0;i<T;i++){
        long long A,B,M; cin >> A >> B >> M;
        cout<< exponentiate(A,B,M)<<endl;
    }
    return 0;
}
*/
/* pascal 
int factorial(int a, int times){
    if (a==0 or times == 0) return 1;
    return a * factorial(a-1, times-1);
}
int Com(int n, int r){ //Combinatorics
    return factorial(n,r)/factorial(r,r);
}
int term(int R, int c){
    return Com(R-1,c-1);
}
int main(){
    int R,C; cin>>R>>C;
    //cout<< factorial(5,-1)<<endl;
    //cout<< Com(7,2) <<endl;
    cout << term(R,C);
}
*/
/* nprime
vector<int> primes;
bool isPrime(int n){
    //Sieve of Eratosthenes.
    for(vector<int>::iterator it = primes.begin(); it != primes.end(); it++){
    //for (int i=2;i<n;i++){
    //    if (n%i==0) return false;
        if (n%*it==0) return false;
    }
    return true;
}
int main(){
    int n; cin >> n;
    int noPrimes = 2, prime=3; //First few primes are 2,3,5
    primes.push_back(2);primes.push_back(3);
    if (n == 1){cout<< 2;return 0;}
    while (noPrimes != n){
        do{prime+=2;}
        while (not isPrime(prime));
        noPrimes++;primes.push_back(prime);
    }
    cout << prime;
}*/
/*fraction
long long gcd(long long a, long long b){if (b==0){return a;}return gcd(b,a%b);}
int main(){
    long long a,b; cin>>a>>b;
    long long toSimplifyBy=gcd(a,b);
    cout<<a/toSimplifyBy<<"/"<<b/toSimplifyBy;
}
*/

/*carousel
long long factorial(long long a, long long times){
    if (a==0 or times == 0) return 1;
    return a * factorial(a-1, times-1);
}
long long Per(long long n, int r){ //Permutations
    return factorial(n,r);
}
int main(){
    long long N,C;cin>>N>>C;
    cout<<(Per(N,C)/C)%1000003;
    return 0;
}
*/

/*prime factorization*/
vector<int> primes;
bool isPrime(int n){
    //Sieve of Eratosthenes.
    for(int it = 0; it< (int)primes.size()/2+1; it++){
        if (n%primes[it]==0) return false;
    }
    return true;
}
int main(){
    int n; cin >> n;
    int noPrimes = 2, prime=3; //First few primes are 2,3,5
    primes.push_back(2);primes.push_back(3);
    if (n == 1){cout<< 2;return 0;}
    //Generate primes
    while (noPrimes < n/2+1){
        do{prime+=2;}
        while (not isPrime(prime));
        noPrimes++;primes.push_back(prime);
    }
    for(vector<int>::iterator it = primes.begin(); it != primes.end(); it++){
        if (n%*it==0){
            int factorPower=1;
            int factor=*it;
            while (n%factor==0){
                factorPower++;factor = pow(*it,factorPower);
                //cout<<factorPower<<":";
            }
            cout<<*it<<"^"<<factorPower-1<<endl;
        }
    }
    //cout << prime;
}
