#ifdef NDEBUG
#undef NDEBUG
#endif
#include<cassert>
#include<cstdio>
#include"square.h"

int main()
{
    static int m[SIZE][SIZE];
    int n;
    assert(scanf("%d",&n)==1&&1<=n&&n<=SIZE);
    for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
            assert(scanf("%d",&m[i][j])==1&&0<=m[i][j]&&m[i][j]<=1);
    //assert(scanf(" "));assert(getchar()==EOF);
    printf("%d\n",findMaxSquare(m,n));
    return 0;
}
