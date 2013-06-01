package tdd.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Mutability {
    private String[] array;
    private List<String> list;

    public Mutability(){
        array = new String[10];
        list = new LinkedList<String>();
    }

    public static void main(String[] args) {
        System.out.print("Mutability");
    }

    public List<String> getList() {
        return list;
    }

    public List<String> getWrappedList() {
        return new ArrayList<String>(list);
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getArray() {
        return array;
    }
}