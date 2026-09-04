#include<stdio.h>

void CallByValue(int iNo)
{
    iNo++;
}
int Arr[7];

int main()
{
    int iValue = 11;
    
    CallByValue(iValue);

    printf("Value after function call : %d\n",iValue);
    
    return 0;
}