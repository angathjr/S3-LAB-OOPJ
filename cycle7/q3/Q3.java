import java.util.*;

class Q3 {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        System.out.println("Enter how many elements");
        int n = scanner.nextInt();
        System.out.println("Enter the Names:");
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            list.add(str);
        }
        System.out.println("The elements in the list");
        System.out.println(list + "\n");
        System.out.println("Enter name to remove from list");
        String nm = scanner.next();
        if (list.contains(nm)) {
            list.remove(nm);
            Iterator itr = list.iterator();
            System.out.println("The elements in list after deletion:");
            System.out.println(list);
        } else {
            System.out.println("Name  not found in list");
        }

    }
}