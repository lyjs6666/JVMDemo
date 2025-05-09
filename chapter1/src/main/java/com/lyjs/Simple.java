package com.lyjs;

public class Simple {

    private int id;
    public Simple(int id) {
        this.id = id;
    }
    public Simple() {

    }

    public void print() {
        System.out.println("id="+id);
    }

    public static void main(String[] args) {
        Simple simple = new Simple();
        simple.print();
    }
}
