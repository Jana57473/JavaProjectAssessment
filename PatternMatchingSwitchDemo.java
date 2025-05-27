public class PatternMatchingSwitchDemo {

    public static void checkType(Object obj) {
        String result = switch (obj) {
            case Integer i    -> "Integer: " + i;
            case String s     -> "String: " + s;
            case Double d     -> "Double: " + d;
            case null         -> "Null value";
            default           -> "Unknown type";
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        checkType(42);
        checkType("hello");
        checkType(3.14);
        checkType(new Object());
        checkType(null);
    }
}
