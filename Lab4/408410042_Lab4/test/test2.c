#include <stdio.h>
int main()
{
   int a;
   int b;
   a = 50;
   printf("Announce a = 50\n");
   
   b = a - 2*(-a);
   printf("b = a - 2*(-a) = %d\n", b);
   if(a>b) printf("a>b\n");
   else printf("a<=b\n");
  
	return 0;
}
