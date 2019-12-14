#include <bits/stdc++.h>
using namespace std;


int main(){

    int N,E;cin>>N>>E;
vector < pair <int ,int > > adjlist [ N+1 ];
    int n1,n2,w;
    for (int i=0;i<E;i++){
        cin>>n1>>n2>>w;
        adjlist[n1].push_back(make_pair(n2,w));
        adjlist[n2].push_back(make_pair(n1,w));
    }

    cout<<"Input in"<<endl;
    int source = 1;
// node , weight
priority_queue < pair <int ,int >,vector < pair <int ,int > >,greater < pair <int ,int > > > pq ; // distance , node
bool visited [ N ];
fill ( visited , visited + N , false ) ;
pq.push( make_pair(0 , source )) ;
int total_weight = 0;
while (! pq . empty () ) {
    pair <int ,int > u = pq . top () ;
    pq . pop () ;
    if ( visited [ u . second ]) continue ;
        total_weight += u . first ;
    for ( pair<int, int> v : adjlist [ u . second ]) {
        pq.push( make_pair(v.second , v.first )) ;
    }
}
cout<<total_weight;

}
