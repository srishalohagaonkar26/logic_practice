import java.util.*;

class DigitX
{
    public int ReverseNumber(int iNo)         //now we want functiom return value so int
    {
        int iDigit = 0;
        int iRev = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;      //we get single digit
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }
        return iRev;
    }
}
class program92
{
    public static void main(String[] args)
{
    Scanner sobj = new Scanner(System.in);
    DigitX dobj = new DigitX();
    int iValue = 0;        // declare FIRST
    int iRet = 0;

    System.out.println("Enter no : ");   // prompt
    iValue = sobj.nextInt();             // read input
    iRet = dobj.ReverseNumber(iValue);       // call function
    System.out.println("Reverse no is :" + iRet);
}
}