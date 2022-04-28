import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter how many elements");
        int n = scanner.nextInt();
        System.out.println("Enter the Names:");
        for (int i = 0; i < n; i++) {
            str = scanner.next();
            names.add(str);
        }
        quickSort(names, 0, names.size() - 1);
        System.out.print("Sorted names:");
        System.out.print(names + " ");

    }

    static void quickSort(ArrayList<String> names, int start, int end) {
        if (start < end) {
            int p = partition(names, start, end);
            quickSort(names, start, p - 1);
            quickSort(names, p + 1, end);
        }
    }

    static int partition(ArrayList<String> names, int start, int end) {
        int i = start;
        String name1, name2;
        for (int j = start; j < end; j++) {
            name1 = names.get(j);
            name2 = names.get(end);
            if (name1.compareToIgnoreCase(name2) <= 0) {
                swap(names, i, j);
                i++;
            }
        }
        swap(names, i, end);
        return i;
    }

    static void swap(ArrayList<String> names, int i, int j) {
        String name = names.get(i);
        names.set(i, names.get(j));
        names.set(j, name);
    }

}