import socket
import tictactoe

listen_socket = socket.socket()
listen_socket.bind(('127.0.0.1', 3456))
listen_socket.listen()

game_socket, addr = listen_socket.accept()
game = tictactoe.TicTacToe()
while True:
    # Receive move from server player
    received = b''
    while b'\n' not in received:
        received += game_socket.recv(1024)
    if received.startswith(b'MOVE'):
        move = int(received[4:])
        print('Client moves: ' + str(move))
        print()
        game.make_move(0, move)
    elif received.startswith(b'END'):
        print('Opponent quits, you win!')
        print()
        break
    
    # Display current Tic-Tac-Toe board
    print(game.render_board())
    
    # Check if server player won
    if game.get_winner() is not None:
        print('Opponent wins!')
        print()
        break
    
    # Check if server player won
    if game.get_winner() is not None:
        print('Opponent wins!')
        print()
        break
    
    # Check if the board is full
    if game.is_full():
        print('Stalemate')
        print()
        break
    
    # Prompt for move from client player
    move = -1
    while move != 0 and not game.is_valid_move(move):
        move = int(input('Server moves ' +
                   '((0 to quit): '))
    print()
    if move == 0:
        game_socket.sendall(b'END\n')
        print('You quit, opponent wins!')
        print()
        break
    game.make_move(1, move)
    game_socket.sendall(b'MOVE' +
                        str(move).encode() + b'\n')
    
    # Display current Tic-Tac-Toe board
    print(game.render_board())
    
    # Check if client player won
    if game.get_winner() is not None:
        print('You win!')
        print()
        break
    
    # Check if board is full
    if game.is_full():
        print('Stalemate')
        print()
        break

game_socket.close()
listen_socket.close()
