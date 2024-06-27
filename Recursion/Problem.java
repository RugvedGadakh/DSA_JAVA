class Problem {

    // Problem 1 :

    public static int BinarySearch(int arr[], int start, int end, int key) {
        int mid = (start + end) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (arr[mid] > key) {
            mid = BinarySearch(arr, start, mid, key);
        } else {
            mid = BinarySearch(arr, mid, end, key);
        }

        return mid;

    }

    // Problem 2 :

    public static void BubbleSort(int arr[], int index, int size) {
        if (index == size) {
            return;
        }

        for (int i = index + 1; i <= size; i++) {
            if (arr[index] > arr[i]) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }

        BubbleSort(arr, ++index, size);
    }

    public static void BubbleSort2(int arr[], int index) {
        if (index == 1) {
            return;
        }

        for (int i = 0; i < index; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        BubbleSort2(arr, --index);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = arr.length - 1;

        int ans = BinarySearch(arr, 0, n, 40);
        System.out.println(ans);

        int arr1[] = { 20, 45, 10, 2, 80, 11 };
        int size1 = arr1.length - 1;
        // BubbleSort(arr1, 0, size1);

        BubbleSort2(arr1, size1);

        for (int i = 0; i <= size1; i++) {
            System.out.print(arr1[i] + " ");
        }

    }

}