import java.util.*;

class problem6
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if (iNo == 0) 
        {
            System.out.println("Zero");    
        }
        else if(iNo > 0)
        {
            System.out.println("Positive number");
        }
        else
        {
            System.out.println("Negative number");
        }
    }
}