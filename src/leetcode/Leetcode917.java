package leetcode;

public class Leetcode917 {
    public String reverseOnlyLetters(String s) {
        s = "a-bC-dEf-ghIj";
        char[] array = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while ()
            if (isLetter(array[left]) && isLetter(array[right])) {
                char temp = array[right];
                array[right] = array[left];
                array[left] = temp;
            }
            left++;
            right--;
        }

        String s1 = new String(array);
        System.out.println(s1);
        return s1;
    }

    boolean isLetter(char c) {
        return Character.isLetter(c);
    }

    public static void main(String[] args) {
        Leetcode917 leetcode917 = new Leetcode917();
        leetcode917.reverseOnlyLetters("");
    }
}
