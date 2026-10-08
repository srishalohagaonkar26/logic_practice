import java.util.*;

class LB5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iAmount = 0;
        int iDiscountAmount1 = 0; 
        int iDiscountAmount2 = 0; 

        System.out.println("Enter the total amount without discount : ");
        iAmount = sobj.nextInt();

        if (iAmount > 5000) 
        {
            iDiscountAmount1 = (int)(iAmount * (0.2));
            System.out.println("Your discount will be 20% i.e total "+iDiscountAmount1+" rupees");   
            System.out.println("Your total payable amount will be : "+(iAmount - iDiscountAmount1)); 
        }
        else if (iAmount > 2000) 
        {
            iDiscountAmount2 = (int)(iAmount * (0.1));
            System.out.println("Your discount will be 10% i.e total "+iDiscountAmount2+" rupees");   
            System.out.println("Your total payable amount will be : "+(iAmount - iDiscountAmount2));  
        }
        else 
        {
            System.out.println("No discount ");
        }
    }
}