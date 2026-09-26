#include<stdio.h>

int Summation(int Arr[], int iSize)  //lime 17 cha 4 size mdhe pakadla
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        iSum = iSum + Arr[iCnt];        //to count the given numbers chi addition
    }
    return iSum;        //to store the addition of elements
}

int main()
{
    int iLength = 4;
    int Brr[iLength];
    int iCNT = 0;
    int iRet = 0;

    printf("Enter the elements : ");

    for(iCNT = 0; iCNT < iLength ; iCNT++)
    {
       scanf("%d",&Brr[iCNT]);  //every number chi value gheun store krycha ahe mhnun ani itke nnumber cha value lihit basnya peksha sglyancha ek ch(generelised)
    }
    iRet = Summation(Brr, iLength);     //1st parameter - call by address       //2nd  parameter - call by  value

    printf("Addition of elements are : %d\n",iRet);     //this will print the addition on screen 

    return 0;
}