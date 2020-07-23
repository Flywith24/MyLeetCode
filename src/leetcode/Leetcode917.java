package leetcode;

/**
 * https://leetcode-cn.com/problems/reverse-only-letters/
 */
public class Leetcode917 {

    public String reverseOnlyLetters(String s) {
        char[] array = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            //跳过非法字符
            while (left < right && !Character.isLetter(array[left])) left++;
            while (left < right && !Character.isLetter(array[right])) right--;

            //交换
            char temp = array[right];
            array[right] = array[left];
            array[left] = temp;

            //挪动指针
            left++;
            right--;
        }
        return new String(array);
    }
}
