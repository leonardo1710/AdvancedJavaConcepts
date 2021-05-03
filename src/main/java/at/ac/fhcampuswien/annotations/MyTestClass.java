package at.ac.fhcampuswien.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Arrays;


public class MyTestClass {

    @MyAnnotation(
            name = "John",
            age = 45,
            newNames = {"Doe", "Jane"}
    )
    public static void myTestMethod(){
        Class<MyTestClass> c = MyTestClass.class;

        try{
            Method m = c.getMethod("myTestMethod");
            MyAnnotation myAnnotationObj = m.getAnnotation(MyAnnotation.class);

            if(myAnnotationObj != null){
                System.out.println(" Method Name : " + m.getName());
                System.out.println(" Name : " + myAnnotationObj.name());
                System.out.println(" Value : " + myAnnotationObj.value());
                System.out.println(" NewNames : " + Arrays.toString(myAnnotationObj.newNames()));
            }

        }catch (NoSuchMethodException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        myTestMethod();
    }
}
