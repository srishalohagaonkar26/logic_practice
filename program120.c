#include<stdio.h>
#include<stdlib.h>

int main()
{
    int *Brr = NULL;
    int iLength = 0;
    int iCnt = 0;

    //STEP 1 : Accept the numbers of elements.
    printf("Enter number of elements : \n");
    scanf("%d",&iLength);

    //STEP 2 : Allocate the memory
    Brr = (int *)malloc(iLength * sizeof(int));     //family pack of ice cream //we tell - memory allocate kar
        //typecast

    //STEP 3 : Accept the value from user
    
    printf("Enter the elements : \n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);     //input ghyaycha ahe mhnanun
    }

    //STEP 4 : Use the memory (LOGIC)
    


    //STEP 5 : Deallocate the memory
    free(Brr);

    return 0;
}