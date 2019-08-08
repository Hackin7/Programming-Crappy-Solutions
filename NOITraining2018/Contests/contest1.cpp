#include <bits/stdc++.h>
using namespace std;

/*tuna
int main() {
    int n,x,totalValue = 0;
    cin>>n>>x;
    int p1[n],p2[n],p3[n];
    for (int i = 0;i<n;i++){
        cin >> p1[i] >> p2[i];
        
        if (abs(p1[i]-p2[i]) <= x){
            if (p1[i]>p2[i]){totalValue+=p1[i];}
            else{totalValue+=p2[i];}
        }
        else if (abs(p1[i]-p2[i]) > x){
            cin >> p3[i];
            totalValue += p3[i];
        }
    }   
    
    //Output
    cout << totalValue;
    return 0;
}
*/

/*rockpaper
#include <string>
int main(){
    string s;
    std::getline(std::cin, s);
    int n = s.length();
    int maxAtScore = 0;//, paper = 0, rock = 0,  n;
    
    //(※) After each turn, (the number of times the player has played Paper)≦(the number of times the player has played Rock
    // (the number of turns where the player wins) - (the number of turns where the player loses)
    
    int diffAt = 0;//, diffTop=0;//rock-paper
    
    for (int i=0;i<n;i++){
        //cout<<diffAt<<"\n";
        if (s[i] == 'g'){//top rock, at paper
            //rock += 1;
            if (diffAt<=0){ //Rock
                diffAt+=1;
                //maxAtScore-=1;
                //cout << "RockRock";
            }
            else{//Paper
                diffAt-=1;
                maxAtScore+=1;
                //cout<<"RockPaper";
            }
        }//diffTop+=1}
        else if (s[i] == 'p'){//Top paper, At rock
            //paper += 1;
            if (diffAt>0){ //Give paper
                diffAt-=1;
                //cout<<"PaperPaper";
            }
            else{
                diffAt+=1;
                maxAtScore-=1;
                //cout<<"PaperRock";
            }
        }
    }
    cout << maxAtScore;
    return 0;
}
*/

/* grouping2 
int main(){
    int n;cin >> n;
    
    int x = 0;
    x = n/3;
    cout << x;
    return 0;
}
*/
/* cezar 
int main(){
    int n;
    cin >> n;
    int v[n];
    int sum=0;//, totalSum = 365;
    int cardDist[13] = {4,4,4,4,4,4,4,4,4,4,4,4,4};
    for (int i=0;i<n;i++){
        cin >> v[i];
        sum+=v[i];
        //totalSum -= v[i];
        cardDist[v[i]-1]-=1;
    }    
    int x = 21-sum;//, remainingCards = 52-n;  
    
    //Processing
    int greater = 0, smaller = 0;
    for (int i=0;i<13;i++){
        //cout<<((i+2)>x)<<" ";
        if ((i+2)>x)greater+=cardDist[i];// 9*(i+1);
        else if ((i+2)<=x)smaller+=cardDist[i];// *(i+1);
    }
    //cout<<"\n"<<greater<<" "<<smaller<<"\n";
    if ( greater<smaller){cout << "VUCI";}
    else {cout << "DOSTA";} 
    return 0;
}
*/
/*baza*/
/*baza
int main(){
    int N, M;cin>>N>>M;
    int A[N][M];
    for (int l=0;l<N;l++){
        for (int c=0;c<M;c++){
            cin >> A[l][c];
        }
    } 
    int Q;cin>>Q;
    int B[Q][M],X[Q];
    for (int l=0;l<Q;l++){
        for (int c=0;c<M;c++){
            cin >> B[l][c];
        }
        int count = 0;
        for (int l1=0;l1<N;l1++){
            //Check Each item in list
            for (int c1=0;c1<M;c1++){
                //cin >> A[l][c];
                //cout<<A[l1][c1]<<"_"<<B[l][c1]<<" ";
                if ((A[l1][c1] == B[l][c1]) or (B[l][c1] == -1)){
                    if (c1 == M-1){count += 1;}
                    continue;
                }
                else{break;}
            }
            //cout << "\n";
        }
        X[l] = count;//identicalNoAsQuery(N,M,A,B[l])
    } 
    for (int i=0;i<Q;i++){
        cout <<X[i]<<"\n";
    }
    return 0;
}
*/

//Extra Intermediate
/*goodseq*/
#include <set>
int main(){
    int N;cin >> N;
    int a[N],remove=0;
    std::set<int> S;
    for (int i=0;i<N;i++){
        cin >> a[i];
        S.insert(a[i]);
    }
    int per = 0;
    for (set<int>::iterator it=S.begin(); it != S.end(); ++it){ 
        per = 0;
        //cout << *it << endl;
        for (int i=0;i<N;i++){
            if (a[i] == *it){per += 1;}
        }
        if (per<*it){remove+=per;}
        else if (per>*it){remove+=(per-*it);}
    }
    cout << remove;
    return 0;
}
