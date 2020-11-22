item = 1
border = "-"*30
varspacing = 10
samples = {
    border: border,
    "Left align": f"{item:>20}",
    "Right align": f"{item:<20}",
    "Centre align": f"{item:^20}",
    "Variable Spacing": f"{item:>{varspacing}}",
    "Combining 2 f-strings": f"{item}"f"{item}"
}

for i in samples:
    print(f"{i:30}|",samples[i])

print()

### Show a Table ########################################
def getData(i, j):
    if i == 0:
        headers = ["ID","Field 1","Field 2","Field 3", "Field 4"]
        return headers[j]
    return f"{i},{j}"

def showTable():
    colWidths = [10,10,10,10,10]

    output = ""
    for row in range(10):
        for col in range(5):
            output += f"{getData(row,col):<{colWidths[col]}}"
        output += "\n"
    print(output)

showTable()
