import java.util.*;
public class ReverseInt {
  
        public static void main(String args[]) {
        
            System.out.println("Enter the number");
           Scanner sc=new Scanner(System.in);
          
           int n=sc.nextInt();
           int rev=0;
           while(n!=0)
           {
               int k=n%10;
               rev=rev*10+k;
               n=n/10;
           }
           System.out.print(rev);
      
        }
    }

