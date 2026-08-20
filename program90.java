import java.util.*;

class DigitX
{
    public int SumDigits(int iNo)         //now we want functiom return value so int
    {
        int iSum = 0;

        while(iNo != 0)
        {
            iSum = iSum + (iNo % 10);

        }
        return iSum;
    }
}
class program90
{
    public static void main(String[] args)
{
    Scanner sobj = new Scanner(System.in);
    DigitX dobj = new DigitX();
    int iValue = 0;        // declare FIRST
    int iRet = 0;

    System.out.println("Enter no : ");   // prompt
    iValue = sobj.nextInt();             // read input
    iRet = dobj.SumDigits(iValue);       // call function
    System.out.println("Summation of digits :" + iRet);
}
}