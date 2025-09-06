//Tevyah Hanley 08/25/2025 M4 Programming Assignment
//This program makes use of method overloading to calculate the average of an array of numbers

public class Main {

    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        // Test the locateLargest and locateSmallest methods
        
        // Test with double array
        double[][] doubleArray = {
            {23.5, 35.2, 2.0, 10.0},
            {4.5, 3.0, 45.0, 3.5},
            {35.0, 44.0, 5.5, 9.6}
        };
        
        int[] largestLocation = locateLargest(doubleArray);
        int[] smallestLocation = locateSmallest(doubleArray);
        
        System.out.println("Double Array:");
        System.out.println("Largest element is at location [" + largestLocation[0] + "][" + largestLocation[1] + 
                          "] with value: " + doubleArray[largestLocation[0]][largestLocation[1]]);
        System.out.println("Smallest element is at location [" + smallestLocation[0] + "][" + smallestLocation[1] + 
                          "] with value: " + doubleArray[smallestLocation[0]][smallestLocation[1]]);
        
        // Test with int array
        int[][] intArray = {
            {1, 5, 3},
            {6, 1, 7},
            {8, 2, 9}
        };
        
        largestLocation = locateLargest(intArray);
        smallestLocation = locateSmallest(intArray);
        
        System.out.println("\nInteger Array:");
        System.out.println("Largest element is at location [" + largestLocation[0] + "][" + largestLocation[1] + 
                          "] with value: " + intArray[largestLocation[0]][largestLocation[1]]);
        System.out.println("Smallest element is at location [" + smallestLocation[0] + "][" + smallestLocation[1] + 
                          "] with value: " + intArray[smallestLocation[0]][smallestLocation[1]]);
    }
}
