# Game graphic interface
from tkinter import *

SIZE = 500
GRID_LEN = 4
GRID_PADDING = 10

WHITE_COLOR = "#ffffff"
BACKGROUND_COLOR_GAME = "#92877d"
BACKGROUND_COLOR_CELL_EMPTY = "#9e948a"
BACKGROUND_COLOR_DICT = {   2:"#eee4da", 4:"#ede0c8", 8:"#f2b179", 16:"#f59563", \
                            32:"#f67c5f", 64:"#f65e3b", 128:"#edcf72", 256:"#edcc61", \
                            512:"#edc850", 1024:"#edc53f", 2048:"#edc22e" }
CELL_COLOR_DICT = { 2:"#776e65", 4:"#776e65", 8:"#f9f6f2", 16:"#f9f6f2", \
                    32:"#f9f6f2", 64:"#f9f6f2", 128:"#f9f6f2", 256:"#f9f6f2", \
                    512:"#f9f6f2", 1024:"#f9f6f2", 2048:"#f9f6f2" }
FONT = ("Verdana", 40, "bold")
SCORE_FONT=("Verdana", 20, "bold")

KEY_UP_ALT = "\'\\uf700\'"
KEY_DOWN_ALT = "\'\\uf701\'"
KEY_LEFT_ALT = "\'\\uf702\'"
KEY_RIGHT_ALT = "\'\\uf703\'"

KEY_UP = "'w'"
KEY_DOWN = "'s'"
KEY_LEFT = "'a'"
KEY_RIGHT = "'d'"
KEY_UNDO = "'z'"

class GameGrid(Frame):
    
    def __init__(self, logic):
        Frame.__init__(self)
        self.l = logic
        self.grid()
        self.master.title('2048')
        self.master.bind("<Key>", self.key_down)
        self.commands = {   KEY_UP: self.l['up'],
                            KEY_DOWN: self.l['down'],
                            KEY_LEFT: self.l['left'],
                            KEY_RIGHT: self.l['right'],
                            KEY_UNDO: self.l['undo'], 
                            KEY_UP_ALT: self.l['up'],
                            KEY_DOWN_ALT: self.l['down'],
                            KEY_LEFT_ALT: self.l['left'],
                            KEY_RIGHT_ALT: self.l['right'] }
        self.grid_cells = []
        self.init_grid()
        self.init_score()
        self.game_state = self.l['make_new_game'](GRID_LEN)
        self.update_grid_cells()
        self.mainloop()
        
    def init_grid(self):
        background = Frame(self, bg=BACKGROUND_COLOR_GAME, width=SIZE, height=SIZE)
        background.grid()

        for i in range(GRID_LEN):
            grid_row = []
            for j in range(GRID_LEN):
                cell = Frame(background,
                             bg=BACKGROUND_COLOR_CELL_EMPTY,
                             width=SIZE/GRID_LEN,
                             height=SIZE/(GRID_LEN))
                
                cell.grid(row=i, column=j, padx=GRID_PADDING, pady=GRID_PADDING)
                t = Label(master=cell, text="", bg=BACKGROUND_COLOR_CELL_EMPTY, justify=CENTER, font=FONT, width=4, height=2)
                t.grid()
                grid_row.append(t)

            self.grid_cells.append(grid_row)

    def init_score(self):
        score_container = Frame(self, width=SIZE, height=50)
        score_container.grid()

        score_label = Frame(score_container, bg=WHITE_COLOR, width=SIZE/2, height=20)
        score_label.grid(row=0, column=0, columnspan=1, padx=GRID_PADDING, pady=GRID_PADDING)
        self.score_label = Label(master=score_label, text="Score ", bg=WHITE_COLOR, justify=RIGHT, font=SCORE_FONT, width=10, height=1)
        self.score_label.pack()

        score_text = Frame(score_container, bg=WHITE_COLOR, width=SIZE/2, height=20)
        score_text.grid(row=0, column=1, columnspan=1, padx=GRID_PADDING, pady=GRID_PADDING)
        self.score_text = Label(master=score_text, text="0000", bg=WHITE_COLOR, justify=RIGHT, font=SCORE_FONT, width=10, height=1)
        self.score_text.pack()

    def update_grid_cells(self):
        current_score = self.l['get_score'](self.game_state)
        current_matrix = self.l['get_matrix'](self.game_state)
        self.score_text.configure(text=str(current_score))
        for i in range(GRID_LEN):
            for j in range(GRID_LEN):
                new_number = current_matrix[i][j]
                if new_number == 0:
                    self.grid_cells[i][j].configure(text="", bg=BACKGROUND_COLOR_CELL_EMPTY)
                else:
                    self.grid_cells[i][j].configure(text=str(new_number), bg=BACKGROUND_COLOR_DICT[new_number], fg=CELL_COLOR_DICT[new_number])
        self.update_idletasks()
       
    def key_down(self, event):
        def display_end_game(word1, word2):
            self.grid_cells[1][1].configure(text=word1, bg=BACKGROUND_COLOR_CELL_EMPTY, fg=WHITE_COLOR)
            self.grid_cells[1][2].configure(text=word2, bg=BACKGROUND_COLOR_CELL_EMPTY, fg=WHITE_COLOR)
        key = repr(event.char)   
        if key in self.commands:
            self.game_state, is_valid_move = self.commands[repr(event.char)](self.game_state)
            if is_valid_move:
                self.update_grid_cells()
                current_matrix = self.l['get_matrix'](self.game_state)
                current_status = self.l['game_status'](current_matrix)
                if current_status == "win":
                    display_end_game('You', 'Win!')
                if current_status == "lose":
                    display_end_game('You','Lose!')
