#include<stdio.h>

int main()
{
    printf("please input the height and the radius:\n");
    double PAI = 3.14159;
    int h,r;
    scanf("%d,%d",&h,&r);
    double v;
    v = PAI * r * r * h;
    int t;
    t = 20.0 / v;
    if (20 % (v !=0))
    {
        printf("%d",t+1);
    }
    else
    printf("%d",t);
    return 0;
    
}



