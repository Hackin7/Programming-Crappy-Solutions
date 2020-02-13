population = 312032486 #Population as in that year
secPerYear = 365*24*60*60 #Seconds per Year
for next in range(1,5+1):
    birth = secPerYear//7 #1 birth every 7 seconds
    death = secPerYear//13 #1 death every 13 seconds
    immigrant = secPerYear//45 #1 immigrant every 45 seconds
    population += birth + immigrant-death #Change the population
    print("The population in the next",next,"th year is",population)

