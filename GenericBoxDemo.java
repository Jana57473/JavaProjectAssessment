// A simple generic class
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenericBoxDemo {
    public static void main(String[] args) {
        // Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println("Integer value: " + intBox.get());

        // Box for String
        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics!");
        System.out.println("String value: " + strBox.get());
    }
}
