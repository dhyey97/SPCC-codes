#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>
void main()
{
   FILE *finput,*fmdt,*fmnt,*fpala, *fcala;
   char t1[20],t2[20],t3[20];
   int count=0;
   finput=fopen("input.txt","r");
   fmdt=fopen("mdt.txt","w");
   fmnt=fopen("mnt.txt","w");
   fpala=fopen("pala.txt","w");
   fcala=fopen("cala.txt","w");

   fscanf(finput,"%s%s%s",t1,t2,t3);
   while(count!=2)
   {
       if(strcmp(t1,"Macro")==0)
       {
           fprintf(fmdt,"\t%s\t%s\n",t2,t3);
           fprintf(fmnt,"%s\n",t2);
           fprintf(fpala,"%s\n",t3);
           fscanf(finput,"%s%s%s",t1,t2,t3);
       }

       else if(strcmp(t1,"Mend")==0)
       {

           fprintf(fmdt,"%s\n",t1);
           count++;
           strcpy(t1,t2);
           strcpy(t2,t3);
           fscanf(finput,"%s",t3);
       }
       else
       {
           fprintf(fmdt,"%s\t%s\t%s\n",t1,t2,t3);
           fscanf(finput,"%s%s%s",t1,t2,t3);
       }

   }
   fprintf(fcala,"%s\n",t2);
   fscanf(finput,"%s\n",t1);
   fprintf(fcala,"%s\n",t1);
   fclose(finput);
   fclose(fmdt);
   fclose(fmnt);
   fclose(fpala);
   fclose(fcala);
}
