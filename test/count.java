import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        int n;
        int ar[] = new int[20];
        int f[] = new int[20];
        Scanner s = new Scanner(System.in);
        System.out.println("enter how many numbers");
        n = s.nextInt();
        System.out.println("Enter the numbers");
        int i = 0;
        while (i < n) {
            ar[i] = s.nextInt();
            f[i] = -1;
            i++;
        }
        for (i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                    f[j] = 0;
                }
            }
            if (f[i] != 0) {
                f[i] = count;
            }
        }
        i = 0;
        while (i < n) {
            if (f[i] != 0) {
                System.out.println(ar[i] + " occurs " + f[i] + " times ");
            }
            i++;
        }

    }

}
