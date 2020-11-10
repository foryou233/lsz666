#include<stdio.h>
int main(void)
{
	int i,j,k=0,sum=0;
	for(i=500;i>1;i--){
		for(j=i-1;j>0;j--){
			if(i%j==0){
				break;
			}
		}
			if(j==1){
				printf("%6d",i);
				sum=sum+i;
				k++;
			}
		if(k==10){
			break;
		}
	}
	printf("\n sum=%d\n",sum);
	
    return 0;
 }

