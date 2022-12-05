#include <cstdlib>
#include <iostream>
using namespace std;
  
int arr[80]; // length of string

void magic(int seed){
  srand(0x40a8);
  for (int i=0; i<0x14; i++) { // 20 times
        int index = (i<<2);
        //cout << "index:" << (i<<2) << endl;
        // puVar2 = (uint32_t *)((int64_t)((int32_t)i << 2) + 0x4040);
        // pointer = arr[index]
        int ranvalue = rand();
        cout << rand()<< endl;
        arr[index] = (arr[index] ^ ranvalue);
        //*puVar2 = *puVar2 ^ uVar1; // XOR with rand (predictable)
    }
}
int main()
{
    for (int i=0; i<80; i++){
      cout <<arr[i] << "_";
    }
    arr[0] = 0x2e;
    arr[1] = 0x2e;
    arr[2] = 0x2e;
    arr[3] = 0x0a;
    arr[4] = 0x0a;
    arr[5] = 0x6e;
    arr[6] = 0x0b;
    arr[7] = 0x23;
    
    magic(0x40a8);
    magic(0x40b0);
    for (int i=0; i<80; i++){
      cout <<arr[i] << "_";
    }
    // This program will create same sequence of
    // random numbers on every program run
    
    return 0;
}
