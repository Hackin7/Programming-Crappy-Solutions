
def cal(n, movements):
    snake_queue = [] # ordered from tail(first) to head (last)
    next_coord = [0, 0] # x, y
    snake_queue.append(tuple(next_coord))
    
    direction = 0 # 0, 1, 2, 3 for NESW, clockwise
    for move_no in range(len(movements)):
        ## Set Direction #########################
        move = movements[move_no]
        if move == "L":  direction -= 1
        elif move == "R": direction += 1
        #elif move == "F": pass
        #elif move == "E": pass
        direction %= 4
        
        
        ### Modify queue ##########################
        #print(snake_queue)
        if move != "E": snake_queue.pop(0) # Remove tail
        ### Set Next Coord #########
        if direction == 0: next_coord[1] += 1
        elif direction == 1: next_coord[0] += 1
        elif direction == 2: next_coord[1] -= 1
        elif direction == 3: next_coord[0] -= 1
        snake_queue.append(tuple(next_coord)) # Add Head
        
        ### Check for duplicates -> collision ####
        for i in range(len(snake_queue)):
            for j in range(i+1, len(snake_queue)):
                if snake_queue[i] == snake_queue[j]:
                    #print(snake_queue, i, j)
                    print(move_no+1)
                    return
        
    # Survived
    print("YES")

t = int(input())
for i in range(t):
    n_str, movements = input().split()
    n = int(n_str)
    cal(n, movements)
