#include <bits/stdc++.h>
using namespace std;

/*calculator2
int main(){
    int x,y,pressed = 0;cin>>x>>y;
    int mode = 0;
    while (not(x==y)){
        cout<<x<<" "<<y<<" "<<pressed<<"\n";
        if (x<y and x>0){mode = 1;}
        else if (x<y and x<0){mode = 2;}
        else if (x>y and x>0){mode = 3;}
        else if (x>y and x<0){mode = 4;}
        
        //All Modes (1)
        if (abs(x)<abs(y)) // and ((x<0 and y<0)or(x>0 and y>0))
        {x++;pressed++;continue;}//A}
        
        //Mode 2
        if (x>y and x<0){x = -x;pressed++;continue;}//B}    
        
        //Mode 3
        
        
        //Mode 4       
        if (abs(x)==abs(y) and x!=y){x = -x;pressed++;continue;}//B
            
        //if (x<y and x>0){x++;pressed++;continue;}//A}
        if (x<y and x<0){x = -x;pressed++;continue;}//B}
        if (x>y and x>0){x = -x;pressed++;continue;}//B}
        
    }
    cout<<pressed;
    return 0;
}
*/

/*candies2
int main(){
    long n,x,operations = 0;
    cin>>n>>x;
    long a[n];
    for (long i = 0;i<n;i++){
        cin >> a[i];
    }

    for (long i=0;i<n-1;i++){
        if (a[i] > x){
            operations+=(a[i]-x);
            a[i]-=(a[i]-x);
        }
        if (a[i]+a[i+1]>x){
            //cout<<"h"<<(a[i]+a[i+1]-x)<<"\n";
            operations+=(a[i]+a[i+1]-x);
            a[i+1]-= (a[i]+a[i+1]-x);
        }
        //cout <<operations<<"\n";
    }
    cout<<operations;
    return 0;
}
*/

/*merchant2
int main(){
    long n,t,minTotal = 0;
    cin>>n>>t;
    long a[n];
    for (long i = 0;i<n;i++){
        cin >> a[i];
    }
    
    long maxpos = 0,minpos=0, diff = a[1]-a[0] ;
    
    for (long i = 0;i<n;i++){
        for (long j = i+1;j<n;j++){
            //cout<<(a[j]-a[i])<<" ";//diff;
            if (a[j]-a[i] > diff){
                diff = a[j]-a[i];
                //cout<<"diff"<<diff<<"_";
                maxpos = j;minpos=i;
            }
        }
    }
    long takaProfit = (a[maxpos]-a[minpos])*t/2;
    cout<<minpos<<" "<<maxpos<<" "<<takaProfit<<"\n";
    minTotal = t/2;
    cout<<minTotal;
    return 0;
}
*/

/*burger*/
int error(int k,int *d){
    int value = 0;
    int a[k];
    for (int i=0;i<k/2;i++){
        a[i] = i;
    }
    if (k%2!=0){a[k/2] = k/2;}
    cout<<1+k/2<<":";
    for (int i=0;i<k/2;i++){
        a[k-1-i] = i;
    }    
    //for (int i=0;i<k;i++){cout<<a[i]<<"-";}cout<<"\n";
    for (int i=0;i<k;i++){
        value += (d[i]-a[i])*(d[i]-a[i]);
        //cout<<d[i]<<"-"<<a[i]<<":"<<value<<" ";
    }
    //value+= (a[0]-d[k-1])*(0-d[k-1]);//(0-d[0])*(0-d[0]);
    return value;
}
int main(){
    int t;cin>>t;
    for (int cas=0;cas<t;cas++){
        int k;cin>>k;
        int d[k];
        for (int i=0;i<k;i++){
            cin>>d[i];
        }
        sort(d,d+k);
        
        int symmetry[k],j=0;
        for (int i=0;i<k;i+=2){
            symmetry[j] = d[i];j++;
        }
        if (k%2==1){
            //symmetry.push_back(d[k-1]);
            for (int i=k-1;i>0;i-=2){
                symmetry[j] = d[i];j++;
            }
        }
        else if (k%2==0){
            for (int i=k-1;i>0;i-=2){
                symmetry[j] = d[i];j++;
            }
        }
        
        //for (int i=0;i<k;i++){cout<<d[i];}cout<<"\n";      for (int i=0;i<k;i++){cout<<symmetry[i];}cout<<"\n";
        int y = error(k,symmetry);
        cout<<"Case #"<<cas+1<<": "<<y;//<<"\n";
        if (cas!=t-1){cout<<"\n";}
    }
    return 0;
    
}
