// Almost all subtasks, TLE for last one. Ended up as my final solution as i choked on better solutions
#include <bits/stdc++.h>
using namespace std;

// Weighted value for sorting
int sorting_value(char c){
	if (97 <= c && c <= 122){ //Lowercase
		return c-97;
	}else if (65 <= c && c <= 65+26){// Uppercase
		return 100 + c-65;
	}else if (48<= c && c <= 57){ // Digits
		return 200 + c-48;
	}
}

bool sorting_func(char a, char b){
	return sorting_value(a) < sorting_value(b);
}
int main() {
	string name; cin >> name;	
	vector<char> chars;
	for (char c : name){
		chars.push_back(c);
	}
	sort(chars.begin(), chars.end(), sorting_func);


	vector<char> untouched_chars;
	bool visited[128]; memset(visited, false, 128);
	bool done = false;
	while(true){
		for (char c : chars){
			if (visited[(int)c]){
				untouched_chars.push_back(c);
			}else{
				cout<<c;
				visited[c] = true;
			}
		}
		
		if (untouched_chars.size() > 0){
			cout<<"-";
			memset(visited, false, 128);
			//chars = untouched_chars;
			chars.clear();
			for (char c:untouched_chars){
				chars.push_back(c);
			}
			untouched_chars.clear();
		}else{
			break;
		}
		//break;
	}
	
}
