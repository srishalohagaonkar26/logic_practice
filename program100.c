#include<stdio.h>

int Arr[7];

int main()
{
    int Arr[5] = {0};

    printf("Enter the elements : \n");      //input
    int iCnt = 0;

    scanf("%d",&Arr[0]);
    scanf("%d",&Arr[1]);
    scanf("%d",&Arr[2]);
    scanf("%d",&Arr[3]);
    scanf("%d",&Arr[4]);

    printf("Elements of Array : \n");

    for(iCnt = 0; iCnt < 5; iCnt++)     //output
    {
        printf("%d\n",Arr[iCnt]);
    }
    
    return 0;
}