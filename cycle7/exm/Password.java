import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;

class Validcheck {
    Validcheck() {
        String str;
        try {
            BufferedReader br = new BufferedReader(new FileReader("valid.txt"));
            List<Integer> list = new ArrayList<Integer>();
            str = br.readLine();

            while (str != null) {

                System.out.println(str);
                StringTokenizer st = new StringTokenizer(str, "\t");
                String nm = st.nextToken();
                if (st.hasMoreTokens()) {
                    list.add(Integer.parseInt(st.nextToken()));
                } else {
                    list.add(Integer.parseInt(nm));
                }
                str = br.readLine();
            }
            Collections.sort(list);
            Collections.reverse(list);
            System.out.println(list);

        } catch (Exception e) {
            System.out.println("hehe" + e);
        }
    }

}

public class Password {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            // BufferedReader br = new BufferedReader(new FileReader("valid.txt"));
            FileWriter f1 = new FileWriter("valid.txt");
            FileWriter f2 = new FileWriter("Invalid.txt");

            System.out.println("enter how many numbers");
            int n = s.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println("enter username");
                String name = s.next();
                System.out.println("enter password");
                char pass[] = System.console().readPassword();
                String str = String.valueOf(pass);
                boolean b = isnum(str);
                if (b == true) {
                    f1.write(name + "\t" + str + "\n");
                } else {
                    f2.write(name + "\t" + str + "\n");
                }
            }

            // new Validcheck();
            f1.close();
            f2.close();
        } catch (Exception e) {
            System.out.println("error" + e);
        } finally {
            new Validcheck();
        }
    }

    public static boolean isnum(String str) {
        try {
            int num = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
