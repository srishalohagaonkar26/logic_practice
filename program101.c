#include<stdio.h>

int Arr[7];

int main()
{
    int Arr[5] = {0};

    printf("Enter the elements : \n");      //input
    int iCnt = 0;

    for(iCnt =  0; iCnt < 5; iCnt++);
    {
        scanf("%d",&Arr[iCnt]);
    }

    printf("Elements of Array : \n");

    for(iCnt = 0; iCnt < 5; iCnt++)     //output
    {
        printf("%d\n",&Arr[iCnt]);
    }
    
    return 0;
}