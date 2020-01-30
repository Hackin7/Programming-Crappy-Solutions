#include <bits/stdc++.h>
using namespace std;

typedef vector<int> vi;

vi split(int x,int d){
    vi stuff;
    int a = x/d, r=x%d;
    cout<<"Split:"<<x<<","<<d<<"="<<a<<"R"<<r<<endl;
    for (int i=0;i<d;i++){
        int val = a;
        if (i<r){val+=r;}
        stuff.push_back(val);
    }
    return stuff;
}

int N,K;int B[10000];

vi bb;
void share(int k, int x){
    if (k == K){return;}
    if (k>=N/2){
        for(int i=0;i<N-k;i++){
            cout<<B[i]<<"]"<<endl;
            bb.push_back(B[i]);
        }
        return;
    }

    cout<<k<<"[";
    int kk = N-1-k; //Berry index
    int j=0; //Basket index
    for (int z=k+1;z<k+1+K/2-x;z++){
        int i = B[kk]/B[N-1-z];
        cout<<B[kk]<<">"<<B[N-1-z]<<"*"<<i<<"="<<i*B[N-1-z]<<endl;
        if (i>1 && B[kk]/i > B[N-1-z-1]){
            vi v = split(B[kk],i);
            for(;j<v.size();j++){
                cout<<"="<<v[j]<<"]"<<endl;
                bb.push_back(v[j]);
            }
            break;
        }
        if (j!=0){break;}
    }
    if (j==0){
        cout<<"]"<<endl;
        bb.push_back(B[kk]);
    }
    share(k+1,x+1);
}
int main(){
    ifstream infile;
    infile.open("berries.in");
    infile>>N>>K;
    for (int i=0;i<N;i++){infile>>B[i];} //Value of coins
    infile.close();

    sort(B,B+N);

    int ans=0;

    share(0,0);
    stable_sort(bb.begin(),bb.end());
    int c = 0;
    for(auto i:bb){
        cout<<i<<",";
        if (c>=bb.size()-K&&c<bb.size()-K/2){ans+=i;}
        c++;
    }
    cout<<ans;

    ofstream outfile;
    outfile.open("berries.out");
    outfile<<ans;
    outfile.close();
}
