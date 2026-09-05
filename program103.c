#include<stdio.h>

void CallByAddress(int *iPtr)
{
    (*iPtr)++;
}
int Arr[7];

int main()
{
    int iValue = 11;
    
    CallByAddress(&iValue);

    printf("Value after function call : %d\n",iValue);
    
    return 0;
}