// Code I came up with right after the contest lmao. Made me rethink my life choices
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

char get_char(int value){
	if (value < 100){return value+97;}
	else if (value < 200){return value - 100 + 65;}
	else{return value - 200 + 48;}
}

bool sorting_func(char a, char b){
	return sorting_value(a) < sorting_value(b);
}
int main() {
	string name; cin >> name;	
	
	int chars[100];memset(chars, 0, sizeof(chars));
	for (char c : name){
		chars[sorting_value(c)] += 1;
	}
	
	bool f = true;
	while(f){
		f = false;
		
		for(int i=0;i<100;i++){
			if (chars[i] > 0){
				cout<<get_char(i);
				chars[i]--;
				//cout<<i<<','<<chars[i]<<endl;
				if (chars[i] > 0){f = true;}
			}
		}
		
		if (f){
			cout<<"-";
		}
	}
	
}
