import java.util.*;
public class Prime {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number");
       int st=s.nextInt();
       int c=0;
       if(st==0||st==1)
       {
           System.out.println("No");
       }
       else{
             for(int i=1;i<=st;i++){
                 if(st%i==0)
                {
                  c++;
                }
              }
        if(c==2)
          {
           System.out.println("Yes");
          }
        else{
            System.out.println("No");
            }
       }
       
       
       
    }

}
