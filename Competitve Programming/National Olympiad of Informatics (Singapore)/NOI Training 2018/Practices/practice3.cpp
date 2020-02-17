#include <bits/stdc++.h>
using namespace std;

/*cuberoot
int main(){
    int t; cin>>t;
    long n[t];
    for (int i=0;i<t;i++){
        cin >> n[0];
        cout<<cbrt(n[0])<<endl;
    }
    return 0;
}
*/

void arrayPrint(int n,int* a,int start,int end){
    for (int i=start;i<=end;i++)cout<<a[i]<<" ";
    cout<<"\n";
}
/*arrayfind
int main(){
    int l; cin>>l;
    int n[l];
    for (int i=0;i<l;i++){cin >> n[i];}
    sort(n,n+l);
    //arrayPrint(l,n,0,l-1);
    int q,find;cin>>q;

    //int array[]= {2,4,6,8,10};
    //cout<<":"<<binarySearch(5,array,5)<<":\n";
    for (int x=0;x<q;x++){
        cin>>find;
        int* min = (lower_bound(n,n+l,find));
        int* max = (upper_bound(n,n+l,find));
        ptrdiff_t small = min-n;int smaller = small;
        ptrdiff_t large = max-n;int greater = large;
        cout<<"Smaller: "<<smaller<<", Greater: "<<l-greater<<endl;
    }
    return 0;
}
*/
/*summit
int days(long long k,long long d,int m){
    long long denominator=1,sum=0;
    long long a=d;//a<=d+n-2;a++){
    //cout<<"Days:"<<k<<' '<<d<<endl;
    while (sum<m){ //not done
        //cout<<d<<" Ratio:"<<k/denominator<<" Sum:"<<sum<<endl;
        if (k/denominator==0){return -1;}
        sum+=k/denominator;
        //if(sum>=k)break;
        denominator*=a;
        a++;
    }
    //cout<<k<<" Ratio:"<<k/denominator<<" Sum:"<<sum<<" Day:"<<a-d+2<<endl;
    return 1;//a-d+2;//No Days
}
int main(){
    long long m,d,value=0;cin>>m>>d;
    long long lo = 0, hi = m,i=0;
    while (lo<=hi){
        i = (lo+hi)/2;
        value = days(i,d,m);
        //Do stuff here to check if X is good or bad
        if (value==-1){lo = i+1;}
        else{hi = i-1;}
    }
    if (days(lo,d,m) >= days(hi,d,m)){value = days(lo,d,m);i=lo;}
    else{value = days(hi,d,m);i=hi;}
    cout<<i;//<<"_"<<value<<"_"<<lo<<"_"<<hi;
    return 0;
}
*/
/*ljubomora*/
bool divisible(int n, int colours[],int divide){
    for (int i=0;i<n;i++){
        if (colours[i]%n!=0){return false;}
    }return true;
}
int min(int n,int colours[]){
    int lo = 0, hi = colours[n-1];
    int ans = -1; //store the answer
    while (lo<=hi){
        int X = (lo+hi)/2;
        //Do stuff here to check if X is good or bad
        if (divisible(n,colours,X)){
            ans = X;
            lo = X+1;
        }
        else{ //if X bad
            hi = X-1;
        }
    }
    return ans;
}
int main(){
    int m,n;cin>>m>>n;
    int c[m];
    sort(c,c+m);
    for (int i=0;i<m;i++)cin>>c[m];
    int divisor = min(m,c),ans=0;
    cout<<divisor;
    return 0;
}

/*marbles
int main(){
    return 0;
}
*/
/*squidzofrenzic
int main(){
    return 0;
}
*/
