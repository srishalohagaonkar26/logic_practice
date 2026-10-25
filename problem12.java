import java.util.*;

class problem12
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigit = 0;
        int iReverse = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        int iOg = iNo;

        while (iNo > 0) 
        {
            iDigit = iNo % 10;
            iReverse = (iReverse * 10) + iDigit;    //  actual logic to reverse the number
            iNo = iNo / 10;    
        }

        if (iOg == iReverse) 
        {
            System.out.println("It is a palindrome");    
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}