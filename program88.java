import java.util.*;

class DigitX
{
    public void CountEvenOddDigits(int iNo)         
    {
        int iDigit = 0;
        int iCountEven = 0, iCountOdd = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;      //we get single digit
            if((iDigit % 2) == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
            iNo = iNo / 10;
        }
        System.out.println("no of even digits are :"+iCountEven);
        System.out.println("no of even digits are :"+iCountOdd);
    }
}
class program88
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX(); 

        iValue = 0;

        System.out.println("enter no : ");
        iValue = sobj.nextInt();

        dobj.CountEvenOddDigits(iValue);
        
    }
}