package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ANY {
    public static void main(String[] args) {
        System.out.println("piper".charAt(3));
//        int[] a = {8,5,3,1};
//        System.out.println(a[2]);

        System.out.println("abcde".substring(3,4));
        System.out.println(new String("B"));
        System.out.println("apple".compareTo("banana"));

        ArrayList<String> w = new ArrayList(Arrays.asList("A","B"));
        System.out.println(w);
        System.out.println(10%5==0);
        HashMap<String, Integer> j = new HashMap<>();
        j.put("AA" , 5);
        int cur = j.get("AA");
        j.put("AA" , 5);
        System.out.println(j.get("AA"));
        System.out.println(j);


        int a = 1;
        int b = 0;
        int c = 0;
        System.out.println(a/b);


    }
}
