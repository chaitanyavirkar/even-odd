import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int count=0;
        //int count1=0;

        //Scanner sc= new Scanner(System.in);
        //System.out.println("Enter the number :");
        //int a=sc.nextInt();
        int i,j;
       for( i=1;i<=100;i++)
       {
        for( j=2;j<=i;j++)
        {
            if(i%j==0){
               break;
            }
        }
        if(i==j){
          count++;
          System.out.print(i+" ");
        }
    }
    System.out.println("Total count of prime number is "+count);
    }
    
}
