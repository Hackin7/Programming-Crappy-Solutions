# Write your code here

name = input()
characters = list(name)

def char_type(a):
    if a.islower():
        return 0
    elif a.isupper():
        return 1
    else:
        return 2

def key_func(a):
    a_type = char_type(a)
    return (a_type, a)

characters.sort(key=key_func)
#print(characters)

# Printing out blocks

curr_string = characters
curr_block = ""
remaining_string = []
while len(curr_string) > 0:
    for char in curr_string:
        if char not in curr_block:
            curr_block += char
        else:
            remaining_string.append(char)

    ### Final Output ######################
    print(curr_block, end="")
    if len(remaining_string) > 0:
        print('-', end="")

    curr_string = remaining_string
    curr_block = ""
    remaining_string = []
