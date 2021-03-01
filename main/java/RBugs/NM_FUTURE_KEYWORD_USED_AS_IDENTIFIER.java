package RBugs;

import java.util.Arrays;

public class NM_FUTURE_KEYWORD_USED_AS_IDENTIFIER {
    int assert = 0;
    String enum = "";

    void enum(){
        System.out.println("expected error");
    }

//    public static void main(String[] args) {
//        String name = "hello.A.world";
//        String[] strArr = name.split("[.]");
//        System.out.println(strArr.length);
//        System.out.println(Arrays.toString(strArr));
//        for (String p : name.split("[.]")) {
//            if (p.length() == 1) {
//                System.out.println("here!");
//            }
//        }
//    }
}

