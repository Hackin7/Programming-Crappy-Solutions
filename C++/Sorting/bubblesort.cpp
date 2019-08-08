#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;cin >> n; //Enter Length of array
    int a[n];
    //Enter elements of array from a0 to an
    for (int i=0;i<n;i++)cin >> a[i];
    for (int i=0;i<n-1;i++){
        for (int j=0;j<n-1;j++){
            if (a[j]>a[j+1]){
                int x=a[j],y=a[j+1];
                a[j]=y;a[j+1]=x;
            }
        }
    }
    //Presentation
    for (int i=0;i<n;i++){
        cout << a[i];
        if (i!=n-1)cout<<" ";
    }
    return 0;
}
