package arrays.practiceQues;

public class arrayProduct {
    //  Calculate the product of all the elements in the given array.

    public static void main(String[] args) {
        // Example array
        int[] array = {2, 3, 4, 5};
        // Calculate the product
        long product = calculateProduct(array); // function call
        // Print the result
        System.out.println("Product of array elements: " +
                product);
    }
    private static long calculateProduct(int[] array) { // function to calculate the product
        // Initialize the product to 1
        long product = 1;
        // Multiply each element to the product
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }
}
