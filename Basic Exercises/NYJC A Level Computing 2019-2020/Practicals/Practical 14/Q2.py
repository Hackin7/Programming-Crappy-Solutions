###Task 2.1##################################

###From SCORES.TXT
sampleData = [72,45,120,57,76,29,40,42,113,77,64,29,91,122,134,139,24,92,136,73,78,62,27,126,76,116,67,34,20,90,75,128,128,89,98,41,37,58,124,24,101,132]

###From QUICKSORT.TXT
def QuickSort(Scores): 
  QuickSortHelper(Scores, 0, len(Scores) - 1)
  return Scores 

def QuickSortHelper(Scores, First, Last):
  if First < Last:
      SplitPoint = Partition(Scores, First, Last)
      QuickSortHelper(Scores, First, SplitPoint - 1)
      QuickSortHelper(Scores, SplitPoint + 1, Last)
  return Scores  


def Partition(Scores, First, Last):  
  PivotValue = Scores[First]
  LeftMark = First + 1
  RightMark = Last
  Done = False
  while (Done == False): 
    while LeftMark <= RightMark and Scores[LeftMark] <= PivotValue:
        LeftMark = LeftMark + 1
    while Scores[RightMark] >= PivotValue and RightMark >= LeftMark:
        RightMark = RightMark - 1        
    if RightMark < LeftMark:
        Done = True
    else:
        Temp = Scores[LeftMark]
        Scores[LeftMark] = Scores[RightMark]
        Scores[RightMark] = Temp
  #<swap Scores[First] with Scores[RightMark]>
  temp = Scores[First]
  Scores[First] = Scores[RightMark]
  Scores[RightMark] = temp
  return RightMark


###Task 2.2################################

def output():
  print(sampleData)

print("Data before Sorting:")
output()

QuickSort(sampleData)
print("Data after Sorting:")
output()
