#include <bits/stdc++.h>
using namespace std;

int main() {
    int h, w; cin >> h >> w;
    char c; int O=0, N=0;
    for (int i=0; i<h*w; i++){
        cin >> c;
        if (c=='*'){O++;}
        if (c=='X'){N++;}
    }

    cout << O << endl;
    return 0;
}
