#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

/* gcc -o revenge revenge.c */

// Global State Variables
// Store money value in cents
// as float dollar values are inaccurate
int piggy_cents = 1337*100;
int user_cents  = 100*100;

#define clear() printf("\033[H\033[J")
void initialise(){
	// Unimportant Initialisation
	setvbuf(stdin, NULL, _IONBF, 0);
	setvbuf(stdout, NULL, _IONBF, 0);
	// Print Banner
	printf("  ___ _                  ___            _   \n | _ (_)__ _ __ _ _  _  | _ ) __ _ _ _ | |__\n |  _/ / _` / _` | || | | _ \\/ _` | ' \\| / /\n |_| |_\\__, \\__, |\\_, | |___/\\__,_|_||_|_\\_\\\n       |___/|___/ |__/                      \n                 __,---.__\n            __,-'         `-.\n           /_ /_,'           \\&\n           _,''               \\\n          (\")            .    |\n           ``--|__|--..-'`.__|\n");
	sleep(1);
	clear();
}

void print_menu(){
	// Show Current State
	printf("Piggy Bank value: $%d.%02d\n", piggy_cents/100, piggy_cents%100);
	printf("Wallet value:     $%d.%02d\n", user_cents/100, user_cents%100);
	puts("");
	// Show Options
	printf("1) Deposit INTO Piggy\n2) Withdraw FROM Piggy\n3) Buy flag\n4) Exit\n\n");
}

int get_choice(){
	print_menu();
	int choice;
	printf("Your choice: ");
	scanf("%d", &choice);
	puts("");
	return choice;
}

void deposit(){
	int amount;
	printf("How much would you like to DEPOSIT?\n");
	printf("> $");
	scanf("%d", &amount);
	// HOTFIX
	if(amount < 0){
		printf("[-] Error: No negative values!\n");
		return;
	}
	// Check if wallet contains enough
	if(amount * 100 < user_cents){
		// Make deposit if valid value
		user_cents  -= amount * 100;
		piggy_cents += amount * 100;
	}
	else{
		// Insufficient funds in wallet
		printf("[-] Error: You do not have sufficient funds to DEPOSIT\n");
	}
}
void withdraw(){
	int amount;
	printf("How much would you like to WITHDRAW?\n");
	printf("> $");
	scanf("%d", &amount);
	// HOTFIX
	if(amount < 0){
		printf("[-] Error: No negative values!\n");
		return;
	}
	// Check if piggy contains enough
	if(amount * 100 < piggy_cents){
		// Make deposit if valid value
		piggy_cents -= amount * 100;
		user_cents  += amount * 100;
	}
	else{
		// Insufficient funds in piggy
		printf("[-] Error: You do not have sufficient funds to WITHDRAW\n");
	}
}
void flag(){
	// Buy flag for $31337.00
	if(user_cents > 3133700){
		user_cents -= 31337000;
		system("cat flag");
		exit(0);
	}
	else{
		printf("[-] Error: You cannot buy the flag. Come back when you have $31337.00\n");
	}
}

int main(){
	initialise();
	for(;;){
		switch(get_choice()){
			case 1:
				deposit();
				break;
			case 2:
				withdraw();
				break;
			case 3:
				flag();
				break;
			case 4:
				return 0;
			default:
				printf("[-] Invalid choice\n");
		}
		puts("");
	}
}
