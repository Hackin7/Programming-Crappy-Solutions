#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int levelone(){
  char local_2d[17];
  int local_1c[4];
  char *local_c;
  int local_8;
  
  local_1c[0] = -0x1b735fa9;
  local_1c[1] = 0x6c77c87b;
  local_1c[2] = 0x536f83af;
  local_1c[3] = 0x1201c743;
  local_c = local_2d;
  puts("====================================================================");
  puts("                          LEVEL 01                                  ");
  puts("====================================================================");
  printf("=> ");
  fflush(stdout);
  scanf("%16s",local_2d);
  
  local_8 = 0;
  while( true ) {
    if (3 < local_8) {
      return 1;
    }
    //cout<<(char)(local_1c[3 - local_8]);
    if (local_1c[3 - local_8] != *(int *)(local_c + local_8 * 4)){
        printf("%x %x\n",local_1c[3 - local_8],*(int *)(local_c + local_8 * 4));
        //cout<<local_1c[3 - local_8]<<" "<<*(int *)(local_c + local_8 * 4)<<" "<<local_8<<endl;//
        //break;
     }
    local_8 = local_8 + 1;
  }
  return 0;

}

int leveltwo()
{
  int iVar1;
  char local_25 [8];
  int local_1d;
  char local_1c [8];
  int local_14;
  
  puts("====================================================================");
  puts("                          LEVEL 02                                  ");
  puts("====================================================================");
  printf("=> ");
  fflush(stdout);
  scanf("%c%c%c%c%c%c%c%c",local_1c,local_1c + 1,local_1c + 2,local_1c + 3,local_1c + 4,
                 local_1c + 5,local_1c + 6,local_1c + 7);
  local_14 = 0;
  while (local_14 < 8) {
    local_25[local_14] = (int)local_1c[local_14];
    local_14 = local_14 + 1;
  }
  local_1d = 0;
  for(int i=0;i<8;i++){cout<<local_25[i];}cout<<endl;
  
  
  iVar1 = strcmp(local_25,"dynamite");
  return (uint)(iVar1 == 0);
}
/*
undefined4 levelthree(void)

{
  int local_30 [3];
  undefined auStack36 [4];
  undefined4 local_20;
  undefined auStack28 [4];
  undefined4 local_18;
  undefined auStack20 [4];
  undefined4 local_10;
  undefined auStack12 [4];
  int local_8;
  
  local_30[0] = 7;
  local_30[2] = 2;
  local_20 = 9;
  local_18 = 2;
  local_10 = 6;
  puts("====================================================================");
  puts("                          LEVEL 03                                  ");
  puts("====================================================================");
  printf("=> ");
  fflush(stdout);
  __isoc99_scanf("%d %d %d %d %d",auStack12,auStack20,auStack28,auStack36,local_30 + 1);
  local_8 = 0;
  while( true ) {
    if (4 < local_8) {
      return 1;
    }
    if (local_30[local_8 * 2] + local_30[local_8 * 2 + 1] != 10) break;
    local_8 = local_8 + 1;
  }
  return 0;
}
*/

int main(){
    cout<<levelone();
}
