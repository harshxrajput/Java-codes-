#include<stdio.h>
#include<stdlib.h>

int main(){

    int n ;
    scanf("%d",&n);

   int a=n/10;
   int b=n%10;
   int c=b*1000+a;
    printf("%d",c);
    // printf("%d\n",n/10);
    // printf("%d\n",n/100);
    // printf("%d\n",n%10);
    // printf("%d\n",n%100);
    
return 0;
}