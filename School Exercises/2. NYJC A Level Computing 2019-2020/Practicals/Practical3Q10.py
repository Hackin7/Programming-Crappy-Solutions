#Q10 for Practical 3

# Set to True if you want to use rounding.
# Else, the other digits would not be looked at and only the
# Significant few deciaml places will be checked
toRound = True


def processing(value, decimalPlace):
    if toRound:
        return round(value, decimalPlace)
    return float(str(value)[:decimalPlace+2])
    
print(f"{'Value of Pi':<20s}{'Iterations Needed':<30s}")
def output(piApprox, i, decimalPlace=5):
    print(f"{str(processing(piApprox,decimalPlace)):<20s}{i+1:<30d}")

done1 = False
done2 = False
done3 = False
done4 = False

piApprox = 0
for i in range(500000):
    if i % 2 == 0: 
        piApprox += (4/(2*i + 1))
    else:
        piApprox -= (4/(2*i + 1))
    # Printing    
    if processing(piApprox,2) == 3.14 and not done1:
        output(piApprox,i,2)
        done1 = True
    elif processing(piApprox,3) == 3.141 and not done2:
        output(piApprox,i,3)
        done2 = True
    elif processing(piApprox,4) == 3.1415 and not done3:
        output(piApprox,i)
        done3 = True
    elif processing(piApprox,5) == 3.14159 and not done4:
        output(piApprox,i)
        done4 = True
        break
       
#print(piApprox)
