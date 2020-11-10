#include<stdio.h>
int main(void)
{
	float x,i;
	for(i=5,x=0;i>0;i--){
		x=(x+1000)/(1+12*1.875/100);
	}
	printf("He must save %.2f at the first year.\n",x);
    return 0;
 }

