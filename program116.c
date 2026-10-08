#include<stdio.h>

void Display(int Arr[], int iSize)  //lime 17 cha 4 size mdhe pakadla
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("%d\n",Arr[iCnt]);
    }
}

int main()
{
    int iLength = 4;
    int Brr[iLength];
    int iCNT = 0;

    printf("Enter the elements : ");

    for(iCNT = 0; iCNT < iLength ; iCNT++)
    {
       scanf("%d",&Brr[iCNT]);
    }
    Display(Brr, iLength);

    return 0;
}