import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for(int i = 0; i < dataPoints.length; i++)
        {
            System.out.printf("%4d", dataPoints[i]);
            if(i % 30 == 0)
            {
                System.out.println("");
            }
        }
        System.out.println("");

        for(int i = 0; i < dataPoints.length; i++)
        {
            System.out.printf("%3d |", dataPoints[i]);
        }
        System.out.println("");

        int sum = 0;
        int avg = 0;
        for(int i = 0; i < dataPoints.length; i++)
        {
            sum = sum + dataPoints[i];  // sum += e
        }
        avg = sum / dataPoints.length;

        System.out.println("The sum of the value in dataPoints is " + sum);
        System.out.println("The average of the value in  dataPoints is " + avg);

        int userValue = 0;
        int count = 0;
        userValue = SafeInput.getRangedint(in, "Enter your integer value in the range ", 1, 100);
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == userValue)
            {
                count = count +1;
            }
        }
        System.out.println("The number of times the loop found the user's value is: " + count);
        
        boolean foundTarget = false;
        userValue = SafeInput.getRangedint(in, "Enter your integer value in the range ", 1, 100);
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == userValue)
            {
                foundTarget = true;
                System.out.println("Breaking! Found " + userValue + " at index " + i);
                break;
            }
        }
        if (!foundTarget)
        {
            System.out.println("Target " + userValue + " not found!");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(min > dataPoints[i])
            {
                min = dataPoints[i];
            }
            if(max < dataPoints[i])
            {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum values in the dataPoints array is: " + min);
        System.out.println("The maximum values in the dataPoints array is: " + max);

    }
}
