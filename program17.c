#include<stdio.h>
#include<stdbool.h>

bool CheckEvenOdd(int iNo)
{
    int iRemainder = 0;

    if (iNo % 2 == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}
int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("enter no to check wether number is even or odd : ");
    printf("Enter number : \n");
    scanf("%d,&iValue");

    bRet = CheckEvenOdd(iValue);

    if(bRet)
    {
        printf("%d is even\n",iValue);
    }
    else
    {
        printf("%d is odd\n",iValue);
    }

    return 0;
}