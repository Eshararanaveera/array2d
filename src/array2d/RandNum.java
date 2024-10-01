package array2d;
import java.util.Random;
public class RandNum {

	
	


	    // 5x5 2D array to store 25 random integers
	    private int[][] arr = new int[5][5];

	    // Constructor to generate random numbers and populate the array
	    public RandNum() {
	        Random random = new Random();
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                arr[i][j] = random.nextInt(100) + 1; // Random number between 1 and 100
	            }
	        }
	    }

	    // Method to calculate the minimum value
	    public int getMin() {
	        int min = arr[0][0];
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (arr[i][j] < min) {
	                    min = arr[i][j];
	                }
	            }
	        }
	        return min;
	    }

	    // Method to calculate the maximum value
	    public int getMax() {
	        int max = arr[0][0];
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (arr[i][j] > max) {
	                    max = arr[i][j];
	                }
	            }
	        }
	        return max;
	    }

	    // Method to calculate the average value
	    public double getAverage() {
	        int sum = 0;
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                sum += arr[i][j];
	            }
	        }
	        return sum / 25.0; // Dividing by the total number of elements (25)
	    }

	    // Method to display the array, minimum, maximum, and average
	    public void display() {
	        System.out.println("Array elements:");
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                System.out.print(arr[i][j] + "\t");
	            }
	            System.out.println();
	        }
	        System.out.println("Minimum value: " + getMin());
	        System.out.println("Maximum value: " + getMax());
	        System.out.println("Average value: " + getAverage());
	    }

	    public static void main(String[] args) {
	        // Create an instance of RandNum and display the values
	        RandNum randNum = new RandNum();
	        randNum.display();
	    }
	

	
	
}
