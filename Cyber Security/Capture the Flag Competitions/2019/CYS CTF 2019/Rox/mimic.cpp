#include <bits/stdc++.h>
using namespace std;
//**************************
int main() {
    printf("==============================\n");
    printf("Hi there! Enter the flag below \n");
    printf("==============================\nFlag> ");
    
    //uint32_t edx11;
    char user[128];fgets(user,128,stdin);
    //Get address of  Carriage return
    int rax7 = strcspn(user, "\r\n");//, stdin);
    user[rax7] = 0;// Remove Carriage return
    
    //Debugging, extra
    //for (int i=0;i<strlen(user);i++){cout<<user[i]<<",";}cout<<":Len"<<strlen(user)<<endl;

    int v9 = strlen(user);
    if (v9 == 26) {
        //Remove Carriage returns
        //xor(reinterpret_cast<int64_t>(rbp3) - 0x90, "\r\n", rdx6);
        
        int v10 = 0;
        while (v9 > v10) { //For every character in the string
            //Character array      Check each character
            char edx11 = user[v10] ;
            if (edx11 != 42) 
                goto fail2;
            ++v10;
        }
    } else {
        printf("Not the flag :(\r\n");
        goto quit1;//
    }
    
    printf("You got the flag!\r\n");
    
    
    quit1:
        return 0;
    fail2:
        printf("Not the flag :(\r\n");
        goto quit1;
}
