public class Question11 {

    static void isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)){
                System.out.println("is not a Palindrop");
                break;
            }
            i++;
            j--;
        }
        System.out.println("is a Palindrop");
    }

}
