import java.util.*;

class problem4
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if ((iNo % 5) == 0) 
        {
            System.out.println("Ends with 5");
            return;
        }
        else
        {
            System.out.println("Does not end with 5");
        }
    }
}