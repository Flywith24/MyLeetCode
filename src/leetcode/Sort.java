package leetcode;

class TestSort {
    public static void main(String[] args) {
        int []arr = {1,7,8,2,5,4,3,6,9};
        new Sort().mergeSort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
public class Sort {
    /**
     * 归并排序
     */
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