

def cal(n, movements):
    # Allow faster checking of duplicates
    still_visited = {}
    
    snake_queue = [] # ordered from tail(first) to head (last)
    next_coord = [0, 0] # x, y
    snake_queue.append(tuple(next_coord))
    still_visited[tuple(next_coord)] = False
    
    direction = 0 # 0, 1, 2, 3 for NESW, clockwise
    for move_no in range(len(movements)):
        check_dup = False
        ## Set Direction #########################
        move = movements[move_no]
        if move == "L":  direction -= 1
        elif move == "R": direction += 1
        #elif move == "F": pass
        #elif move == "E": pass
        direction %= 4
        
        ### Modify queue ##########################
        ### Remove tail
        if move != "E": still_visited[snake_queue.pop(0)] = False
        ### Set Next Coord #########
        if direction == 0: next_coord[1] += 1
        elif direction == 1: next_coord[0] += 1
        elif direction == 2: next_coord[1] -= 1
        elif direction == 3: next_coord[0] -= 1
        snake_queue.append(tuple(next_coord)) # Add Head
        
        ### Check for duplicates -> collision ####
        if still_visited.get(tuple(next_coord)) == True:
            print(move_no+1)
            return
        else:
            still_visited[tuple(next_coord)] = True

    # Survived
    print("YES")

t = int(input())
for i in range(t):
    n_str, movements = input().split()
    n = int(n_str)
    cal(n, movements)

'''
2
6 FLERFF
8 EEEELLLL

'''
