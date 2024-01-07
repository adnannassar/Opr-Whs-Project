package Vorlesung;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String name = "Sh,ake,r Ne,srin Za,inab";
        StringTokenizer st = new StringTokenizer(name, ",");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
