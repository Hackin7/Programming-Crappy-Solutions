#include "thanossort.h"
#include <bits/stdc++.h>

//Find the longest contiguous increasing subseqence
// and check if it is within boundaries (eg. Does not cross the middle)
typedef pair<int,int> ipair;
typedef tuple<int,int,int> group;
int thanosSort(int N){
    int maxsize=0;
    
    int curr;
    deque<group> queries;//Stack: size,left value, right value
    for (int x=1;x<=N;x++){
        curr=nextInt();
        
        
        if (queries.size()==0){ //add size
            queries.push_back(make_tuple(1,curr,curr));
        }else{
            int size=1,rleft=curr,rright=curr;
            bool merged=1;
            while (queries.size() > 0){//Untill thing is cleared
                auto l=queries.back();
                int lsize=get<0>(l),lleft=get<1>(l),lright=get<2>(l);
                cout<<curr<<":"<<size<<":"<<lsize<<" "<<lleft<<endl;
                
                if (lright<=rleft && lsize==size){
                    queries.pop_back();
                    cout<<"/";
                    rleft=lleft;
                    size+=lsize;maxsize=max(maxsize,size);
                }
                else{
                    //
                    //queries.clear();
                    //merged=0;
                    break;
                }
            }
            if (merged){queries.push_back(make_tuple(size,rleft,rright));}
            for (group l:queries){
                    int lsize=get<0>(l),lleft=get<1>(l),lright=get<2>(l);
                    cout<<"   "<<lsize<<" "<<lleft<<","<<lright<<endl;
                }
        }
    }

    return maxsize;
}
