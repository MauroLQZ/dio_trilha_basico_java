package excecoes;

public class UnderAgeException extends Exception {
    private int _age;

    public UnderAgeException(String message, int age) {
            super(message);
            this._age = age;
    }

    // Use the getAge method to get the value that caused the exception.
    public int getAge() {
            return _age;
    }
}