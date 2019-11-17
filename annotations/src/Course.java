import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface Course {
	String c_id() default "C-111";
	String c_name() default "C Programming Lang";
	int c_cost() default 10000;
}