package com.demo.printer;

public class DecorateValuePrinter implements ValuePrinter {
    @Override
    public void print(int num) {
        System.out.println(
                String.format("Value = [%d]", num)
        );
    }
}
