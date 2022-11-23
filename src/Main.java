import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("Eliza");
        A.add("Aibike");
        A.add("Zarina");
        A.add("Begimay");
        A.add("Abema");
        System.out.println("Список" + A);

        ArrayList<String> B = new ArrayList<>();
        B.add("Roza");
        B.add("Katya");
        B.add("Meka");
        B.add("Amanai");
        B.add("Nuriz");
        System.out.println("Список" + B);


        ArrayList<String> C = new ArrayList<>();
        C.add(A.get(0));
        C.add(B.get(4));
        C.add(A.get(1));
        C.add(B.get(3));
        C.add(A.get(2));
        C.add(B.get(2));
        C.add(A.get(3));
        C.add(B.get(1));
        C.add(A.get(4));
        C.add(B.get(0));
        System.out.println("Список" + C);
        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                return 1;
                    } else {
                    return o1.compareTo(o2);
                    }
            }
        });
        System.out.println(C);


    }
}



