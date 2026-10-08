#include<stdio.h>

void Display(int iPtr[])        //even if not star we can give [ ] as like array
{
   printf("%d\n",*iPtr);
   iPtr++;          //moves 4 times pudhe as int

   printf("%d\n",*iPtr);

   iPtr++;          //moves 4 times pudhe as int

   printf("%d\n",*iPtr);

}

int main()
{
    int Arr[5] = {10, 20, 30, 40, 50};

    Display(Arr);

    return 0;
}