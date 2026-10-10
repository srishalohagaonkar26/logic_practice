import java.util.*;

class DigitCount
{
    int digitCount(int iCheck)
    {
        int iCount = 0;
        int iNo = iCheck;
        int iDigit = 0;

        if (iNo >= 0) 
        {
            while (iNo > 0) 
            {
                iDigit = iDigit % 10;
                iCount++;
                iDigit = iDigit / 10;
            }
        }
        else
        {
            System.out.println("Invalid transaction I'D ");
        }
        return iCount;
    }
}

class digitCounter_3
{
    public static void main(String[] A) 
    {
        int iValue = 0 , iRet = 0 ;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the transaction ID : ");
        iValue = sobj.nextInt();

        DigitCount dobj = new DigitCount();
        iRet = dobj.digitCount(iValue);         //  to call any method from main function we need its object

        System.out.println("Total Digits : "+iRet);
    }
}