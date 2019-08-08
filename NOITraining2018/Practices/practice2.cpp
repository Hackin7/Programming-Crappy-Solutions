#include <bits/stdc++.h>
using namespace std;

/* bubblesort 
int main(){
    //bool sorted = false,
    bool moreSorting = true;//false ;
    
    while (moreSorting){//not sorted){
        moreSorting = false;
        for (int i=0;i<n-1;i++){
            if (sort[i] > sort[i+1]){
                int a = sort[i], b = sort[i+1];
                sort[i] = b; sort[i+1]=a;
                moreSorting = true;
            }
            //else if (not moreSorting and (i == n-2)){sorted=true;}
        }
    }
    
    for (int i=0;i<n-1;i++){
        cout << sort[i]<<" ";
    }
    cout << sort[n-1];
    return 0;
}
*/

/* sort
int main(){
    unsigned long long n;
    cin >> n;
    unsigned long long arr[n];
    for (unsigned long long i=0;i<n;i++){
        cin >> arr[i];
    }
    sort(arr,arr+n);
    for (unsigned long long i=0;i<n-1;i++){
        cout << arr[i]<<" ";
    }
    cout << arr[n-1];
    return 0;
}
*/
   
/* lunchbox 
int main(){
    int n,m;
    cin >> n >> m;
    int arr[m];
    for (int i=0;i<m;i++){
        cin >> arr[i];
    }
    sort(arr,arr+m);    
    int noSchools = 0, lunchboxes = 0;
    for (int i=0;i<m;i++){
        if (lunchboxes+arr[i] <= n){
            noSchools+=1;
            lunchboxes += arr[i];
        }
        //cout<<arr[i]<<"-"<<lunchboxes<<" ";
    }
    cout <<  noSchools;
}
*/

/*paint
int main(){
    int n;
    cin >> n;
    int price[n],priceIncrease[n],sum = 0;
    for (int i=0;i<n;i++){
        cin >> price[i];
        sum += price[i];
    }
    for (int i=0;i<n;i++)cin >> priceIncrease[i];
    
    sort(priceIncrease,priceIncrease+n);
    //int extraPrice = 0;
    for (int i=0;i<n;i++){
        sum += priceIncrease[n-i-1]*(i);
        //cout<<priceIncrease[n-i-1]*(i)<<" ";
    }
    cout << sum;
}
*/
/*potatosalad
int main(){
    int N,D;cin>>N>>D;
    int M[N], sum = 0;
    for (int i=0;i<N;i++){
        cin >> M[i];
    }
    sort(M,M+N);
    for (int i=0;i<D;i++){
        sum += M[N-i-1];
    }
    cout<<sum;
}
*/
/*weddingcoins
int main(){
    long long n,min=0;cin >> n;
    int M[13] = {1000000,500000,100000,50000,10000,5000,1000,500,100,50,10,5,1};
    for (long long i=0;i<13;i++){
        if (n>=M[i]){
            min+=n/M[i];
            n=n%M[i];
            //cout<<M[i] <<" ";
        }
    }
    cout<<min;
}
*/
/*pandaeyes*/
bool cmp(pair<int, int> a, pair<int, int> b){
    int diffA = a.second - a.first;
    int diffB = b.second - b.first;
    return ((diffA<diffB)and(a.first < b.first));
}
int calAct(pair<int,int> og,int N,vector<pair<int,int>> M,int value){
    //cout<<"OG:"<<og.first<<"-"<<og.second<<"\n";
    for (int i=0;i<N;i++){
        //cout<<M[i].first<<"-"<<M[i].second<<" ";
        if (((M[i].first >= og.second) or (M[i].second <= og.first)))
        {
            //cout<<"("<<value+1<<")\n";
            M.erase(M.begin() + i);
            pair<int,int> range = make_pair(min(M[i].first,og.first),max(M[i].second,og.second));
            return calAct(range,N-1,M,value+1);
        }
    }
    //if (N==1){
    return value;//}
    
}
int main(){
    int N;cin>>N;
    vector<pair<int,int>> M;
    for (int i=0;i<N;i++){
        M.push_back(make_pair(0,0));
        cin >> M[i].first >> M[i].second;
    }
    sort(M.begin(),M.end(),cmp);
    /*for (int i=0;i<N;i++){
        cout<<M[i].first<<"-"<<M[i].second<<" ";
    }
    cout<<"\n";*/

    int activities[N];
    vector<pair<int,int>> M1 = M;
    for (int i=0;i<N;i++){
        activities[i] = calAct(M[i],N,M1,0);
        //cout<<"\nLLLLLLLLLLLLLLLL: "<<activities[i]<<"\n";
        //diff = M[i].second - M[i].first;
    }
    sort(activities,activities+N);
    /*for (int i=0;i<N;i++){
        cout<<activities[i]<<" ";
    }
    cout<<"\n";*/
    cout << activities[N-1];
 }

