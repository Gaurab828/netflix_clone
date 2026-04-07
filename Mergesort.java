class MergeSort {

    void merge(int arr[], int left, int mid, int right) {

        int i = left;       // left part
        int j = mid + 1;    // right part
        int k = left;

        int temp[] = new int[100];

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // remaining left side
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // remaining right side
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // copy back
        for (int x = left; x <= right; x++) {
            arr[x] = temp[x];
        }
    }

    void sort(int arr[], int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 2, 4, 1, 3};

        MergeSort obj = new MergeSort();
        obj.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int i : arr)
            System.out.print(i + " ");
    }
}
