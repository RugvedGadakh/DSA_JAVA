class QuickSort {

    public static int Partition(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
    }

    public static void QuickSort(int arr[], int low, int high) {

        if (low < high) {

            int pidx = Partition(arr, low, high);

            QuickSort(arr, low, pidx - 1);
            QuickSort(arr, pidx + 1, high);
        }

    }

    public static void main(String[] args) {

        int arr[] = { 4, 9, 3, 1, 5 };
        int n = arr.length;
        System.out.println("Given array");

        QuickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}