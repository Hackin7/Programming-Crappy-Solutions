#include <bits/stdc++.h>
using namespace std;

#define N 1000000 // No of nodes
string id_to_name[N];
map<string, int> name_to_id;
int id_department[N];

int department_no[3]; //No who went
int department_max[3];

int parent[N];
int group_size[N];
int max_size = 1, max_size_group=0;

int root(int x) {
    //x--;
    if (parent[x]==-1) return x;
    return parent[x] = root(parent[x]);
}
bool isConnected(int x, int y) {
    return root(x) == root(y);
}
void connect(int x, int y) {
    int rootX = root(x);
    int rootY = root(y);
    if(rootX != rootY){
        cout<<"Connecting ";
        parent[rootX] = rootY; // Y is root of X

        // Make new size
        group_size[rootX] = group_size[rootX] + group_size[rootY];
        group_size[rootY] = -1;
        if (group_size[rootX] > max_size){
            max_size_group = rootX;
            max_size = group_size[rootX];
        }else if (group_size[rootX] == max_size && rootX < max_size_group ){
            max_size_group = rootX;
        }
    }
}

int find_id(string name){
    for (int i=0;i<N;i++){
        if (name == id_to_name[i]) return i;
    }
    cout << "\n" << name << "CANNOT FIND NAME ";
    for (int i=0;i<10;i++){
        cout<<id_to_name[i]<<" ";
    }
    return -1;
}

int main()
{
    for (int i=0;i<N;i++){id_to_name[i]="";}
    memset(id_department, 1, N);
    memset(parent, -1, N);

    //memset(group_size, 1, N);
    for (int i=0;i<N;i++){group_size[i]=1;}

    int n, m, a, b, f, s, t;
    cin >> n >> m >> a >> b >> f >> s >> t;

    department_no[0] = 0;
    department_no[1] = 0;
    department_no[2] = 0;

    department_max[0] = f;
    department_max[1] = s;
    department_max[2] = t;

    for (int i=0;i<n;i++){
        string name;int d; cin >> name >> d;
        id_to_name[i] = name;
        //cout<<'\n'<<name<<'\n';
        id_department[i] = d-1;
    }

    for (int i=0;i<m;i++){
        string name1, name2; cin >> name1 >> name2;
        //int aa=name_to_id[name1], bb=name_to_id[name2];
        int aa = find_id(name1), bb = find_id(name2);
        int dpt_aa = id_department[aa], dpt_bb = id_department[bb];
        int new_group_size= group_size[aa] + group_size[bb];
        cout<<group_size[aa]<<"_"<< new_group_size << ":" << department_no[dpt_aa] << ":" << department_no[dpt_bb]<<"\n";
        if (new_group_size <= b &&
            department_no[dpt_aa] < department_max[dpt_aa] &&
            department_no[dpt_bb] < department_max[dpt_bb]){
                connect(aa, bb);
                department_no[dpt_aa]++;
                department_no[dpt_bb]++;
        }
    }
    cout << " " << max_size_group << " ";

    for(int i=0;i<n;i++){cout<<group_size[i];}
    return 0;
}
