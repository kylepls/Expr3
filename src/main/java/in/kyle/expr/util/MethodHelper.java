package in.kyle.expr.util;

import java.lang.reflect.Method;

public final class MethodHelper {
    
    private MethodHelper() {
    }
    
    public static Method getMethod(Class<?> clazz, String name, Class<?>... args) {
        try {
            return clazz.getDeclaredMethod(name, args);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
