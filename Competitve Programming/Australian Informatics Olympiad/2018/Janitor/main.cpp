#include <iostream>
using namespace std;
int r, c, q, s[11][100010], Next[4][2] = {{1,0},{-1,0},{0,1},{0,-1}}, sum, cx, cy, ch;

//Whether location has been filled with water
bool filled[11][100010];

void checkTile(int x, int y){
    int nx, ny; //Neighbouring coordinates
    
    //Assume is higher, should put water on it
    bool flag = true;
    //For neighbours
    for(int i = 0; i <= 3; i++){
        //Set next coordinates
        nx = x + Next[i][0], ny = y + Next[i][1];
        //Ignore if out of range
        if(nx < 1 || nx > r || ny < 1 || ny > c)continue;
        //If neighbour is higher, 
        if(s[nx][ny] > s[x][y]){flag = false; break;}
    }
    //Set pos to appropriate val
    if(filled[x][y] != flag){
        filled[x][y] = flag;
        //If its to be filled,  
        if(flag) sum++;
        //If its not to be filled
        else sum--;
    }
}
int main(){
    freopen("janitorin.txt", "r", stdin);
    freopen("janitorout.txt", "w", stdout);
    scanf("%d%d%d", &r, &c, &q);
    
    //Get Layout of map
    for(int i = 1; i <= r; i++)
        for(int j = 1; j <= c; j++)
            scanf("%d", &s[i][j]);

    //In map
    for(int i = 1; i <= r; i++)
        for(int j = 1; j <= c; j++)
            checkTile(i, j);
    //Number of tiles filled
    printf("%d\n", sum);

    for(int l = 1; l <= q; l++){
        scanf("%d%d%d", &cx, &cy, &ch);
        s[cx][cy] = ch;
        checkTile(cx, cy);
        int nx, ny;
        for(int i = 0; i <= 3; i++){
            nx = cx + Next[i][0], ny = cy + Next[i][1];
            if(nx < 1 || nx > r || ny < 1 || ny > c)continue;
            checkTile(nx, ny);
        }
        printf("%d\n", sum);
    }
    return 0;
}
