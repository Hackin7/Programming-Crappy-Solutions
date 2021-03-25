#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
//Reference: https://github.com/ranaldmiao/sg_noi_archive/blob/master/2020_prelim/tasks/mountains/solutions/mountains.cpp
ll N = 300001;
////PUPQ//////////////////////////////////////////////////////
int ft[300001], cnt=1;//indexed by height order
void fenwick_update(int pos, int value) {
    while (pos <= cnt) {
        //cout<<"Fenwick Updating: "<<pos<<","<<value<<endl;
        ft[pos] += value;

        pos += pos&-pos;
    }
}
int fenwick_query(int pos) {
    ll sum = 0;
    while (pos) { // while p > 0
        sum += ft[pos];
        pos -= pos&-pos;
    }
    return sum;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;cin>>n;N=n;
    ll H[n+1];for(int i=1;i<=n;i++){cin>>H[i];}


    pair<ll,int> order[n+1];
    for(int i=1;i<=n;i++){order[i]={H[i],i};}
    sort(order+1,order+n+1);
    //Order the heights, Excluding duplicates
    //Also count the items
    for(int i = 1; i <= n; i++){
		if (i > 1 && order[i].first != order[i-1].first) cnt++;
		H[order[i].second] = cnt;
	}

    //for(auto i:H){cout<<i<<" ";}

    ll left[n+1],right[n+1];//Smaller heights on left and on right when y==i
    memset(ft,0,sizeof(ft));
    for (int i=1;i<=n;i++){
        //Get number of heights smaller than current height at position
        left[i]=fenwick_query(H[i]-1);
        fenwick_update(H[i],1);
    }
    memset(ft,0,sizeof(ft));
    for (int i=n;i>=1;i--){
        //Get number of heights smaller than current height at position
        right[i]=fenwick_query(H[i]-1);
        fenwick_update(H[i],1);
    }
    long long total = 0;
	for(int i = 1; i <= n; i++){
		total += left[i] * right[i];
	}
    cout<<total;
    return 0;
}
/*
5
0 1 1 0 1
* 2

6
500 20 900 0 900 70
* 7

8
500 10 20 20 900 0 900 70
*
*/
