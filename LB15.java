import java.util.Scanner;

class LB15
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iBattery = 0;
        String iStatus = "";

        System.out.println("Enter your battery percentage : ");
        iBattery = sobj.nextInt();

        if (iBattery < 0 && iBattery > 100) 
        {
            System.out.println("Invalid integer");  
            return;  
        }

        if (iBattery <= 5) 
        {
            iStatus = "Critical";    
        }
        else if(iBattery <= 15)
        {
            iStatus = "Low";
        }
        else 
        {
            iStatus = "Normal";
        }

        System.out.println("Your battery percentage is : "+iBattery);
        System.out.println("Your battery status is : "+iStatus);
    }
}