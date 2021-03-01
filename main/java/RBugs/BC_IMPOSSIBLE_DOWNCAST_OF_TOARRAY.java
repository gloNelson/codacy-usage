package RBugs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY {
//    void test1(){
//        new LinkedList<String>().toArray();
//        Arrays.asList(new String[] { "a" }).toArray();
//    }
//
//    Object[] test2(Collection<String> c) {
//        return (Object[]) c.toArray();
//    }
//
//    void test2(){
//        Collection<Integer> c = new Collection<Integer>() {
//            public int size() {
//                return 0;
//            }
//
//            public boolean isEmpty() {
//                return false;
//            }
//
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            public Iterator<Integer> iterator() {
//                return null;
//            }
//
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            public boolean add(Integer integer) {
//                return false;
//            }
//
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            public boolean addAll(Collection<? extends Integer> c) {
//                return false;
//            }
//
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            public void clear() {
//
//            }
//        };
//        String[] strArr = (String[])new LinkedList<String>().toArray();
//    }
//
//    Integer[] test3(){
//        return (Integer[]) Arrays.asList("Apple", 3, 1).toArray();
//    }
//
//    Integer[] test4(){
//        System.out.println(Arrays.asList(new String[]{}).toArray().getClass().getName());
//            return (Integer[]) Arrays.asList(new String[]{}).toArray();
//    }
//
//
//    public static void main(String[] args) {
//        BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY b = new BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY();
////        b.test1();
//        b.test2(new LinkedList<String>());
////        b.test3();
//        b.test4();
//    }
}

