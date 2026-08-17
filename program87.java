import java.util.*;

class DigitX
{
    public int CountEvenDigits(int iNo)         //now we want functiom return value so int
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;      //we get single digit
            if((iDigit % 2) != 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}
class program86
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        System.out.println("enter no : ");

        DigitX dobj = new DigitX();     //
        
        int iRet = 0;           //to catch return value of function beacse function's return is int

        iRet = dobj.CountEvenDigits(iValue);
        int iValue = 0;         //to store input

        System.out.println("Number of odd digits are :"+iRet);
    }
}