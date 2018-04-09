/**
 * Created by SeleniumGuru.com on 4/6/18.
 */
public class baseballDatabase {

    public static void main(String[] args) {
        long[] arr = new long[100];
        int nElems = 0;
        int j;
        long searchKey;

        arr[0] = 27;
        arr[1] = 21;
        arr[2] = 22;
        arr[3] = 43;
        arr[4] = 66;
        arr[5] = 21;
        arr[6] = 52;
        arr[7] = 55;
        arr[8] = 22;
        arr[9] = 46;
        nElems = 10;

        //display items
        for(j = 0; j < nElems; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        searchKey = 66;
        for(j = 0; j < nElems; j++){
            if (arr[j] == searchKey) {
                break;
            }
        }

        if (j == nElems) {
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        searchKey = 55;
        for(j=0; j<nElems; j++){
            if(arr[j] == searchKey){
                break;
            }
        }

        //use for loop for the other elements after the finding the key which is nth element
        //then use arr[k] = nth element where you find the element

        for(int k=j; k<nElems; k++){
            arr[k] = arr[k+1];
        }
        nElems--;

        //display items
        for(j = 0; j < nElems; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println("");


    }
}
