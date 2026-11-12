package task2;

/**
 * A reusable, type-safe container.
 * T is a placeholder: DataBox<String> only holds Strings,
 * DataBox<Integer> only holds Integers.
 */
public class DataBox<T> {

    private final T value;

    public DataBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
