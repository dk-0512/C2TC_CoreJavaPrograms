package com.tnsif.nonaccessmodule;

final class FinalDemo {
    
    final int Var = 100;
    
    final void display() {
        System.out.println("show the value of var: " + Var);
    }

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        fd.display();
    }
}