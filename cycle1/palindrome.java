class Palindrome {
    public static void main(String args[]) {
        int i, flag = 0;
        String str = "Malayalam";
        str = str.toLowerCase();
        int len = str.length();
        for (i = 0; i < len / 2; i++) {
            if (str.charAt(i) == str.charAt(len - 1 - i)) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }

        }
        if (flag == 1)
            System.out.println("The string is palindrome");
        else {
            System.out.println("The string is not palindrome");

        }
    }
}