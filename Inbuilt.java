import java.util.Arrays;
import java.util.Collections;

public class Inbuilt {
    public static void main(String[] args) {
        Integer[] arr = {2,1,5,3,7,12,9};
        // Arrays.sort(arr,1,5); 
        Arrays.sort(arr,0,5,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
