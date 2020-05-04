print("a  a^2  a^3") # Table header

for a in range(1,4+1):
    square = str(a**2)+ "  "
    cube = str(a**3)
    # Add a spacing if it is only single digit,
    # so that the table is spaced properly
    if int(square) // 10 == 0:
        square+=' '
    print(str(a)+' ',square,cube)
