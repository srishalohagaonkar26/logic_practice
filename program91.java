import java.util.*;

class DigitX
{
    public int SumEvenDigits(int iNo)         //now we want functiom return value so int
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;      //we get single digit
            if((iDigit % 2)==0)
            {
                iSum = iSum + iDigit;
            }  
        }
        return iSum;
    }
}
class program91
{
    public static void main(String[] args)
{
    Scanner sobj = new Scanner(System.in);
    DigitX dobj = new DigitX();
    int iValue = 0;        // declare FIRST
    int iRet = 0;

    System.out.println("Enter no : ");   // prompt
    iValue = sobj.nextInt();             // read input
    iRet = dobj.SumEvenDigits(iValue);       // call function
    System.out.println("Summation of digits :" + iRet);
}
}