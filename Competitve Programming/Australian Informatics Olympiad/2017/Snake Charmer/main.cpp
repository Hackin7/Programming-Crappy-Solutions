#include <bits/stdc++.h>
#include <fstream>
using namespace std;
struct location{
    int x=0, y=0;
    string dir="N";
    string path = "";
};
deque<location> neighbour(deque<location> queue,location pos, int x, int y){
    location posL = pos, posR = pos;
    posL.path = pos.path + "L";
    posR.path = pos.path + "R";
    if (pos.dir == "N"){
        posL.x = pos.x-1;posR.x = pos.x+1;
        posL.dir = "W";posR.dir = "E";
    }else if(pos.dir == "S"){
        posL.x = pos.x+1;posR.x = pos.x-1;
        posL.dir = "E";posR.dir = "W";
    }else if(pos.dir == "E"){
        posL.y = pos.y+1;posR.y = pos.y-1;
        posL.dir = "N";posR.dir = "S";
    }else if(pos.dir == "W"){
        posL.y = pos.y-1;posR.y = pos.y+1;
        posL.dir = "S";posR.dir = "N";
    }
    int limit = 2;
    if (!((posL.x > x+limit && x>0) || (posL.x < x-limit && x<0) || 
          (posL.y > y+limit && y>0) || (posL.y < y-limit && y<0)) ){
        queue.push_back(posL);
    }
    if (!((posR.x > x+limit && x>0) || (posR.x < x-limit && x<0) || 
          (posR.y > y+limit && y>0) || (posR.y < y-limit && y<0)) ){
        queue.push_back(posR);
    }
    return queue;
}

string bfs(int x, int y, int x1, int y1){
    deque<location> queue;
    location origin;
    origin.x = x, origin.y = y;
    queue.push_back(origin);
    
    location current;
    while (!queue.empty()){
        current = queue.front();
        queue.pop_front();
        cout<<"("<<current.x<<","<<current.y<<")\n";
        if (current.x == x1 && current.y == y1){
            break;
        }
        queue = neighbour(queue, current, x1, y1);
        cout<<queue.size();
    }
    return current.path;
}
int main(){
    ifstream infile; 
    infile.open("snakein.txt"); 
    int x, y; // y represents no moves made
    infile >> x >> y;
    infile.close();
    
    string ans=bfs(0,0,x, y);

    cout << ans;
    
    ofstream outfile;
    outfile.open("snakeout.txt");
    outfile << ans;
    outfile.close();
}
