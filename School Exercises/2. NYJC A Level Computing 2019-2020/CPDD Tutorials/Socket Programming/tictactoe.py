N = 3
WIDTH = len(str(N ** 2))
PLAYERS = ('O', 'X')

class TicTacToe:
    
    def __init__(self):
        self.board = []
        for i in range(N):
            self.board.append([None] * N)
        
    def render_row(self, row_index):
        start = row_index * N + 1
        row = self.board[row_index].copy()
        for column_index in range(N):
            if row[column_index] is None:
                cell = str(start + column_index)
            else:
                cell = PLAYERS[row[column_index]]
            if len(cell) < WIDTH:
                cell += ' ' * (WIDTH - len(cell))
            row[column_index] = ' ' + cell + ' '
        return '|'.join(row) + '\n'
    
    def render_board(self):
        rows = []
        for row_index in range(N):
            rows.append(self.render_row(row_index))
        divider = '-' * ((WIDTH + 3) * N -1) + '\n'
        return divider.join(rows)
    
    def make_move(self, player_index, cell_index):
        cell_index -= 1
        self.board[cell_index // N][
            cell_index % N] = player_index
            
    def is_valid_move(self, cell_index):
        if cell_index < 1 or cell_index > N ** 2:
            return False
        cell_index -= 1
        return self.board[cell_index // N][
            cell_index % N] is None
    
    def is_full(self):
        for row_index in range(N):
            for column_index in range(N):
                if self.board[row_index][
                        column_index] is None:
                    return False
        return True
    
    def get_winner(self):
        # Check diagonals:
        if self.board[0][0] is not None:
            found = True
            for i in range(N):
                if self.board[0][0] != self.board[i][i]:
                    found = False
                    break
            if found:
                return self.board[0][0]
        if self.board[0][N - 1] is not None:
            found = True
            for i in range(N):
                if self.board[0][N - 1] != self.board[i][
                        N - i - 1]:
                    found = False
                    break
            if found:
                return self.board[0][N - 1]
        
        # Check rows and columns
        for i in range(N):
            if self.board[i][0] is not None:
                found = True
                for j in range(N):
                    if self.board[i][0] != self.board[i][j]:
                        found = False
                        break
                if found:
                    return self.board[i][0]
            if self.board[0][i] is not None:
                found = True
                for j in range(N):
                    if self.board[0][i] != self.board[j][i]:
                        found = False
                        break
                if found:
                    return self.board[0][i]
        
        # No matching lines were found, so no winner
        return None
