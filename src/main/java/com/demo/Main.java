package com.demo;

import com.demo.evaluate.Evaluation;
import com.demo.evaluation.Evaluator;
import com.demo.evaluation.MultiplyEvaluator;
import com.demo.evaluation.PlusEvaluator;
import com.demo.printer.DecorateValuePrinter;
import com.demo.printer.StandardValuePrinter;

public class Main {

    public static void main(String[] args) {
       new Main().run();
    }
    public void run(){
        Evaluation evaluation = new Evaluation();

        Evaluator evaluator = getEvaluator();

        evaluation.evaluate(3, getEvaluator(), new DecorateValuePrinter());
    }
    private Evaluator getEvaluator() {
        Evaluator evaluator = this::powerEvaluator;
        evaluator = (a, b) -> a % b;
        evaluator = (a, b) -> a - b;
        return evaluator;
    }
    private int powerEvaluator(int num1, int num2) {
        return (int)Math.pow(num1, num2);
    }
}
