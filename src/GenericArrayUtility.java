public class GenericArrayUtility {
    public static <T> T[] mergeArrays(T[] a, T[] b) {
        if (a == null) a = (T[]) new Object[0];
        if (b == null) b = (T[]) new Object[0];

        Class<?> componentType = a.getClass().getComponentType();
        T[] result = (T[]) java.lang.reflect.Array.newInstance(componentType, a.length + b.length);

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        return result;
    }
}