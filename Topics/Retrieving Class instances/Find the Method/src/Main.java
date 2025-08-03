import java.lang.reflect.Method;

class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) {
        String result = "";

        for (String className : classNames) {
            try {
                for (Method method : Class.forName(className).getMethods()) {
                    if (method.getName().equals(methodName)) {
                        result = className;
                        break;
                    }
                }
            } catch (ClassNotFoundException ignored) {
            }
        }

        return result;
    }
}