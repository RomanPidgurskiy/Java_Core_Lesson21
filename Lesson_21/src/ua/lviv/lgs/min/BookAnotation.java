package ua.lviv.lgs.min;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



@Retention(RetentionPolicy.RUNTIME)
public @interface BookAnotation {
	String value() default "";
}