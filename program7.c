#include<stdio.h>

int main()
{
    float fValue1 = 0.0f;                   //to store 1st input
    float fValue2 = 0.0f;                   //to store 1st input
    float fResult = 0.0f;                   //to store the result


    printf("Enter 1st no: \n");             
    scanf("%f",&fValue1);                   

    printf("Enter 2nd no: \n");
    scanf("%f",&fValue2);

    fResult = fValue1 + fValue2;

    printf("Addition is : %f\n",fResult);   //perform the addition

    return 0;
}
