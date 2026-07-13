z/*
    START
        Accept no as No
        If No is completely divisible by 2 
            then priint even
        otherwise
            print odd
    STOP

    START
        Accept number as No
        Divide No as 2
        If remainder is 0
            then pritn as even
        otherwise
            print as odd
    STOP
*/

#include<stdio.h>
int main()
{
    int iValue = 0;
    int iRemainder = 0;

    printf("Enter number : \n");
    scanf("%d,&iValue");

    int iRemainder = iValue % 2;

    if(iRemainder == 0)
    {
        printf("Number is even\n");
    }
    else
    {
        printf("Number is odd\n");
    }
    return 0;
}