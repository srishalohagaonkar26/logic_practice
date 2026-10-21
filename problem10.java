import java.util.*;

class problem10
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iBatchNumber = 0;

        System.out.println("Enter your batch number : ");
        iBatchNumber = sobj.nextInt();

        if (iBatchNumber % 10 == 0) 
        {
            System.out.println("Priority Batch");    
        }
        else
        {
            System.out.println("Normal Batch");
        }
    }
}