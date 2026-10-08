// WAP to accept no from user and check if its prime or not, loop breaks when factor is found
// in interview write flag program first and then interviewer will ask to write the code without the flag..then previous codes

import java.util.Scanner;

class NumberX
{
    public boolean CheckPrime(int iNo)
    {
    int iCnt = 0;
    
    for (iCnt = 2; iCnt <= (iNo/2); iCnt++) // not 1 , because every number is divisible by 1 
    {
        if ((iNo % iCnt) == 0)
        {
            return false;                   // not good programming practise
        }                                   // because program gets ended abruptly and cpu vr load yeto
    }       
    return true;              
    }
}

class program67
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        NumberX nobj  = new NumberX();
        nobj.CheckPrime(iValue);

        bRet = nobj.CheckPrime(iValue);

        if (bRet == true)
        {
            System.out.println("It is prime");
        }
        else
        {
            System.out.println("It is not prime");
        }
    }
}

// Time Complexity : O(N/2)
// Where N >= 0