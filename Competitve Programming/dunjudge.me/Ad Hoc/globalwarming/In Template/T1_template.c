/*--------------------------------*/
/*       TASK 1  GLOBAL WARMING   */
/*--------------------------------*/

#include<stdio.h>
#include<stdlib.h>


/*--------------------------------*/
/*   main routine                 */
/*--------------------------------*/
int GW ( int size,
         int *H )
{
 int max;

 /*********************************/
 /*    Fillin your program here   */
 /*********************************/

 return (max);
}


int main()
{
   int  size;
   int  *H;
   int  i;
   int  NumberOfIslands;

   /*------------------------*/
   /* R e a d    i n p u t   */
   /*------------------------*/
   scanf ("%d",  &size );
   H = malloc ( size* sizeof(int) );

   for (i=0; i<size; i++)
     {  scanf ("%d",  &H[i] );  }

   NumberOfIslands =   GW ( size, H );

   printf ( "%d\n", NumberOfIslands );

}
