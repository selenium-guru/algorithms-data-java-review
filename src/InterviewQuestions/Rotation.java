package InterviewQuestions;

/**
 * Created by SeleniumGuru.com on 4/24/18.
 */
public class Rotation {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
//        System.out.println(isRotation(array1, array2a));  //should return false.
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
//        System.out.println(isRotation(array1, array2b)); //should return true.
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        System.out.println(isRotation(array1, array2c)); //should return false.
//        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
//        System.out.println(isRotation(array1, array2d)); //should return false.
//        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
//        System.out.println(isRotation(array1, array2e)); //should return false.
//        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(isRotation(array1, array2f)); //should return true.
    }

    // Implement your solution below.
    public static Boolean isRotation(int[] array1, int[] array2) {
        //find out first if they are of same length
        //find out if they are duplicates
        //return false if array length is different
        //use first array of A and do for loop in Array B
        //return false if there is no match
        //use second array of B and do for loop in Array A
        //return false if there is no match
        //return true at the end
        int key = array1[0];  //initialize the first key in array1
        int keyLoc = -1;       //initialize the value to be 1
        if (array1.length != array2.length) //return false if array1 and array2 are not equal
            return false;

        //for loop to find out if the array1 value is present in array2
        for(int i=0; i<array2.length;i++){
            if (array2[i] == key) {
                keyLoc = i;
                break;
            }
        }

        //if no element present return false
        if (keyLoc == -1){
            return false;
        }

        //for loop to find out if the array2 value is present in array1
        for(int i=0; i<array1.length; i++){
            int k = (keyLoc+i) % array1.length;
            if (array1[i] != array2[k]) {
               return false;
            }
        }

        return true;
    }
}
