#include <stdio.h>

int main(int argc, char *argv[])
{
	int i;

	for( i = 1 ; i < 10000 ; i++ )
	{
		printf("%d,", i);
	}

	return 0;
}