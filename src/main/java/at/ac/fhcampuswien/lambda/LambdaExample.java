package at.ac.fhcampuswien.lambda;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class LambdaExample {
    public static void main(String[] args){
        //functionalInterfaceExample1();
        //buttonCallbackWithLambdaExample();
        returnValueExamples();

        MyComparator myComparator = (a, b) -> a > b;    // define a lambda expression somewhere
        Boolean isBigger = useLambdaAsParam(2, 4, myComparator);    // and pass it to another function

    }

    static void returnValueExamples(){
        MyComparator myComparator1 = (a, b) -> { return a > b; };

        MyComparator myComparator2 = (a, b) -> a > b;

        System.out.println(myComparator1.compare(4, 3));
        System.out.println(myComparator2.compare(4, 3));
    }

    static Boolean useLambdaAsParam(int a, int b, MyComparator comparator){
        return comparator.compare(a, b);
    }

    static void multipleParametersExample(){
        StringConcat concat = (a, b) -> a + b;
        String result = concat.concatStrings("Hello", "World");
    }

    static void buttonCallbackWithLambdaExample(){
        Frame frame = new Frame("ActionListener with Lambda");

        Button b = new Button("Click Here");
        b.setBounds(50,100,80,50);

        b.addActionListener( (e) -> System.out.println("Hello World!" + e.toString())); // the lambda expression

        /*
         * Before Java 8 and lambdas
         *
         * b.addActionListener(new ActionListener(){
         *     public void actionPerformed(ActionEvent e){  // anonymous inner class was needed
         *     	    System.out.println("Hello World!");
         *     }
         * });
         */

        frame.add(b);
        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    static void functionalInterfaceExample1(){
        MyFunctionalInterface myFunctionalInterface = () -> {
            System.out.println("Use lambda with own functional interface.");
            System.out.println("Multiline example");
        };

        myFunctionalInterface.doSomething();
    }
}
