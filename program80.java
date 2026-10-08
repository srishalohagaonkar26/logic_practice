import java.util.*;

class DigitX
{
    public void DisplayDigits(int iNo)
    {
        while(iNo != 0)
        { 
            System.out.println(iNo % 10);
            iNo = iNo / 10;
        }
    }
}
class program80
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