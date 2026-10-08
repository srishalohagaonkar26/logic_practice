//input : 5
//output : 1 2 3 4 5

#include<stdio.h>

int main()
{
    int iCnt = 0;

    iCnt = 1;

    while (iCnt <= 5)
    {
        printf("%d\n",&iCnt);    /* code */
    }
   
    iCnt++; 
    return 0;
}