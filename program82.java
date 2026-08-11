import java.util.*;

class DigitX
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;
        
        for(; iNo != iDigit;  iNo = iNo / 10)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
        }
    }
}
class program82
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");

        DigitX dobj = new DigitX();     //
        int iValue = 0;         //to store input

        iValue = sobj.nextInt();
        dobj.DisplayDigits(iValue);     //function call
    }
}