package RBugs;

public class UI_INHERITANCE_UNSAFE_GETRESOURCE {
    void test1(){
        getClass().getResource("Public.key").getFile();
    }
}
