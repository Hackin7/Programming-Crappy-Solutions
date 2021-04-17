#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char COMMAND[8] = "/bin/ls\x00";

void setup_IO()
{
    setvbuf(stdin, NULL, _IONBF,0);
    setvbuf(stdout, NULL, _IONBF,0);
}

void shell()
{
    system(COMMAND);
}

int main()
{
    char username[256];

    setup_IO();

    puts(" _______  _     _  __    _  _______  __   __  _______  _______  ______   ");
    puts("|       || | _ | ||  |  | ||       ||  | |  ||       ||       ||    _ |  ");
    puts("|    _  || || || ||   |_| ||_     _||  | |  ||_     _||   _   ||   | ||  ");
    puts("|   |_| ||       ||       |  |   |  |  |_|  |  |   |  |  | |  ||   |_||_ ");
    puts("|    ___||       ||  _    |  |   |  |       |  |   |  |  |_|  ||    __  |");
    puts("|   |    |   _   || | |   |  |   |  |       |  |   |  |       ||   |  | |");
    puts("|___|    |__| |__||_|  |__|  |___|  |_______|  |___|  |_______||___|  |_|");
    puts("");
    puts("=========================================================================");
    puts("                         Stage 4: FileLister");
    puts("=========================================================================");
    printf("Enter Username => ");

    fgets(username, 63, stdin);

    printf("Greetings ");
    printf(username);
    printf("Here are my files!\n");

    shell();

    return 0;
}
