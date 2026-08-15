import java.util.*;

class LB4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the number of units used : ");
        iNo = sobj.nextInt();
        
        int iUnits = 0;

        if (iUnits < 0) 
        {
            System.out.println("No.of units cant be negative");
            return;    
        }
        if (iUnits <= 100) 
        {
            System.out.println("Rupees 5 per unit ");
            System.out.println("Total units consumed is : "+iNo+" which costs in total "+iNo * 5+" rupees");
        }
        else if (iUnits > 100 && iUnits <= 200) 
        {
            System.out.println("Rupees 7 per unit ");
            System.out.println("Total units consumed is : "+iNo+" which costs in total "+iNo * 7+" rupees");
        }
        else
        {
            System.out.println("Rupees 10 per unit ");
            System.out.println("Total units consumed is : "+iNo+" which costs in total "+iNo * 10+" rupees");
        }
    }
}