with open("streetin.txt", "r") as infile:
    outfile = open("streetout.txt", "w")

    n, k = map(int, infile.read().split())

    h = n-k
    i = k+1
    if h % i == 0:
        outfile.write(str(int(h/i)))
    else:
        outfile.write(str((h//i) +1))

    outfile.close()
