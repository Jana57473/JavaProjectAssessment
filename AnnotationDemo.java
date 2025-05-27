import java.lang.annotation.*;
import java.lang.reflect.*;

// Step 1: Define a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Info {
    String author();
    String date();
}

// Step 2: Use the annotation
class DemoClass {
    @Info(author = "Alice", date = "2025-05-27")
    public void show() {
        System.out.println("Demo method");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) {
        try {
            Method method = DemoClass.class.getMethod("show");
            if (method.isAnnotationPresent(Info.class)) {
                Info info = method.getAnnotation(Info.class);
                System.out.println("Author: " + info.author());
                System.out.println("Date: " + info.date());
            } else {
                System.out.println("No Info annotation found.");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found!");
        }
    }
}
