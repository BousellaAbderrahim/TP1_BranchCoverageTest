import org.example.BinarySearchCorrection;

public class BinarySearchCorrectionTest {

    public static void main(String[] args) {
        // Test cases
        int[] array1 = {1, 3, 5, 7, 9};
        System.out.println(BinarySearchCorrection.binarySearch(array1, 3));  // Devrait retourner 1
        System.out.println(BinarySearchCorrection.binarySearch(array1, 9));  // Devrait retourner 4
        System.out.println(BinarySearchCorrection.binarySearch(array1, 0));  // Devrait retourner -1
        System.out.println(BinarySearchCorrection.binarySearch(array1, 10)); // Devrait retourner -1

        int[] array2 = {-5, 0, 2, 4, 8, 10};
        System.out.println(BinarySearchCorrection.binarySearch(array2, 4));   // Devrait retourner 3
        System.out.println(BinarySearchCorrection.binarySearch(array2, -5));  // Devrait retourner 0
        System.out.println(BinarySearchCorrection.binarySearch(array2, 10));  // Devrait retourner 5
        System.out.println(BinarySearchCorrection.binarySearch(array2, 7));   // Devrait retourner -1
        // Des tests supplémentaires peuvent être ajoutés au besoin

        int[] array0 = null;
        System.out.println(BinarySearchCorrection.binarySearch(array0, 0));
    }
}
