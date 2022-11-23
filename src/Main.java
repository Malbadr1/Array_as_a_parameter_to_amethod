import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    
    
    
    public static void fillArray(double[]arr)
    {
        


        for (int i = 0; i < arr.length; i++) {
            
            Scanner input1=new Scanner(System.in);
            System.out.println("enter element NO: "+(i+1));
             arr [i]=input1.nextDouble();
             
            
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int searchArray(double[]id,int target){

        for (int i = 0; i < id.length; i++) {
            if (id[i]==target);
            return i;
        }
        return -1;

    }
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println("enter length of array");
        int lengthOfArray=input.nextInt();
        double []id= new double[lengthOfArray];
       fillArray(id);

        System.out.println("enter employee id fro search");
         int target =input.nextInt();


        System.out.println( searchArray(id,target));
    }
}