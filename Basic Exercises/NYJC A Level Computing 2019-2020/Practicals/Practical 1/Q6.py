gender = input("Are you male(m/M) or female(f/F):")
if gender in ['f','F']: 
    print("Female")
elif gender in ['m','M']:
    print("Male")
else: #Other conditions
    print("Invalid character entered. \n"
          "Please enter 'm' or 'M' for male "
          "or 'f' or 'F' for female")
