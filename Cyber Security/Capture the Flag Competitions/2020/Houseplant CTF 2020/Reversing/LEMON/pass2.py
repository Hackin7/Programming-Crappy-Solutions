def checkpass():
  userinput = input("Enter the password: ")
  if userinput[0:4] == "rtcp":
        if userinput[10:13] == "tHi":
            if userinput[22:25] == "cuR":
                if userinput[4:7] == "{y3":
                    if userinput[16:19] == "1nT":
                        if userinput[7:10] == "4H_":
                            if userinput[13:16] == "S_a":
                                if userinput[19:22] == "_sE":
                                    if userinput [25:27] == "3}":
                                        return True
  else:
    return False
def main():
    access = checkpass()
    if access == True:
        print("Unlocked. The flag is the password.")
        print("b-but i wunna show off my catswpeak uwu~... why wont you let me do my nya!!\noh well... good luck with the rest of the ctf :/\nbut I WANT TO SPWEAK CATGIRL NEXT TIME SO YOU BETTER LET ME >:(")
        exit()
    else:
        print("Incorrect password!")
        print("sowwy but now you gunnu have to listen to me spweak in cat giwrl speak uwu~")
        catmain()

def catmain():
    access = catcheckpass()
    if access == True:
        print("s-senpai... i unwocked it fowr you.. uwu~")
        print("t-the fwlag is... the password.. nya!")
        exit()
    else:
        print("sowwy but that wasnt quite rwight nya~")
        catmain()

def catcheckpass():
  userinput = input("pwease enter youwr password... uwu~ nya!!: ")
  if userinput[0:4] == "rtcp":
        if userinput[10:13] == "tHi":
            if userinput[22:25] == "cuR":
                if userinput[4:7] == "{y3":
                    if userinput[16:19] == "1nT":
                        if userinput[7:10] == "4H_":
                            if userinput[13:16] == "S_a":
                                if userinput[19:22] == "_sE":
                                    if userinput [25:27] == "3}":
                                        return True
  else:
    return False

access = False
main()
