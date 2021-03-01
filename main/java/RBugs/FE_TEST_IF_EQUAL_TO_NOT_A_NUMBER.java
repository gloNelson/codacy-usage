package RBugs;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER {
    boolean test1(int op){
        switch (op){
            case 0:
                return 0 > Float.NaN;
            case 1:
                return 1.0 < Float.NaN;
            case 2:
                return -2.3 == Double.NaN;
            case 3:
                return 0.0001 != Double.NaN;
            default:
                return 3f < Double.NaN;
        }
    }

    void test2(){
        double x = 1.0;
        if (x >= Double.NaN){
            System.out.println("hit");
        }
    }
}
