import java.util.Scanner;
class Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int qu1,qu2,rem1,rem2;
        if(num%7==0 && num%13==0)
        {
            qu1=num/7;
            rem1=num%7;
            qu2=num/13;
            rem2=num%13;
        System.out.println("The quotient of 7 is"+qu1+"and  reminder is"+rem1);
         System.out.println("The quotient of 13 is"+qu2+"and reminder is"+rem2);
        }
        else
        {
            System.out.println(num+" is not divisible by 7 and 13");
        }
    }
}