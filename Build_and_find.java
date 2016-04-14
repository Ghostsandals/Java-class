import java.util.Arrays;
import java.util.Scanner;


public class Build_and_find {
	public static void buildAndFind() {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.println("Enter 10 numbers.");
        for(int i = 0; i < nums.length; i++) {
                System.out.print("Number " + (i+1) + ": ");
                nums[i] = in.nextInt();
        }
        System.out.println("You entered: " + Arrays.toString(nums));
        System.out.print("Now, enter a number to search for: ");
        int search = in.nextInt();
        int found = 0;
        for(int i = 0; i < nums.length; i++) {
                if(nums[i] == search) {
                        found++;
                }
        }
        in.close();
        System.out.println("Searching for " + search + ", found " + found + " of them." );

	
	
	} 
}
