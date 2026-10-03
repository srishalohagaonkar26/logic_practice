#include <stdio.h>
#include <stdlib.h>

int CountEven(int Arr[], int iSize)
{
    int iCnt = 0;
    
    int iSum = 0;

    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
        if (Arr[iCnt % 2] == 0)
        {
            iSum = iSum + Arr[iCnt];  //if divisible by 2 tar ach pudhe ja
        }
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

    iRet = CountEven(Brr , iLength);
    printf("Even elements are : %d\n",iRet);

    return 0;
}