import java.util.*;

class LB1
{
    public static void main(String A[])
    {
        int iNo = 0;
        int Arr[] = new int[100];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no of days you borrowed the book for : ");
        iNo = sobj.nextInt();

        if (iNo < 0) 
        {
            System.out.println("Invalid Input");
            return;
        }
        else if (iNo <= 7) 
        {
            System.out.println("No fine");    
        }
        else if (iNo >= 8 && iNo <= 12) 
        {
            System.out.println("You need to pay rupees 5/- per day");   
            
            int FineAmount = (iNo - 7) * 5;
            
            System.out.println("Total fine you would need to pay is : "+FineAmount);
        }
        else if (iNo > 12) 
        {
            System.out.println("You need to pay rupees 10/- per day");

            int FineAmount = 25 * (iNo - 12) * 10;

            System.out.println("Total fine you would need to pay is : "+FineAmount);
        }
    }
}