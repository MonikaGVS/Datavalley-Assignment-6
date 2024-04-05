import java.util.Scanner;

class Purchase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int price=sc.nextInt();
        double total=0;
        if(price>50)
        {
            total=price-(price*0.1);
        }
        else if(price>25 || price<50)
        {
            total=price-(price*0.05);
           
        }
        else
        {
        total=price;
        }
         System.out.println("Total purchase after discount is"+total);
    }
}