import java.util.Scanner;

class New {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        n = s.nextInt();
        int i = 0;
        int ar[] = new int[20];
        while (i < n) {
            ar[i] = s.nextInt();
            i++;
        }
        int min = ar[0];
        int max = ar[0];
        for (i = 0; i < n; i++) {
            if (ar[i] < min) {
                min = ar[i];
            } else {
                max = ar[i];
            }
        }
        for (i = 0; i < n; i++) {
            if (ar[i] != min) {
                if (ar[i] < max) {
                    max = ar[i];
                }
            }
        }
        if (min == max) {
            System.out.println("no 2nd");
        } else {
            System.out.println("max" + max);
        }
    }

}
