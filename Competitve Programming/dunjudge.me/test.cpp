#include <bits/stdc++.h>
using namespace std;

const long N = 100000;
long long ft[N + 1]; // note: this fenwick tree is 1-indexed.
void fenwick_update(int p, long long v) {
    while (p <= N) {
        ft[p] += v;
        p += p&-p;
    }
}
long long fenwick_query(int p) {
    long long sum = 0;
    while (p) { // while p > 0
        sum += ft[p];
        p -= p&-p;
    }
    return sum;
}

int main(){
    int n; cin>>n;
    int a[n]; for (int i=0;i<n;i++)cin>>a[i];
    int m;cin>>m;
    bool flag = false;
    for (int i=0;i<m;i++){
        int t;cin>>t;
        if (t==0){int x,y;cin>>x>>y;
            if (flag){cout<<endl;}else{flag = true;}
            cout<<fenwick_query(y);//-fenwick_query(x);
        }else if (t==1){int a,b,c; cin>>a>>b>>c;
            for (int j=a;j<=b;j++){
                fenwick_update(j,c);
            }
        }
    }
}
//int main() {}

//coinchanger
/*
int main() {
    int N , V , coins [1001] , ways [1001]; // coins are 1 - indexed
    cin>>N>>V;
    for (int i=0;i<N;i++){cin>>coins[i];}
    ways [0] = 1;
    for ( int i = 1; i <= N ; ++ i ){// note order of loops !
        for ( int v = 1; v <= V ; ++ v ){
            cout<<i<<" "<<v<<endl;
            if ( v >= coins [ i ]){
                ways [ v ] += ways [ v - coins [ i ]];
            }
        }
    }

    cout<<ways[V]%13371337;
}
*/
