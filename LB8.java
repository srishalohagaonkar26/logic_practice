import java.util.Scanner;

class LB8
{
    public static void main(String A[])
    {
        int AvailableStock = 0;
        int RemainingStock = 0;
        int RequestedStock = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the quantity of current stock : ");
        AvailableStock = sobj.nextInt();

        System.out.println("Enter the requested quantity : ");
        RequestedStock = sobj.nextInt();

        if (RequestedStock <= 0) 
        {
            System.out.println("Please enter a valid number ");
            return;    
        }
        
        if (RequestedStock > AvailableStock) 
        {
            System.out.println("Order Fail : Insufficient stock");
            System.out.println("Deduct some quantity");
            return;    
        }
        else
        {
            System.out.println("Order placed successfully");
        }
        RemainingStock = (AvailableStock - RequestedStock);
        System.out.println("Remaining stock now is : "+RemainingStock);

        if (RemainingStock < 5) 
        {
            System.out.println("ALERT : Low stock alert");    
        }
    }
}