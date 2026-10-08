import java.util.Scanner;

class LB13
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iWeight = 0;
        int iTotal = 0;
        
        System.out.println("Enter parcel weight : ");
        iWeight = sobj.nextInt();

        if (iWeight == 0) 
        {
            return;    
        }

        if (iWeight == 1) 
        {
            iTotal = iTotal + 50;
        }
        else if(iWeight > 1 && iWeight <= 5)
        {
            iTotal = iTotal + 50 + (20 * (iWeight - 1));
        }
        else
        {
            iTotal = iTotal + 150 + (20 * (iWeight - 1));
        }

        System.out.println("Parcel weight is : "+iWeight);
        System.out.println("Courier Charge : rupees "+iTotal);
    }
}