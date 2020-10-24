public class Question12 {

    public void onlyDigits(String str, int n)
    {
        for (int i = 0; i < n; i++) {

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        System.out.println("false");
    }

}
