import java.lang.annotation.Annotation;

class AnnotationUtils {

    public static void printClassAnnotations(Class classObject) {
        // write your code here
        Annotation[] annotations = classObject.getDeclaredAnnotations();

        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getSimpleName());
        }
    }
}