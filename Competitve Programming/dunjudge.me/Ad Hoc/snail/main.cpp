//With reference to https://github.com/ranaldmiao/sg_noi_archive/tree/master/2018_prelim/solution_writeup

#include <bits/stdc++.h>
using namespace std;

#define INF 1012345678012345678LL
#define BIG 1000000000000LL
typedef long long ll;

// height, number of phases, phase
ll H;int N; ll P[10010];
ll simulate[20010];
bool printed = 0;
int main(void) {
    cin>>H>>N;
    for (int i=0;i<N;i++){cin>>P[i];}

    //Simulate for the first 2 days
    simulate[0] = 0; // height at start of each phase
    for (int i=0;i<2*N;i++) { // people may forget this
        simulate[i+1] = max(simulate[i]+P[i%N], 0LL); // people may leave out max
        //If it exceeds the time
        if (simulate[i+1] >= H){
            cout<<i/N<<" "<<i%N<<"\n";return 0;
        }
    }
    ll increment = 0; // The Total Increment each cycle
    for (int i=0;i<N;i++) {
        increment += P[i]; // should not overflow, but can underflow
        // oh no what if it underflows?
        if (increment <= -H) { // if it ever goes back above 0, then it must be possible within first 2N phases
            cout<<"-1 -1\n";return 0;
        }
    }
    ///////////////////////////////////////////////////////////
    // check if it goes negative anywhere
    if (increment <= 0) {
        // not possible anymore
        cout<<"-1 -1\n";return 0;
    } else {
        ll bestDays = INF;
        int phase = 0;
        for (int i=0;i<N;i++) { //For each possible phase, what is the possible day
            //Find the days from the height
            ll days = 1+(H-simulate[N+i+1]+increment-1)/increment;
            if (bestDays > days) {
                bestDays = days;
                phase = i;
            }
        }
        cout<<bestDays<<" "<<phase<<"\n";return 0;
    }
}
