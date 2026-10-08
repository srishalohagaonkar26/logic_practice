import java.util.*;

class DigitX
{
    public int CountDigits(int iNo)         //now we want functiom return value so int
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;       //bcoz we want to count digits
            
            iNo = iNo / 10;
        }
        return iCount;
    }
}
class program83
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");

        DigitX dobj = new DigitX();     //
        int iValue = 0;         //to store input

        int iRet = 0;           //to catch return value of function beacse function's return is int

        iRet = dobj.CountDigits(iValue);

        iValue = sobj.nextInt();
        System.out.println("Number of digits are :"+iRet);
    }
}