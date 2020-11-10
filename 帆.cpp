#include <stdio.h>

int main()
{
    int a,b;
    float c;
    printf("请输入两个整数：");
    scanf("%d %d\n",&a,&b);
    c=100.0*a/b; 
    printf("%d is %.1f percent of %d",a,c,b);
}

