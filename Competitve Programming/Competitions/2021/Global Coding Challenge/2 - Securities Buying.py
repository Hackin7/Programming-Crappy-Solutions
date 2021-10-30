
def key(a):
    return a[1]
    
def securitiesBuying(z, security_value):
   no_of_stocks=0
   #participants code here
   security_value_pairs = [(i+1, int(security_value[i])) for i in range(len(security_value))]
   s = sorted(security_value_pairs, key=key)

   money = int(z[0])
   for i in range(len(s)):
       to_break = False
       for j in range(s[i][0]):
           money -= int(s[i][1])
           #print(money, s[i], j)
           if money < 0:
               to_break = True
               break
           no_of_stocks += 1
       if to_break:
           break
         
   return no_of_stocks;

def main():
    z= input().split()
    security_value = []
    security_value = input().split()
    no_of_stocks_purchased=securitiesBuying(z,security_value)
    print(no_of_stocks_purchased)




if __name__ == '__main__':
    main()
