#include <time.h>
#include <stdio.h>
#include <fcntl.h>
#include <locale.h>
#include <curses.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <stdbool.h>
#include <sys/stat.h>
#include <sys/types.h>

/* gcc game.c -lncurses -o game */

WINDOW * mainwin;

// Macros
#define BOLD(win, l, c, s) \
	wattron(win, A_BOLD);\
	mvwaddstr(win, l, c, s);\
	wattroff(win, A_BOLD);

#define UNDERLINE(win, l, c, s) \
	wattron(win, A_UNDERLINE);\
	mvwaddstr(win, l, c, s);\
	wattroff(win, A_UNDERLINE);

#define GAME_L	40
#define GAME_C	100
#define DAYS_TO_ORD 660

#define DELWIN() \
	erase();\
	delwin(game);\
	delwin(status);\
	delwin(queue);\
	delwin(desk);\
	delwin(id);\
	delwin(stat_d);\
	delwin(stat_m);

void curses_init();
void curses_end();
void main_menu();
void instructions();

typedef struct person {
	char name[16];
	char ic[16];
	int bribe;
	bool auth;
} person;

void generate_person(person * p){
	char names[6][10] = {
		"Calvin    ",
		"Nikolas   ",
		"Waituck   ",
		"Justin    ",
		"Kenneth   ",
		"David     "
	};
	char ics[9][10] = {
		"T0350867B",
		"S9897700G",
		"S9297498G",
		"S9536533G",
		"S7071763H",
		"T0161988D",
		"S9140195I",
		"S9481444H",
		"T0257225C"
	};
	
	strncpy(p->name, names[rand()%6], 10);
	strncpy(p->ic, ics[rand()%9], 10);
	p->auth = (rand()%20) ? true : false;
	if(p->auth)
		p->bribe = -1; /* Authorised Personnel do not accept bribe offers */
	else
		p->bribe = rand()%100;
}

// Convert negative n to positive n
int positive(int n){
	return (n < 0) ? -n : n;
}

int start_time = -1;
int days_left = -1;
int money_left = 1000000;
person curr;
int bribe = 0;
int game(){
	WINDOW	*game,
			*status,
			*queue,
			*desk,
			*id,
			*stat_d,
			*stat_m;

	game   = subwin(mainwin, GAME_L   , GAME_C   , 0 , 0 );
	status = subwin(game   , 3        , GAME_C-2 , 1 , 1 );
	queue  = subwin(game   , 15       , GAME_C-2 , 4 , 1 );
	desk   = subwin(game   , GAME_L-20, 35       , 19, 1 );
	id     = subwin(game   , GAME_L-20, GAME_C-37, 19, 36);
	stat_d = subwin(status , 1        , 40       , 2 , 3 );
	stat_m = subwin(status , 1        , 18       , 2 , 78);

	//box(game  , 0, 0);
	box(status, 0, 0);
	box(queue , 0, 0);
	box(desk  , 0, 0);
	box(id    , 0, 0);
	mvwaddstr(queue, 0, 1, " Queue ");
	mvwaddstr(desk , 0, 1, " Personnel ");
	mvwaddstr(id   , 0, 1, " 11B ");

	mvwaddstr(stat_d, 0, 0, "DAYS TO ORD: 530 days");
	mvwaddstr(stat_m, 0, 0, "$ TO GOAL: $         ");

	// Ascii Art ( NOT IMPT )
	mvwaddstr(queue, 1 , 2, "+---------------+-----------+         [+++++++++]");
	mvwaddstr(queue, 2 , 2, "|   0     |@__  |                     [=========]");
	mvwaddstr(queue, 3 , 2, "| /|\\     |     |              @      [ __@     ]");
	mvwaddstr(queue, 4 , 2, "| / \\    / \\    |  @/        /|\\         /|     ]");
	mvwaddstr(queue, 5 , 2, "|      +        |  |   +----+/ \\      [  / \\    ]                -__@");
	mvwaddstr(queue, 6 , 2, "|  0   |   \\@   | /|\\  |              [=========]                  /|");
	mvwaddstr(queue, 7 , 2, "| /|>  |   |\\   |      |              [         ]                  / \\");
	mvwaddstr(queue, 8 , 2, "| / \\  |  / \\   |      |              [         ]");
	mvwaddstr(queue, 9 , 2, "|      |        +      |              [         ]");
	mvwaddstr(queue, 10, 2, "|  @   |    0    __@   |              /         ]");
	mvwaddstr(queue, 11, 2, "| /|\\  |  /|\\     /|   |              [         ]");
	mvwaddstr(queue, 12, 2, "| / \\  |  / \\     / \\  |              [         ]");
	mvwaddstr(queue, 13, 2, "+      +---------------+              [+++++++++]");

	mvwaddstr(desk, 3 , 2, "           _______");
	mvwaddstr(desk, 4 , 2, "        __|_______|");
	mvwaddstr(desk, 5 , 2, "          //////^\\\\");
	mvwaddstr(desk, 6 , 2, "          | *  *  |");
	mvwaddstr(desk, 7 , 2, "           \\  o  /");
	mvwaddstr(desk, 8 , 2, "         ___ \\ / ___ ");
	mvwaddstr(desk, 9 , 2, "        /           \\");
	mvwaddstr(desk, 10, 2, "------------------------------");
	mvwaddstr(desk, 11, 2, "==============================");
	mvwaddstr(desk, 12, 2, "       _______");
	mvwaddstr(desk, 13, 2, "      /      /,      __");
	mvwaddstr(desk, 14, 2, "     /      //      / /");
	mvwaddstr(desk, 15, 2, "    /______//      / /");
	mvwaddstr(desk, 16, 2, "   (______(/       \\/");

	mvwaddstr(id, 2 , 10, "  [ALLOW]  REJECT   BRIBE: $              ");
	mvwaddstr(id, 3 , 10, " _________________________________________");
	mvwaddstr(id, 4 , 10, "|   __                                    |");
	mvwaddstr(id, 5 , 10, "|--/**\\-----------------------------------|");
	mvwaddstr(id, 6 , 10, "| |****|         SINGAPORE LEGGED FORCES  |");
	mvwaddstr(id, 7 , 10, "|--\\__/-----------------------------------|");
	mvwaddstr(id, 8 , 10, "|                              _________  |");
	mvwaddstr(id, 9 , 10, "|                             |   ___   | |");
	mvwaddstr(id, 10, 10, "|                             |  /   \\  | |");
	mvwaddstr(id, 11, 10, "|                             |  |* *|  | |");
	mvwaddstr(id, 12, 10, "|                             |   \\ /   | |");
	mvwaddstr(id, 13, 10, "|                             | _/   \\_ | |");
	mvwaddstr(id, 14, 10, "|                             |_________| |");
	mvwaddstr(id, 15, 10, "|                                         |");
	mvwaddstr(id, 16, 10, "|_________________________________________|");
	refresh();

	// Game Start
	alarm(360); /* Do your job properly and fast */
	start_time = time(0);
	srand(start_time);
	days_left = DAYS_TO_ORD;
	int _money_left = -1; /* Temporary variable to reduce screen updates ( NOT IMPT ) */
	int _days_left  = -1; /* Temporary variable to reduce screen updates ( NOT IMPT ) */

	int ch;
	int selected = 0;
	char bribe_buf[12];
	memset(bribe_buf, '\x00', 12);
	int bribe_len = 0;
	for (;;) {
		// Update Status
		char buf[22];
		days_left = ( (start_time+360*DAYS_TO_ORD) - time(0) ) / 360; /* 6 minute = 1 game day */
		if(_days_left != days_left){
			_days_left = days_left;
			snprintf(buf, 22, "DAYS TO ORD: %d days", _days_left);
			mvwaddstr(stat_d, 0, 0, buf);
			wrefresh(stat_d);
			// Monthly pay
			if(!(_days_left % 30))
				money_left -= 630; // Wait for CTF.SG 2021 then you'll be LCP, for now enjoy PTE pay

			// Win Method #1
			if(_days_left <= 0){
				DELWIN();
				return 1; /* return 1 for win */
			}
		}
		if(money_left != _money_left){
			_money_left = money_left;
			snprintf(buf, 22, "$ TO GOAL: $%d", _money_left);
			mvwaddstr(stat_m, 0, 0, buf);
			wrefresh(stat_m);

			// Win Method #2
			if(_money_left <= 0){
				DELWIN();
				return 1; /* return 1 for win */
			}
		}

		// Game Logic
		if(!curr.name[0]){
			generate_person(&curr);
			mvwaddstr(id, 10, 16, curr.name);
			mvwaddstr(id, 13, 16, curr.ic);
			wrefresh(id);
		}

		// User Input
		if ((ch = getch()) == ERR) {
		}
		else {
			switch(ch){
				case KEY_LEFT:
					selected = ( --selected < 0 ) ? 2 : selected;
					break;
				case KEY_RIGHT:
					selected = ( ++selected > 2 ) ? 0 : selected;
					break;
				case '\n':
					if(!selected){
						if(!curr.auth){ /* Allowed unauthorised personnel: LOSE + sign 7 extra T.T */
							DELWIN();
							return 0;
						}
						mvwaddstr(desk, 2 , 13, "ACCEPTED O");
					}
					else if(selected == 1){
						if(curr.auth){ /* Rejected authorised personnel: LOSE */
							DELWIN();
							return 0;
						}
						mvwaddstr(desk, 2 , 13, "REJECTED X");
					}
					else{/* selected == 2 */
						bribe = positive(atoi(bribe_buf));
						if(bribe > curr.bribe){ /* Offered to be bribed at too high a price: LOSE */
							DELWIN();
							return 0;
						}
						money_left -= bribe;
						mvwaddstr(desk, 2 , 13, "TOOK BRIBE ($.$)");
					}

					alarm(360); /* Restart alarm */
					wrefresh(desk);
					sleep(1);
					mvwaddstr(desk, 2 , 13, "                ");
					wrefresh(desk);
					curr.name[0] = '\x00'; /* Serve next in queue */
					break;
				case 'q':
					DELWIN();
					return 0;
					break;
				case KEY_BACKSPACE:
					if(bribe_len){
						bribe_buf[--bribe_len] = '\x00';
					}
					break;
				default:
					if( (ch >= '0' && ch <= '9') || ch == '-' || ch == '+' ){
						if(bribe_len < 11 && selected == 2){
							bribe_buf[bribe_len++] = (char)ch;
							bribe_buf[bribe_len] = '\x00';
						}
					}
					break;
			}
			if(!selected){
				bribe = 0;
				mvwaddstr(id, 2 , 10, "  [ALLOW]  REJECT   BRIBE: $              ");
			}
			else if(selected == 1){
				bribe = 0;
				mvwaddstr(id, 2 , 10, "   ALLOW  [REJECT]  BRIBE: $              ");
			}
			else{/* selected == 2 */
				char _buf[43];
				snprintf(_buf, 43, "   ALLOW   REJECT  [BRIBE: $%-11s]  ", bribe_buf);
				mvwaddstr(id, 2 , 10, _buf);
			}
			wrefresh(id);
		}
	}
}

int main(){
	curses_init();
	main_menu();
	instructions();
	if(game()){
		mvwaddstr(mainwin, 0, 0, "You Win!");
		mvwaddstr(mainwin, 1, 0, "CTFSG{XXXXXXXXXXXXXXXXXXX}");
		refresh();
		sleep(20);
	}
	else{
		mvwaddstr(mainwin, 0, 0, "You Lose :(");
		refresh();
		sleep(5);
	}
	curses_end();
	return 0;
}

void curses_init(){
	/* init */
	if( (mainwin = initscr()) == NULL ){
		fprintf(stderr, "[-] Error initialising ncurses.\n");
		exit(EXIT_FAILURE);
	}
	if(has_colors() == FALSE){
		endwin();
		printf("Your terminal does not support color\n");
		exit(EXIT_FAILURE);
	}
	//start_color();
	init_pair(1, COLOR_RED, COLOR_BLACK);
	init_pair(2, COLOR_BLUE, COLOR_BLACK);
	init_pair(3, COLOR_YELLOW, COLOR_BLACK);
	cbreak();	
	noecho();
}

void curses_end(){
	endwin();
}

#define GAME_L	40
#define GAME_C	100
void main_menu(){
	char banner[] = "            _     _  ____                           \n          /' \\  /' \\/\\  _`\\                         \n         /\\_, \\/\\_, \\ \\ \\L\\ \\                       \n         \\/_/\\ \\/_/\\ \\ \\  _ <'                      \n            \\ \\ \\ \\ \\ \\ \\ \\L\\ \\__                   \n             \\ \\_\\ \\ \\_\\ \\____/\\ \\                  \n              \\/_/  \\/_/\\/___/\\ \\/                  \n                               \\/                   \n                                                    \n ____    __       ____    ______  ____    ____      \n/\\  _`\\ /\\ \\     /\\  _`\\ /\\  _  \\/\\  _`\\ /\\  _`\\    \n\\ \\ \\L\\ \\ \\ \\    \\ \\ \\L\\_\\ \\ \\L\\ \\ \\,\\L\\_\\ \\ \\L\\_\\  \n \\ \\ ,__/\\ \\ \\  __\\ \\  _\\L\\ \\  __ \\/_\\__ \\\\ \\  _\\L  \n  \\ \\ \\/  \\ \\ \\L\\ \\\\ \\ \\L\\ \\ \\ \\/\\ \\/\\ \\L\\ \\ \\ \\L\\ \\\n   \\ \\_\\   \\ \\____/ \\ \\____/\\ \\_\\ \\_\\ `\\____\\ \\____/\n    \\/_/    \\/___/   \\/___/  \\/_/\\/_/\\/_____/\\/___/ \n                                                    \n                                                    ";
	WINDOW	*splash,
			*title,
			*choices;

	splash = subwin(mainwin, GAME_L   , GAME_C   , 0 , 0 );
	title  = subwin(splash , GAME_L-1 , GAME_C-23, 1 , 23);
	choices= subwin(splash , GAME_L-25, GAME_C-20, 22, 10);

	BOLD(title, 0, 0, banner);

	UNDERLINE(choices, 5, 32, "     STORY     ");
	UNDERLINE(choices, 8, 32, "   EXIT GAME   ");
	mvwaddstr(choices, 5, 30, ">");

	box(splash, 0, 0);
	refresh();

	int ch;
	int selected = 0;
	nodelay(stdscr, TRUE);
	keypad(stdscr, TRUE);
	curs_set(0);
	for (;;) {
		if ((ch = getch()) == ERR) {
		}
		else {
			switch(ch){
				case KEY_UP:
					mvwaddstr(choices, 8, 30, " ");
					mvwaddstr(choices, 5, 30, ">");
					selected = 0;
					wrefresh(choices);
					break;
				case KEY_DOWN:
					mvwaddstr(choices, 5, 30, " ");
					mvwaddstr(choices, 8, 30, ">");
					selected = 1;
					wrefresh(choices);
					break;
				case '\n':
					erase();
					delwin(title);
					delwin(choices);
					delwin(splash);
					if(!selected)
						return;
					else{
						curses_end();
						exit(0);
					}
					break;
			}
		}
	}

}

void instructions(){
	WINDOW	*ins;
	ins = subwin(mainwin, GAME_L   , GAME_C   , 0 , 0 );

	box(ins, 0, 0);
	BOLD(ins, 0, 2, " HOW TO PLAY ");
	mvwaddstr(ins, 2, 3, "Welcome to ");
	BOLD(ins, 2, 14, "< 11B, Please >");
	mvwaddstr(ins, 2, 29, "!, the latest and greatest in security trooper simulations.");

	mvwaddstr(ins, 4, 3, "In this game, you will play the role of the SECURITY TROOPER");

	mvwaddstr(ins, 6, 3, "As personnel approach your front desk, you will determine if they are authorised to enter");

	mvwaddstr(ins, 8 , 3 , "=> ");
	BOLD(     ins, 8 , 6 , "ACCEPT");
	mvwaddstr(ins, 8 , 12, " authorised personnel");
	mvwaddstr(ins, 9 , 3 , "=> ");
	BOLD(     ins, 9 , 6 , "REJECT");
	mvwaddstr(ins, 9 , 12, " unauthorised personnel");
	mvwaddstr(ins, 10, 3 , "=> offer unauthorised personnels to ");
	BOLD(     ins, 10, 39, "BRIBE");
	mvwaddstr(ins, 10, 44, " you, should you wish to take the risk");

	mvwaddstr(ins, 13, 3, "To ");
	BOLD(     ins, 13, 6, "WIN");
	mvwaddstr(ins, 13, 9, " you must fulfil 1 of the 2 win conditions:");
	mvwaddstr(ins, 14, 3, "1) Earn enough money ($1000000) from bribes and monthly pay to buy your freedom from the SLF");
	BOLD(     ins, 15, 9, "OR");
	mvwaddstr(ins, 16, 3, "2) Do your job correctly for the remaining days to your ORD :D");

	mvwaddstr(ins, 18, 3, "Whichever method you choose I wish you the best!");

	BOLD(     ins, 28, 33, " -- PRESS ANY KEY TO CONTINUE -- ");

	refresh();

	int ch;
	for (;;) {
		if ((ch = getch()) == ERR) {
		}
		else{
			erase();
			delwin(ins);
			return;
		}
	}
}
