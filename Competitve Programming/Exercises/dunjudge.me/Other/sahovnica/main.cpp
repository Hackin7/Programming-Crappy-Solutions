#include <bits/stdc++.h>
using namespace std;

int main(){
    int R,C,A,B; cin>>R>>C>>A>>B;
    for (int i=0;i<R*A;i++){
        for(int j=0;j<C*B;j++){
            if ((j/B)%2==(i/A)%2){
                cout<<"X";
            }else{cout<<".";}
        }cout<<endl;
    }
    return 0;
}
