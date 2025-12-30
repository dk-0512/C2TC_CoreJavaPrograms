package com.tnsif.multpleinheritance;

interface a {
    void show();
}

interface b {
    void display();
}

class C implements a, b {
    public void show() {
        System.out.println("a is alpha");
    }
    public void display() {
        System.out.println("b is beta");
    }
}

public class multpleinheritance {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.display();
    }
}