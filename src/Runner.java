import java.util.Arrays;

public class Runner {

    public static void main(String[] args){

        int[] scan = {0,3,4,10,34,565,12312,41,3,2,7,9,2412,123234,34534534,3410,34534};
        System.out.println(Arrays.toString(scan));

        QuickSort qs1 = new QuickSort(scan);

        System.out.println(qs1);

    }

}
