item = 1
border = "-"*20
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
