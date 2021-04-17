#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void setup_IO()
{
    setvbuf(stdin, NULL, _IONBF,0);
    setvbuf(stdout, NULL, _IONBF,0);
}

void shell(int checker)
{
    char command[8] = "/bin/sh\x00";

    if (checker == 0xDEADBEEF) {
        system(command);
    } else {
        puts("Unauthorized.");
    }
}

int main()
{
    char contact[64];

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
    puts("                         Stage 3: Call Me Maybe?");
    puts("=========================================================================");
    printf("Enter Contact => ");

    scanf("%s", contact);

    printf("Calling %s...\n", contact);

    return 0;
}
