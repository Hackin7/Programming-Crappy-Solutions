#include <stdio.h>
#include <stdlib.h>
#include <string.h>


typedef struct Secrets {
    char secret1[50];
    char password[50];
    char birthday[50];
    char ssn[50];
    char flag[128];
} Secrets;


int vuln(){
    char name[7];

    Secrets boshsecrets = {
        .secret1 = "CTFs are fun!",
        .password= "password123",
        .birthday = "1/1/1970",
        .ssn = "123-456-7890",
    };


    FILE *f = fopen("flag.txt","r");
    if (!f) {
        printf("Missing flag.txt. Contact an admin if you see this on remote.");
        //exit(1);//
    }
    //fgets(&(boshsecrets.flag), 128, f);
    strcpy(boshsecrets.flag,"AAAAAAAA");

    puts("Name: ");

    //fgets(name, 6, stdin);
    strcpy(name, "%s");//Modify here to test in cutter

    printf("Welcome, ");
    printf(name);
    printf("\n");

    return 0;
}


int main(){
    setbuf(stdout, NULL);
    setbuf(stderr, NULL);

    vuln();

    return 0;
}
