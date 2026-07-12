/*
    Algorithm

    START
        accpet 1st no as no1
        accept 2nd no as no2
        perform addition of no1 and no2
        display the result
    STOP
*/

#include<stdio.h>

int main()
{
    //variable creation with default values
    float i = 0.0f, j = 0.0f, k = 0.0f;

    printf("Enter 1st no: \n");
    scanf("%f",&i);

    printf("Enter 2nd no: \n");
    scanf("%f",&j);

    k = i + j;

    printf("Addition is : %f\n",k);

    return 0;
}
