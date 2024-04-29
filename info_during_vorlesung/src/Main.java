import org.w3c.dom.ls.LSOutput;

public class Main {





    public static void main(String[] args) {
        String b = rev("Wort");
        System.out.println("Finish:"+b);

        int arr[] = {0, 2 , 5, 10, 11, 13, 20, 21, 30, 36, 100, 120 ,1200, 10000, 13300, 120041};
        int arr2[] = {1,2,3,4,5,6,7,8,9,10};

        arr = arr2;

        System.out.println(sort(arr,arr2));
    }

    public static int[] sort(int arr1[], int arr2[]){
        int c1 = 0;
        int c2 = 0;
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i = 0; i<arr1.length+arr2.length; i++){
            if(arr1[c1]<arr2[c2]){
                arr3[i] = arr1[c1];
                c1++;
            }
            else{
                arr3[i] = arr2[c2];
                c2++;
            }
        }
        return arr3;

    }

    //rev(word) = rev(ord) + "w"
    public static String rev(String s){
        if(s.length() == 0 || s.length() == 1) return s;
        char buchstabe = s.charAt(0);
        return rev(s.substring(1))+buchstabe;
    }
}