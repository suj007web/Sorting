import java.util.Arrays;

public class Counting {
    public static void countingSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i], max);
        }
        // System.out.println(max);
        int nArr[] = new int[max+1];
        for(int i=0; i<arr.length; i++){
            nArr[arr[i]]++;
        }
        int j=0;
        // System.out.println(Arrays.toString(nArr));
        for(int i=0; i<nArr.length; i++){
            
            while(nArr[i]>0){
                arr[j] = i;
                nArr[i]--;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,5,4,1,3,2,4,3,7};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
