#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool LinearSearch(int Arr[], int iSize) //function prototype
{
    int iCnt = 0;
    bool bFlag = false;
    int iSum = 0;

    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
       if (Arr[iCnt] == 11)
       {
            bFlag = true;
            break;  //jithe asel 11 tithun direct exit marto ugach akkha loop firat basat nahi
       }
    }
    return bFlag;  
}

int main()
{
    int iLength = 0; int iCnt = 0;
    int *Brr = NULL; 
    bool bRet = false;
    
    printf("Enter the number of elements : ");
    scanf("%d",&iLength); //atta size user kadun ghetli

    Brr = (int * )malloc(sizeof(int) * iLength);

    printf("enter the elements : \n");

    for ( iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d", &Brr[iCnt]);
    }

    bRet = LinearSearch(Brr , iLength);
    
    if (bRet == true)
    {
        printf("Element is present \n");
    }
    else
    {
        printf("Element is not present \n");
    }

    return 0;
}