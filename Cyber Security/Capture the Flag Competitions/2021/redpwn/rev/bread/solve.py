### Fuzzing for inputs
strings = '''flag.txt
hide the bowl inside a box
mom doesn't suspect a thing, but asks about some white dots on the bathroom floor
couldn't open/read flag file, contact an admin if running on server
the flaming loaf sizzles in the sink
pull the tray out with a towel
there's no time to waste
pull the tray out
the window is closed
the fire alarm is replaced
you sleep very well
time to go to sleep
close the window
replace the fire alarm
brush teeth and go to bed
you've taken too long and fall asleep
the dough has risen, but mom is still awake
the dough has risen
wait 2 hours
wait 3 hours
the oven glows a soft red-orange
the dough is done, and needs to be baked
preheat the oven
preheat the toaster oven
mom comes home and finds the bowl
the ingredients are added and stirred into a lumpy dough
the box is nice and warm
leave the bowl on the counter
put the bowl on the bookshelf
45 minutes is an awfully long time
return upstairs
watch the bread bake
the sink is cleaned
the counters are cleaned
everything appears to be okay
the kitchen is a mess
wash the sink
clean the counters
get ready to sleep
the half-baked bread is disposed of
flush the bread down the toilet
the oven shuts off
cold air rushes in
there's smoke in the air
unplug the oven
unplug the fire alarm
open the window
you put the fire alarm in another room
you bring a bottle of oil and a tray
it is time to finish the dough
work in the kitchen
work in the basement
flour has been added
yeast has been added
salt has been added
water has been added
add ingredients to the bowl
add flour
add yeast
add salt
add water
the bread is in the oven, and bakes for 45 minutes
you've forgotten how long the bread bakes
the timer ticks down
use the oven timer
set a timer on your phone'''

stop_lines = """we don't have that ingredient at home!
mom comes home before you find a place to put the bowl
the dough has been forgotten, making an awful smell the next morning
you've shuffled around too long, mom wakes up and sees you making bread
mom finds flour in the sink and accuses you of making bread
mom finds flour on the counter and accuses you of making bread
mom finds burnt bread on the counter and accuses you of making bread
mom finds the window opened and accuses you of making bread
mom finds the fire alarm in the laundry room and accuses you of making bread
you've moved around too much and mom wakes up, seeing you bake bread
one of the fire alarms in the house triggers, waking up the entire house
brother is still awake, and sees you making bread
you've moved around too much and mom wakes up, seeing you bake bread
the kitchen catches fire, setting off the fire alarm and waking up the entire house
mom comes home and brings you food, then sees the bowl
the tray burns you and you drop the pan on the floor, waking up the entire house
the flaming loaf sets the kitchen on fire, setting off the fire alarm and waking up the entire house
you've taken too long and fall asleep
the oven makes too much noise, waking up the entire house
the timer makes too much noise, waking up the entire house
the dough wants to be baked
you've forgotten how long the bread bakes"""

from pwn import *

def fuzzing(lines):
    res = b''
    io = process('bread')
    io.recv()
    for j in lines:
        io.sendline(j)
        res += io.recv()
    io.close()
    return res

usable_inputs = []

strings_list = strings.split("\n")
stop_lines_list = stop_lines.split("\n")

def has_stop_lines(line):
    for l in stop_lines_list:
        if l in line:
            return True
    #print(l,":",line)
    return False

def dfs(total_lines, past_lines=[], res=[]):
    successful = []
    for line in total_lines:
        io = process('./bread')
        io.recv()

        new_res = list(res)
        try:
            given_lines = past_lines + [line]
            for j in given_lines:
                io.sendline(j)
                #io.wait()
                retrieved_res = io.recv()
                new_res.append(retrieved_res.strip())
        except:
            return None

        ### Prevent Loops ##########################
        if retrieved_res.strip() in new_res[:-2]:
            print(retrieved_res, new_res[:-2])
            continue

        print(line)
        print(res)
        polling = io.poll()
        print(polling, has_stop_lines(b' '.join(res).decode()))
        io.close()
        io.wait()
        if b"flag" in res:
            print(given_lines)
            exit()
        if polling == None and not has_stop_lines(b' '.join(res).decode()): # if asking for further input which is not  going to lead to a loop
            print("### Next Level ############################")
            print(given_lines)
            new_total_lines = list(total_lines)
            #new_total_lines.remove(line)
            data = dfs(new_total_lines, given_lines, new_res)
            successful += (line, data, res)
            print("##########################################")
    return successful

print(dfs(strings_list, ['add flour', 'add water', 'add salt', 'add yeast', 'hide the bowl inside a box', 'wait 3 hours', 'work in the basement', 'preheat the toaster oven', 'set a timer on your phone', 'watch the bread bake', 'pull the tray out with a towel', 'unplug the oven', 'unplug the fire alarm', 'open the window', 'wash the sink', 'clean the counters']))#['add flour', 'add water', 'add salt', 'add yeast']))
#['add flour', 'add water', 'add salt', 'add yeast', 'hide the bowl inside a box', 'wait 3 hours', 'work in the basement', 'preheat the toaster oven', 'set a timer on your phone', 'watch the bread bake', 'pull the tray out with a towel', 'unplug the oven', 'unplug the fire alarm', 'open the window', 'wash the sink', 'clean the counters']
# ['add flour', 'add water', 'add salt', 'add yeast', 'hide the bowl inside a box', 'wait 3 hours', 'work in the basement', 'preheat the toaster oven', 'set a timer on your phone', 'watch the bread bake', 'pull the tray out with a towel', 'unplug the oven', 'unplug the fire alarm', 'open the window', 'wash the sink', 'clean the counters', 'get ready to sleep', 'close the window',


'''
## My method: Brute force all combinations, and then just guess
(base) [hacker@hackerbook tmp]$ (cat t; cat) | ./bread
add ingredients to the bowl
flour has been added
water has been added
salt has been added
yeast has been added

the ingredients are added and stirred into a lumpy dough
the box is nice and warm

the bread needs to rise
the dough has risen

it is time to finish the dough
you bring a bottle of oil and a tray

the dough is done, and needs to be baked
the oven glows a soft red-orange

the bread is in the oven, and bakes for 45 minutes
the timer ticks down

45 minutes is an awfully long time
the bread has risen, touching the top of the oven and catching fire

there's no time to waste
the flaming loaf sizzles in the sink

there's smoke in the air
the oven shuts off
you put the fire alarm in another room
cold air rushes in

the kitchen is a mess
the sink is cleaned
the counters are cleaned
the half-baked bread is disposed of
everything appears to be okay

time to go to sleep
the window is closed
the fire alarm is replaced
you sleep very well

it's the next morning
mom doesn't suspect a thing, but asks about some white dots on the bathroom floor
couldn't open/read flag file, contact an admin if running on server

(base) [hacker@hackerbook tmp]$ (cat t; cat) | nc mc.ax 31796
s


^C
(base) [hacker@hackerbook tmp]$  nc mc.ax 31796
add ingredients to the bowl
c
we don't have that ingredient at home!
(base) [hacker@hackerbook tmp]$  nc mc.ax 31796
add ingredients to the bowl
^C(base) [hacker@hackerbook tmp]$  nc mc.ax 31796 < t
add ingredients to the bowl
flour has been added
water has been added
salt has been added
yeast has been added

the ingredients are added and stirred into a lumpy dough
the box is nice and warm

the bread needs to rise
the dough has risen

it is time to finish the dough
you bring a bottle of oil and a tray

the dough is done, and needs to be baked
the oven glows a soft red-orange

the bread is in the oven, and bakes for 45 minutes
the timer ticks down

45 minutes is an awfully long time
the bread has risen, touching the top of the oven and catching fire

there's no time to waste
the flaming loaf sizzles in the sink

there's smoke in the air
the oven shuts off
you put the fire alarm in another room
cold air rushes in

the kitchen is a mess
the sink is cleaned
the counters are cleaned
the half-baked bread is disposed of
everything appears to be okay

time to go to sleep
the window is closed
the fire alarm is replaced
you sleep very well

it's the next morning
mom doesn't suspect a thing, but asks about some white dots on the bathroom floor
flag{m4yb3_try_f0ccac1a_n3xt_t1m3???0r_dont_b4k3_br3ad_at_m1dnight}

(base) [hacker@hackerbook tmp]$ cat t
add flour
add water
add salt
add yeast
hide the bowl inside a box
wait 3 hours
work in the basement
preheat the toaster oven
set a timer on your phone
watch the bread bake
pull the tray out with a towel
unplug the oven
unplug the fire alarm
open the window
wash the sink
clean the counters
flush the bread down the toilet
get ready to sleep
close the window
replace the fire alarm
brush teeth and go to bed

'''

'''
### Adding ##################################################
usable_inputs.append([])
for i in strings_list:
    res = fuzzing([i])
    if b"we don't have that ingredient at home!" not in res:
        usable_inputs[0].append(i)

print(usable_inputs)

### Level 2? ###############################################
usable_inputs.append([])
for i in strings_list:
    res = fuzzing(usable_inputs[0] + [i])
    if b"mom comes home before you find a place to put the bowl" not in res:
        usable_inputs[1].append(i)
        #print(i, res)
print(usable_inputs)

for i in usable_inputs[1]:
    res = fuzzing(usable_inputs[0] + [i])
usable_inputs[1] = ["hide the bowl inside a box"]
import itertools
### Level 3? #################################################
usable_inputs.append([])
for i in strings_list:
    res = fuzzing(usable_inputs[0] + usable_inputs[1] + [i])
    if b"the dough has been forgotten, making an awful smell the next morning" not in res:
        usable_inputs[2].append(i)
        print(i, res)
print(usable_inputs)
'''
