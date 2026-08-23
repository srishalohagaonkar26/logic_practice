import java.util.*;

class DigitX
{
    public boolean CheckPalindrome(int iNo)         //check wether qeueston use only bool
    {
        int iDigit = 0;
        int iRev = 0;

        int iTemp = 0;  
        
        iTemp = iNo;        ////xerox copy as we copy value of iNo in iTemp as afterwards iNo= 0

        while(iNo != 0)
        {
            iDigit = iNo % 10;      //we get single digit
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }
        if(iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class program93
{
    public static void main(String[] args)
{
    Scanner sobj = new Scanner(System.in);
    DigitX dobj = new DigitX();
    int iValue = 0;        // declare FIRST
    boolean bRet = false;

    System.out.println("Enter no : ");   // prompt
    iValue = sobj.nextInt();             // read input
    bRet = dobj.CheckPalindrome(iValue);       // call function
    if(bRet == true)
    {
        System.out.println("Number  is palindrome");
    }
    else
    {
        System.out.println("Number is not Palindrome");
    }
}
}