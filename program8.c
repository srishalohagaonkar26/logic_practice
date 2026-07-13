#include<stdio.h>

float AddTwoNumbers(float fNo1, float fNo2)
{
    float fAns = 0.0f;

    fAns = fNo1 + fNo2;

    return fAns;
}

int main()
{
    float fValue1 = 0.0f;                   //to store 1st input
    float fValue2 = 0.0f;                   //to store 1st input
    float fResult = 0.0f;                   //to store the result


    printf("Enter 1st no: \n");             
    scanf("%f",&fValue1);                   

    printf("Enter 2nd no: \n");
    scanf("%f",&fValue2);

    fResult = AddTwoNumbers(fValue1 , fValue2);

    printf("Addition is : %f\n",fResult);   
    return 0;
}
