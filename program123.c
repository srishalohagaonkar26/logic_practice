#include <stdio.h>
#include <stdlib.h>

int Summation(int Arr[], int iSize)
{
    int iCnt = 0;
    iSize = 0;
    int iSum = 0;

    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
        iSum = iSum + Arr[iCnt];    
    }
    return iSum;  
}

int main()
{
    int iLength = 0; int iCnt = 0;
    int *Brr = NULL; int iRet = 0;
    
    printf("Enter the number of elements : ");
    scanf("%d",&iLength); //atta size user kadun ghetli

    Brr = (int * )malloc(sizeof(int) * iLength);

    printf("enter the elements : \n");

    for ( iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d", &Brr[iCnt]);
    }

    iRet = Summation(Brr , iLength);
    printf("Summation of numbers : %d"+iRet);

    return 0;
}