import java.util.Scanner;

public class SumNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int sum = 0;

        System.out.println("Enter any numbers (Enter -1 to stop):");
        
        while (true)
        {
            x = sc.nextInt();
            if (x == -1)
            {
                break; // Stop input when -1 is entered
            }
            sum += x;
        }

        System.out.println("Sum is " + sum);
    }
}

public class FindMax
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count;
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value

        System.out.println("How many numbers do you wish to input?");
        count = sc.nextInt();

        System.out.println("Enter the numbers:");
        
        for (int i = 0; i < count; i++)
        {
            int input = sc.nextInt();
            if (input > max)
            {
                max = input;
            }
        }

        System.out.println("The largest number is " + max);
    }
}

public class FindMax
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count;
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value

        System.out.println("How many numbers do you wish to input?");
        count = sc.nextInt();

        System.out.println("Enter the numbers:");
        
        for (int i = 0; i < count; i++)
        {
            int input = sc.nextInt();
            if (input > max) 
            {
                max = input;
            }
        }

        System.out.println("The largest number is " + max);
    }
}
