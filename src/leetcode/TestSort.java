package leetcode;

public class TestSort {
    public static void main(String[] args) {
        int[] arr = {1, 7, 8, 2, 5, 4, 3, 6, 9};
        new HeapSort().heapSort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}

/**
 * 归并排序
 */
class MergeSort {

    void mergeSort(int[] arr) {
        int[] tempArr = new int[arr.length];
        mergeSort(arr, tempArr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int[] tempArr, int left, int right) {
        if (right <= left) return;

        // 中部位置下标
        int mid = left + (right - left) / 2;

        mergeSort(arr, tempArr, left, mid);
        mergeSort(arr, tempArr, mid + 1, right);

        merge(arr, tempArr, left, mid, right);
    }

    private void merge(int[] arr, int[] tempArr, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) tempArr[t++] = arr[i++];
            else tempArr[t++] = arr[j++];
        }
        while (i <= mid) tempArr[t++] = arr[i++];

        while (j <= right) tempArr[t++] = arr[j++];

        t = 0;
        while (left <= right) arr[left++] = tempArr[t++];
    }
}

/**
 * 快速排序
 */
class QuickSort {

    void quickSort(int[] sourceArray) {
        quickSort(sourceArray, 0, sourceArray.length - 1);
    }

    private void quickSort(int[] arr, int left, int right) {
        if (right <= left) return;

        int pivotIndex = partition(arr, left, right);
        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, right);
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int mark = left;

        //单边扫描
        for (int i = left + 1; i <= right; i++) {
            if (arr[i] < pivot) {
                mark++;
                int temp = arr[mark];
                arr[mark] = arr[i];
                arr[i] = temp;
            }
        }
        arr[left] = arr[mark];
        arr[mark] = pivot;
        return mark;
    }
}

class HeapSort {
    void heapSort(int[] arr) {
        int length = arr.length;
        buildHeap(arr, length);
        for (int i = length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            length--;
            sink(arr, 0, length);
        }
    }

    private void buildHeap(int[] arr, int length) {
        for (int i = length / 2; i >= 0; i--) {
            sink(arr, i, length);
        }
    }

    private void sink(int[] arr, int index, int length) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int current = index;
        if (leftChild < length && arr[leftChild] > arr[current]) current = leftChild;
        if (rightChild < length && arr[rightChild] > arr[current]) current = rightChild;

        if (index != current) {
            int temp = arr[index];
            arr[index] = arr[current];
            arr[current] = temp;
            sink(arr, current, length);
        }
    }
}
