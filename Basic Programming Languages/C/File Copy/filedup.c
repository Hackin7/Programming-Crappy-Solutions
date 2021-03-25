#include <stdio.h>

//https://www.tutorialspoint.com/cprogramming/c_file_io.htm
void main() {

   FILE *rf;
   rf = fopen("filedup.c", "rb");

   FILE *wf;
   wf = fopen("filedupcopy.c", "wb");

   char c = fgetc(rf);
   while (c != EOF){
    fputc(c, wf);
    c = fgetc(rf);
   }
   //fprintf(fp, "This is testing for fprintf...\n");
   //fputs("This is testing for fputs...\n", fp);
   fclose(rf);
   fclose(wf);
}
