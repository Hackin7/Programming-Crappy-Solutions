#include <iostream>
#include <bits/stdc++.h>
using namespace std;

//80%
int r, c;
int mapval(int x, int y){return y*r + x;}

void BFS(bool* visited, string map, int s) 
{ 
    list<int> queue; 
    queue.push_back(s); 
  
    list<int>::iterator i; 
    list<int> neighbours;
    while(!queue.empty()) 
    { 
        // Dequeue a vertex from queue and print it 
        s = queue.front(); 
        //cout << s << " "; 
        queue.pop_front(); 
        
        neighbours.clear();
        int x = s%r, y = s/r;
        //cout<<"("<<x<<","<<y<<")";
        
        if (x-1 >= 0){neighbours.push_back(mapval(x-1,y));}
        if (x+1 < c){neighbours.push_back(mapval(x+1,y));}
        if (y-1 >= 0){neighbours.push_back(mapval(x,y-1));}
        if (y+1 < c){neighbours.push_back(mapval(x,y+1));}
        
        //cout<<"[";
        for (i = neighbours.begin(); i != neighbours.end(); ++i) 
        { 
            //cout<<*i<<",";
            if (!visited[*i] && map[*i] == 'H') 
            { 
                visited[*i] = true; 
                queue.push_back(*i); 
            } 
        } 
        //cout<<"]";
    } 
    //cout<<endl;
} 
int main() {
    cin >> r >> c;
    string map;
    for (int i=0; i < r; i++){
        string h;cin >> h;map+=h;}
    
    
    bool visited[r*c]; fill(visited, visited+r*c, false);
    int h = 0;
    for (int i=0; i<r*c; i++){
        if (visited[i] == true){continue;}
        visited[i] = true;
        
        if (map[i] == '.'){continue;}
        if (map[i] == 'H'){
            BFS(visited, map, i);
            h++;
        }
        
    }
    
    cout << "Oh, bother. There are "<<h<<" pools of hunny.";
    return 0;
}

