package CetakFilkom.Error;

public class QuantityException extends Exception {
    public QuantityException(String message) {
        System.err.println(message);
    }
}
