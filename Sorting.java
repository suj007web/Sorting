import java.util.Arrays;

public class Sorting{
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int maxPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[maxPos]){
                    maxPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;
        }
    }
    public static void insertionSort(int arr[]){
        int l;
        for(int i=1; i<arr.length; i++){
            int prev = i-1;
            int curr = arr[i];
            while(prev>=0&&arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void countingSort(int arr[]){
        int l;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        int count[] = new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j=arr.length-1;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                count[i]--;
                j--;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}