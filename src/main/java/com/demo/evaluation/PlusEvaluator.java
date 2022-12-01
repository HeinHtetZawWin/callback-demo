package com.demo.evaluation;

public class PlusEvaluator implements Evaluator {
    @Override
    public int evaluate(int num1, int num2) {
        return num1 + num2;
    }
}
