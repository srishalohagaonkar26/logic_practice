import java.util.*;

class problem8
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if (iNo % 2 == 0) 
        {
            System.out.println("Last Digit Even");    
        }
        else
        {
            System.out.println("Last Digit Odd");
        }
    }
}