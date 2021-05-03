package at.ac.fhcampuswien.exceptions;

import java.io.IOException;

public class ExceptionExample {

    public static void main(String[] args){
        //exceptionExample1();
        //multiCatchExample();
        //divide(5, 0);
        //exceptionPropagation1();
        //checkedExceptionPropagation1();

        try{
            validateAge(10);
        }catch (InvalidAgeException e){
            System.out.println(e);
        }
    }

    private static void validateAge(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Must be 18");
        } else {
            // do some stuff
        }
    }

    private static void checkedExceptionPropagation1(){
        try{
            checkedExceptionPropagation2();
        }catch(Exception e){
            System.out.println("exception handled");
        }
        System.out.println("Normal flow..");
    }

    private static void checkedExceptionPropagation2() throws IOException {
        checkedExceptionPropagation3();
    }

    private static void checkedExceptionPropagation3() throws IOException {
        throw new IOException("Some file could not be found");
    }

    private static void exceptionPropagation1(){
        System.out.println("Inside exceptionPropagation1()");
        try {
            exceptionPropagation2();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static void exceptionPropagation2(){
        System.out.println("Inside exceptionPropagation2()");
        exceptionPropagation3();
    }

    private static void exceptionPropagation3(){
        System.out.println("Inside exceptionPropagation3()");
        throw new NullPointerException("Provoke an Exception");
    }

    private static void multiCatchExample(){
        try{
            int[] a = new int[5];
            a[5] = 30/0;
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch(Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }

    private static void divide(int dividend, int divisor){
        if(divisor == 0) {
            throw new ArithmeticException("not valid");
        }else {
            System.out.println("Result: " + dividend/divisor);
        }
    }

    private static void exceptionExample1(){
        try{
            int[] myArr = new int[3];
            int myElement = myArr[3];   // throws an ArrayOutOfBounds exception
        }catch(Exception e){
            System.out.println("Catch block is executed");
            System.out.println(e);
        }


        try{
            int x = 10/0;   // throws an ArithmeticException and is not handled with catch
        }finally {
            System.out.println("Finally block is executed");
        }
    }

}
