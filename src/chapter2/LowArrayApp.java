package chapter2;

/**
 * Created by SeleniumGuru.com on 4/6/18.
 */
public class LowArrayApp {

    public static void main(String[] args){
        LowArray arr;
        arr = new LowArray(100);
        int nElems = 0;
        int j;

        arr.setElem(0, 77);
        arr.setElem(1, 27);
        arr.setElem(2, 67);
        arr.setElem(3, 47);
        arr.setElem(4, 66);
        arr.setElem(5, 87);
        arr.setElem(6, 97);
        arr.setElem(7, 26);
        arr.setElem(8, 22);
        arr.setElem(9, 17);
        nElems = 10;

        for(j=0; j<nElems; j++){
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println("");

        int searchKey = 26;
        for(j=0; j< nElems; j++){
            if (arr.getElem(j) == searchKey){
                break;
            }
        }

        if (j == nElems){
            System.out.println("Can't find the search key: " + searchKey);
        } else {
            System.out.println("Found the search key: " + searchKey);
        }

        //delete value 22
        for(j=0; j<nElems; j++){
            if (arr.getElem(j) == 22){
                break;
            }
        }

        //higher one down
        for(int k=j; k<nElems; k++){
            arr.setElem(k, arr.getElem(k+1));
        }
        nElems--; //decrement size;

        for(j=0; j<nElems; j++){
            System.out.print(arr.getElem(j) + " ");
        }

        System.out.println("");


    }
}
