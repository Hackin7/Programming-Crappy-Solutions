#include <bits/stdc++.h>
using namespace std;
/*logsort
int main(){
    int n,input;cin >> n;
    priority_queue<int> a;
    for (int i=0;i<n;i++){
        cin>>input;
        a.push(input);
    }
    int sorted[n];
    for (int i=0;i<n;i++){
        sorted[n-i-1] = a.top();
        //cout<<a.top()<<endl;
        a.pop();
    }
    for (int i=0;i<n;i++)cout<<sorted[i]<<endl;
    return 0;
}
*/
/*catlunch
int main(){
    long long n,k,input;cin >> n >> k;
    priority_queue<long long> q;
    for (long long i=0;i<k;i++){
        cin>>input;
        q.push(input);
    }

    long long max_sum=0,current_sum=0;
    for (long long i=0;i<n-k;i++){
        current_sum+=q.top();
        q.pop();
        if (current_sum>max_sum)max_sum = current_sum;
        cin>>input;q.push(input);
    }
    for (long long i=0;i<q.size();i++){
        current_sum+=q.top();
        q.pop();
        if (current_sum>max_sum)max_sum = current_sum;
    }
    cout<<max_sum;
    return 0;
}
*/
/*contestcalc
int main(){
    long long n;cin >> n;
    string input;
    map<string,long long> contest;
    for (long long i=0;i<n;i++){
        cin>>input;
        cin >> contest[input];
    }
    long long c,sum=0;cin >> c;
    for (long long i=0;i<c;i++){
        cin >> input;
        sum+=contest[input];
    }
    cout << sum/c;
    return 0;
}
*/
/*ballot*/
int main(){
    long long n,c;cin>>n>>c;
    long long input;
    set<long long> s;
    for (long long i=0;i<n;i++){
        cin<<input;
        s.insert(input);
    }
    for (long long i=0;i<c;i++){
        cin<<input;
    }
    return 0;
}
