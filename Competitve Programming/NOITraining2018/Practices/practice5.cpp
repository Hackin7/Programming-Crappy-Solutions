#include <bits/stdc++.h>
using namespace std;

/*uniquenumbers
int main(){
    int N; cin >> N;
    int a[N];
    set<int> s;
    for (int i=0;i<N;i++){
        cin >> a[i];
        s.insert(a[i]);
        //if (a[i].length()%2!=0)continue;
    }
    
    cout << s.size();
    return 0;
}
*/
/*goodseq
int main(){
    long long N; cin >> N;
    long long input;
    multiset<long long> d;
    set<long long> s;
    for (int i=0;i<N;i++){
        cin >> input;
        s.insert(input);
        d.insert(input);
    }
    long long toRemove = 0;
    std::set<long long>::iterator it;
    for(it = s.begin(); it != s.end(); it++){
        //cout << d.count(*it) << " "; // outputs 2 7 10
        if (d.count(*it) > *it)toRemove+=d.count(*it)-*it;
        if (d.count(*it) < *it)toRemove+=d.count(*it);
    }
    //cout<<endl;
    cout << toRemove;
    return 0;
}
*/
/*uniquenumbers_ex
int main(){
    int N; cin >> N;
    string a[N];
    set<string> s;
    for (int i=0;i<N;i++){
        cin >> a[i];
        s.insert(a[i]);
        //if (a[i].length()%2!=0)continue;
    }
    
    cout << s.size();
    return 0;
}
*/
/* foreveralone
int main(){
    unsigned long long N,M; cin >> N >> M;
    unsigned long long cat[N];
    for (unsigned long long i=0;i<N;i++)cat[i]=0;
    
    unsigned long long data1, data2, foreveralone = N;
    
    for (unsigned long long i=0;i<M;i++){
        cin >> data1 >> data2;
        if (data1 != data2){ //if not friends with themselves
            if (cat[data1]==0){cat[data1]=1; foreveralone--;}
            if (cat[data2]==0){cat[data2]=1; foreveralone--;}
        }
    }
    cout << foreveralone;
    return 0;
}
 */

/*ballot
int diff(long long a, long long b){return abs(a-b);}
int main(){
    long long N, C; cin >> N >> C;
    long long input, index=0;
    set<long long> s;
    //pair<long long, long long> student;
    map<long long, long long> students;
    for (long long i=1;i<=N;i++){
        cin >> input;
        //student.first = input
        //student.second = i;
        s.insert(input);
        students[input] = i;
    }
    
    set<long long>::iterator higher;
    set<long long>::iterator lower;
    for (long long i=0;i<C;i++){
        cin >> input;
        lower = s.lower_bound(input);//greater than or equal to
        higher = lower;
        if (higher != s.begin())lower--;
         //cout<<diff(*higher,input)<<":"<<diff(*lower,input)<<endl;
        if (diff(*higher,input)<diff(*lower,input)){
            index = *higher;
            s.erase(higher);
        }
        else{
            index = *lower;
            s.erase(lower);
        }
        //cout<<index.second<<endl;
        cout <<students[index]<<endl;//index <<" "<< students[index]<<endl;
    }
    return 0;
}
*/

/*ccs
int main(){
    long long n,q;cin >> n >>q;
    string state;long long catFrom, catTo;
    set<long long> states;
    set<long long>::iterator it;
    for (long long i=0;i<q;i++){
        cin >> state >> catFrom;
        if (state=="SLEEP")states.insert(catFrom);
        else if (state=="WAKE")states.erase(catFrom);
        else if (state=="TRANSMIT"){
            cin >> catTo;
            it = states.lower_bound(catFrom);
            //cout << *it;
            if ((*it > catTo) or (states.size() == 0))
                cout<<"YES"<<endl;
            else if (*it <= catTo)cout<<"NO"<<endl;
        }
    }
}
*/
/*bookshelf
int main(){
    long long N; cin >> N;
    vector<long long> bookshelf;
    //long long *pos;//std::vector<int>::iterator it;// = bookshelf.begin();
    char mode;long long k;
    for (int i=0;i<N;i++){
        cin >> mode;
        switch(mode) {
            case '1' : 
                cin >> k;
                bookshelf.insert(bookshelf.begin(), k);
                break;
            case '2' : 
                cin >> k;
                bookshelf.push_back(k);
                break;
            case '3' : 
                bookshelf.erase(bookshelf.begin());
                break;
            case '4' : 
                bookshelf.pop_back();
                break;
            case '5' :
                cin >> k;
                //long long* pos = lower_bound(bookshelf.begin(), bookshelf.begin(), k);
                //cout<<pos+1<<endl;
                for(std::vector<long long>::size_type i=0; i != bookshelf.size(); i++) {
                        if (bookshelf[i]==k){cout<<i+1<<endl;break;}
                }
                break;
            case '6' : 
                cin >> k;
                //cout<<bookshelf.size()-pos<<endl;
                for(std::vector<long long>::size_type i=bookshelf.size()-1; i>=0; i--) {
                        if (bookshelf[i]==k){cout<<bookshelf.size()-i<<endl;break;}
                }
                break;                
        }   
        
        //if (a[i].length()%2!=0)continue;
    }
    return 0;
}
*/

/*cnyfood
int main(){
    long long N; cin >> N;
    long long input,size;
    set<long long> M[N];
    set<long long> total;
    for (long long i=0;i<N;i++){
        cin >> size;
        for (long long j=0;j<size;j++){
            cin >> input;
            M[i].insert(input);
            total.insert(input);
        }
        cout<<M[i].size()<<endl;
    }
    cout << total.size()<<endl;
    return 0;
}
*/

/*hellokitty*/
int manhattenDistance(pair<long long,long long> a,pair<long long,long long> b){
    return abs(a.first-b.first) + abs(a.second-b.second);
}
int main(){
    long long N; cin >> N;
    pair<long long,long long> input;//,a[N];
    set< pair<long long,long long> > houses;
    for (int i=0;i<N;i++){
        cin >> input.first >> input.second;
        //a[i] = input;
        houses.insert(input);
    }
    int M; cin >> M;
    long long sum;
    pair<long long,long long> shortlisted;
    set< pair<long long,long long> >::iterator it;
    for (int i=0;i<M;i++){
        cin >> shortlisted.first >> shortlisted.second;
        if (houses.count(shortlisted) > 0){
            cout<<"Cannot build here."<<endl;continue;}
        sum = 0;
        for (it = houses.begin(); it != houses.end(); it++ )
            sum += manhattenDistance(*it,shortlisted);
        cout<<sum<<endl;
        //manhattenDistance(
    }
    return 0;
}
