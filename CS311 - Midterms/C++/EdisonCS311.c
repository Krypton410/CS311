#include <stdio.h>
int 
main () 
 
{
  
 
int prelim, midterm, finals, total;
double average;
  

 
printf ("Prelims: ");
  
 
scanf ("%d", &prelim);
  
 
printf ("Midterms: ");
  
 
scanf ("%d", &midterm);
  
 
printf ("Finals: ");
  
 
scanf ("%d", &finals);
  
 
 
total = prelim + midterm + finals;
average = prelim*.3 + midterm*.3 + finals*.4;
  
 
if (average >= 75)
    
 
printf ("\n Result: :) ");
  
 
  else if (!average >= 75)
    
 
printf ("\n:(");
  
  
printf ("\n Average:%0.2f\n", total / 3.0);
  
 
 
 
 
return 0;

 
}


 
 
