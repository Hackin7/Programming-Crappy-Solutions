#include <bits/stdc++.h>
using namespace std;
int main(){
    map<int,int> memo;
    int frontsize = 0;int backsize = -1;

    long long N; cin >> N;
    deque<long long> bookshelf;
    deque<int>::iterator it;// = bookshelf.begin();
    char mode;long long k;
    for (int i=0;i<N;i++){
        cin >> mode;        
        switch(mode) {
            case '1' : 
                cin >> k;
                bookshelf.push_front(k);
                memo[k] = frontsize;
                frontsize++;
                break;
            case '2' : 
                cin >> k;
                bookshelf.push_back(k);
                memo[k] = backsize;
                backsize--;
                break;
            case '3' : 
                bookshelf.pop_front();
                frontsize--;
                break;
            case '4' : 
                bookshelf.pop_back();
                backsize++;
                break;
            case '5' :
                cin >> k;
                cout<<(frontsize-memo[k])<<endl;
                /*
                for(std::deque<long long>::size_type i=0; i != bookshelf.size(); i++) {
                        if (bookshelf[i]==k){cout<<i+1<<endl;break;}
                }*/
                break;
            case '6' : 
                cin >> k;
                cout<<(-backsize+memo[k])<<endl;
                /*
                for(std::deque<long long>::size_type i=bookshelf.size()-1; i>=0; i--) {
                        if (bookshelf[i]==k){cout<<bookshelf.size()-i<<endl;break;}
                }*/
                break;                
        }   
        
        //if (a[i].length()%2!=0)continue;
    }
    return 0;
}
