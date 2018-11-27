public class QuickSort {

    private int[] arr;

    public QuickSort(int[] arr){
        this.arr = arr;
        QuickSortHelper(arr, 0, arr.length - 1);
    }

    public void QuickSortHelper(int[] arr, int left, int right){
        if(left < right){

            int pivot = partition(arr, left, right);

            QuickSortHelper(arr, left, pivot - 1);
            QuickSortHelper(arr, pivot + 1, right);

        }
        this.arr = arr;
    }

    public int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;
        for(int j = left; j < right; j++){
            if(arr[j] <= pivot){
                i++;
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
            }
        }
        int x = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = x;
        return i + 1;
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < arr.length; i++){
            str += arr[i] + "  ";
        }
        return str;
    }
}
