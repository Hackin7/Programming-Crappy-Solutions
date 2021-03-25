#include <bits/stdc++.h>
using namespace std;

int qexp(int A, int B, int M) {
    if (B == 0) return 1; //A^0 = 1 for all A
    long long half = qexp(A, B/2, M); //Note that B/2 is rounded down, this will be compensated later
    half *= half; //Long long is required to ensure this operation does not overflow when M is close to 2^31
    half %= M;
    if (B%2==1) half *= A;  //Compensate the 'round down' of B/2 when B is odd
    return half%M;
}

int main() {
    int N;cin>>N;
    int O[N];memset(O,0,sizeof(O));
    for(int i=0;i<N;i++){
        int A;cin>>A;
        O[A]++;
    }
    //If there is more/less than what is needed for middle
    if(O[0]!=N%2){cout<<0;return 0;}
    for(int i = (N%2 ? 2:1) ;i<N;i+=2){ //Jump by 2
        //cout<<i<<endl;
        // Orders need to come in pairs, no more, no less
        if (O[i]!=2){//Boundary Check
            cout<<0;return 0;
        }
    }
    //You
    cout<<qexp(2,N/2,1000000007);
}
