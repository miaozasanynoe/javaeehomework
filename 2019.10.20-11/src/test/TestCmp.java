package test;

import java.util.Comparator;

public class TestCmp implements Comparator {
    public  int compare(Object a,Object b){
        return (a.toString().charAt(0)-b.toString().charAt(0));
    }
}
