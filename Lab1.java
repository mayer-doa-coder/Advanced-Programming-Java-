import java.util.Scanner;

public class Lab1
{
    public static void main(String[] args) 
    {
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int num=cin.nextInt();
        int []array=new int [num];
        System.out.println("Enter the elements: ");
        for(int i=0;i<num;i++)
        {
            array[i]=cin.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int srch=cin.nextInt();
        int cnt=0;
        for(int i=0;i<num;i++)
        {
            if(srch==array[i])
                cnt++;
        }
        System.out.println("Total Occurrence: ");
        System.out.println(cnt);
    }
}