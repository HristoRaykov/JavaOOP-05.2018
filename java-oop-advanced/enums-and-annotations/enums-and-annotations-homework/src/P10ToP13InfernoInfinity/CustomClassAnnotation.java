package P10ToP13InfernoInfinity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomClassAnnotation {
	
	String author();
	
	int revision();
	
	String description();
	
	String[] reviewers();
	
}
