#include <bits/stdc++.h>
using namespace std;

/*esej skipped
int main(){
    int N, noNiceWords = 0; cin >> N;
    string a[N];
    for (int i=0;i<N;i++){
        cin >> a[i];
        if (a[i].length()%2!=0)continue;
    }
    
    
    cout << noNiceWords;
    return 0;
}
*/

void priorityQueuePrint(priority_queue<int> q)
{
    priority_queue<int> demo;
    int size = q.size();
    for (int i=0;i<size;i++){
        cout << demo.top()<<" ";
        demo.pop();
    }
    cout<<endl;
}
void arrayPrint(long n,long long* a,long start,long end){
    for (long i=start;i<=end;i++)cout<<a[i]<<" ";
    cout<<"\n";
}
/* sortarray 
int main(){
    //noSubArrays is at minimum
    long N, noSubArrays = 1; cin >> N;
    long long a[N];
    for (long i=0;i<N;i++)cin >> a[i];
    
    long long array[N];
    int mode = 1;//1 for ascending, 0 for descending
    if (N>1 and a[0]>a[1])mode=0;
    else if (N>1 and a[0]<a[1])mode=1;

    array[0] = a[0];
    for (long i=1;i<N;i++){
        //if not ascending
        if (a[i]<a[i-1] and mode == 1){
            noSubArrays++;
            long limit = i+1;
            while (N>limit and a[limit-1]==a[limit]) limit++;
            if (N>limit and a[limit-1]>a[limit])mode=0;
            else mode=1; //else if (N>=limit and a[limit-1]<a[limit])mode=1;
            //arrayPrint(N,array,0,i-1);cout<<limit<<"Mode:"<<mode<<"a:"<<a[limit-1]<<"a2:"<<a[limit]<<endl;
        }         
        else if (a[i]>a[i-1] and mode == 0){
            noSubArrays++;
            
            long limit = i+1;
            while (N>limit and a[limit-1]==a[limit]) limit++;
            if (N>limit and a[limit]>a[limit+1])mode=0;
            else mode=1; //else if (N>=limit and a[limit-1]<a[limit])mode=1;           
            //arrayPrint(N,array,0,i-1);cout<<limit<<"Mode:"<<mode<<"a:"<<a[limit-1]<<"a2:"<<a[limit]<<endl;
        }         
        array[i] = a[i];
        
    }
    
    
    cout << noSubArrays;
    return 0;
}
*/

/*EKSPLOZIJA */
int main(){
    string mirko;cin>>mirko;
    string explosion;cin>>explosion;
    cout<< explosion.length();
    
    bool explosion = true;
    while (explosion){
        for (int i=0;i<mirko.length()-explosion.length();i++){
            //if (mirko.substr(
        }
    }
    return 0;
}
