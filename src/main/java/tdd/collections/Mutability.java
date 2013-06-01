package tdd.collections;

import java.util.List;

public class Mutability {
    private String[] array;
    private List<String> list;

    public Mutability(){
        array = new String[10];
    }

    public static void main(String[] args) {
        System.out.print("Mutability");
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getArray() {
        return array;
    }
}