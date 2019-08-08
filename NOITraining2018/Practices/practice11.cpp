#include <bits/stdc++.h>
using namespace std;

/*lunchbox
int main(){
    int N,m;cin>>N>>m;
    int k[m];
    for (int i=0;i<m;i++){
        cin>>k[i];
    }
    sort(k,k+m);
    
    int sum=0,no=0;
    for (int i=0;i<m;i++){
        sum+=k[i];no++;
        //cout<<k[i]<<"_"<<sum<<":";
        if (sum>N){
            sum-=k[i-1];no--;break;
        }
    }
    cout<<no;//<<" "<<sum;
    return 0;
}
*/
/*change
int main(){
    long changeVal[4] = {5,10,20,50};
    long long change[4],used[4],money;// fill(used,used+4,0);
    cin >> change[0]>>change[1]>>change[2]>>change[3]>>money;
    long long coins = 0;
    for (long i=4-1;i>=0;i--){
        used[i] = min(change[i],money/changeVal[i]);
        coins += used[i];
        money-=(changeVal[i]*used[i]);
    }
    if (money==0){
        for (auto i:used){cout<<i<<" ";}
        cout<<coins;
    }else{cout<<-1;return 0;}
        
    return 0;
}
*/
/*paint
int main(){
    int N;cin>>N;
    int sum=0;
    for (int i=0;i<N;i++){
        int val;cin >> val;
        sum+=val;
    }

    int k[N];
    for (int i=0;i<N;i++){
        cin>>k[i];
    }
    sort(k,k+N,std::greater<int>());
    for (int i=0;i<N;i++){
        //cout<<k[i]*i<<endl;
        sum+=k[i]*i;
    }
    cout<<sum;
}*/
/*card
deque<int>cards;
void a(){
    int moved = cards.front();
    cards.pop_front();
    cards.push_back(moved);
}
void b(){
    int stay = cards.front();
    int moved = cards[1];
    cards.pop_front();cards.pop_front();
    cards.push_front(stay);
    cards.push_back(moved);
}
void show(){
    for (auto c:cards){
        cout<<c<<" ";
    }
    cout<<endl;
}
int main(){
    int m,k;string steps;cin>>m>>k>>steps;
    for (int i=0;i<m;i++)cards.push_back(i);
    //show();
    for (auto c:steps){
        switch (c){
            case 'A': a();break;
            case 'B': b();break;
        }
        //show();
    }
    cout<<cards[k-1]<<" "<<cards[k]<<" "<<cards[k+1];
}
*/

/*lvm
stack<int> s;
int reg=0;//register is garbage
int main(){
    int steps;cin>>steps;
    string commands[steps];int x[steps];fill(x,x+steps,0);
    for (int i=0;i<steps;i++){
        cin >> commands[i];
        if (commands[i]=="PUSH" or commands[i]=="IFZERO")
            cin>>x[i];
    }
    for (int i=0;i<steps;i++){
        //cout<<commands[i]<<":"<<i<<" ";
        if (commands[i]=="DONE"){
            cout<<s.top();
            break;
        }
        else if (commands[i]=="PUSH"){
            s.push(x[i]);
        }
        else if (commands[i]=="STORE"){
            reg=s.top();
            s.pop();
        }
        else if (commands[i]=="LOAD"){
            s.push(reg);
        }
        else if (commands[i]=="PLUS"){
            int sum = s.top();s.pop();
            sum+= s.top();s.pop();
            s.push(sum);
        }
        else if (commands[i]=="TIMES"){
            int product = s.top();s.pop();
            product*= s.top();s.pop();
            s.push(product);
        }
        else if (commands[i]=="IFZERO"){
            if (s.top() == 0)i=x[i]-1;   
            s.pop();               
        }
    }
    return 0;
}
*/

/*housing*/
int factorial(int a, int times){
    if (a==0 or times == 0) return 1;
    return a * factorial(a-1, times-1);
}
int excessDist(int groups, int excess){
    return factorial(excess,groups)/factorial(groups,groups);
}
int m(int n){
    if (n<5)return 0;
    int times=1;//for group 1
    for (int groups=2;groups<=n/5;groups++){
        int diff=n-(5*groups);
        cout << groups<<":"<<diff<<":"<<excessDist(groups,diff)<< endl;
        times+=excessDist(groups,diff);
    }
    return times;
}
int main(){
    int n;cin>>n;
    cout<<m(n);
}
