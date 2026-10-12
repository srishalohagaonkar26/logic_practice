import java.util.*;

class problem5
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if ((iNo % 3 == 0) && (iNo % 5 == 0)) 
        {
            System.out.println("Valid Number");
            return;
        }
        else
        {
            System.out.println("Invalid Number");
        }
    }
}