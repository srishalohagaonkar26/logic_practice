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
    int Brr[iLength] = {10, 20, 30, 40};        //error

    Display(Brr, iLength);

    return 0;
}