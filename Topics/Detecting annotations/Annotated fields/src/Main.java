import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

/**
 Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */
class AnnotationsUtil {

    public static String[] getFieldsContainingAnnotations(Object object) {
        // Add implementation here
        List<String> list = new ArrayList<>();
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();

            if (annotations.length > 0) {
                list.add(field.getName());
            }
        }

        return list.toArray(String[]::new);
    }
}