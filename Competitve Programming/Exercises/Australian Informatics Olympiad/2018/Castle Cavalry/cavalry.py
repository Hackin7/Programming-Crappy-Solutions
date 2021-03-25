with open("cavalryin.txt", "r") as infile:
    outfile = open("cavalryout.txt", "w")

    a = []

    n = int(infile.readline())

    for i in range(n):
        a.append(int(infile.readline()))

    s = set(a)
    for i in s:
        c = a.count(i)
        if c % i != 0:
            outfile.write("NO")
            outfile.close()
            raise SystemExit(0)
        tested.append(i)
    outfile.write("YES")
    outfile.close()
