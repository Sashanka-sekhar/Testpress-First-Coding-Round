 import java.util.*;
public class ReverseString {
   

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the string");
       String st=s.nextLine();
       int n=st.length();
       for(int i=n-1;i>=0;i--)
       {
           System.out.print(st.charAt(i));
       }
       
    }
}

