package at.ac.fhcampuswien.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)             // You can specify which Java elements your custom annotation can be used to annotate - only methods
@Retention(RetentionPolicy.RUNTIME)     // You can specify for your custom annotation if it should be available at runtime
public @interface MyAnnotation {
    String   value() default "";        // with default value
    String   name();
    int      age();
    String[] newNames();
}

