package TimoSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting_Algorithms_Timo {

    public static void main(String[] args) {


        //List<Integer> unsorted = new ArrayList<>();
        //unsorted = Arrays.asList(22, 221,1324,0,1231,321,12,54,12,73,21,57,84,0,2,5,2,7,5);

        //System.out.println(unsorted);
        //System.out.println(selectionSort(unsorted));

        int[] b = {1,2,2,1,5,7,2,2,5,9,0,1};
        System.out.println(Arrays.toString(insertionSort2(b)));
    }

    //SELECTION SORT WITH ARRAY

    public static int[] selectionsSort(int[] a){
        for(int startPos = 0; startPos<a.length; startPos++){
            //RESET BOTH PARAMETERS TO START VALUE
            int sni = startPos;
            int num = a[startPos];

            for(int j = startPos; j<a.length; j++){
                //FIND THE SMALLEST NUMBER INDEX "sni"
                if(num>a[j]){
                    num = a[j];
                    sni = j;
                }
            }
            //SWAP THE TWO NUMBERS
            int bre = a[startPos];
            a[startPos] = a[sni];
            a[sni] = bre;
        }
        return a;
    }

    //SELECTION SORT WITH LIST

    public static List<Integer> selectionSort(List<Integer> a){
        int placeholder = 0;
        for(int i = 0; i<a.size(); i++){
            //FIND THE MIN VALUE
            for(int j = i; j<a.size(); j++){
                if(a.get(j)<a.get(placeholder)){
                    placeholder = j;
                }
            }
            int temp = a.get(i);
            a.set(i,a.get(placeholder));
            a.set(placeholder,temp);
            //a.set(i, a.get(i) + a.get(placeholder));
            //a.set(placeholder, a.get(i) - a.get(placeholder));
            //a.set(i, a.get(i) - a.get(placeholder));
        }
        return a;
    }

    //INSERTION SORT WITH ARRAY

    public static int[] insertionSort(int[] a){
        for(int i = 1; i<a.length; i++){     //LOOP THROUGH EACH NUMBER
            int value = a[i];               //TAKE ONE NUMBER i = value
            int j = i;
            System.out.println("V:"+value);
            while(a[j-1] > value){    //COUNT DOWN FROM THAT INDEX UNTIL YOU FIND SMALLER VALUE AT INDEX j-1
                a[j] = a[j - 1];               //MOVE NUMBER AT j TO THE RIGHT TO MAKE SPACE FOR INSERTION
                j--;
                if(j==0) break; //safety
                System.out.println(Arrays.toString(a));
            }
            a[j] = value;                       //j IS CORRECT INDEX WITH ALL NUMBERS ABOVE MOVED RIGHTWARDS ALREADY
        }

        return a;
    }

    //MERGE SORT WITH ARRAY (2 METHODS)
    public int[] mergeSort(int[] a){
        if(a.length>1){
            int[] left = Arrays.copyOfRange(a,0,a.length/2);
            int[] right = Arrays.copyOfRange(a,a.length/2,a.length);
            left = mergeSort(left);
            right = mergeSort(right);
            a = merge(left,right);
            System.out.println(Arrays.toString(a));
        }
        return a;
    }
    public static int[] merge(int[] left, int[] right){
        int[] a = new int[left.length + right.length]; //CREATE NEW ARRAY FOR RESULT
        int ri = 0;
        int li = 0;

        while(ri<(right.length) && li<(left.length)){
            if(left[li]<right[ri]){
                a[ri+li] = left[li];
                li++;
            }
            else{
                a[ri+li] = right[ri];
                ri++;
            }
        }
        while(ri<(right.length)){
            a[ri+li] = right[ri];
            ri++;
        }
        while(li<(left.length)){
            a[ri+li] = left[li];
            li++;
        }
        return a;
    }

    //QUICK SORT WITH LIST (3 METHODS)


    /*

    public void sort(int[] values) {
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        this.unsorted = Arrays.asList(22, 221,1324,0,1231,321,12,54,12,73,21,57,84,0,2,5,2,7,5);
        int number = unsorted.size();
        quickSort(0, number - 1);
    }

    public void quickSort(int left,int right){

    }
    public int divide(int left, int right){
        int i;
        return i;
    }

     */

    public static int[] insertionSort2(int a[]) {
        for(int i = 1; i<a.length; i++){
            int toBeInserted = a[i];
            int j = i;
            while(j>0 && a[j-1]>toBeInserted){
                a[j] = a[j-1];
                j--;
            }
            a[j] = toBeInserted;
        }
        return a;
    }

    public static String rev(String a){

        return a;
    }
}
