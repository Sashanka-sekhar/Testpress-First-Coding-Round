import java.util.*;
public class MinMaxOfArr{
    public static void main(String args[]) {
    
    System.out.println("Enter size of array");
   Scanner sc=new Scanner(System.in);
    
   int n=sc.nextInt();
   System.out.println("enter all elements");
   int[]arr={54,546,548,60};
     for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
        {
          min=Math.min(arr[i],min);
          max=Math.max(arr[i],max);
        }  
        System.out.println(max+" "+min);
    }
}