package com.demo.printer;

public class StandardValuePrinter implements ValuePrinter {
    @Override
    public void print(int num) {
        System.out.println(num);
    }
}
