package basket.exceptions;

public class BasketFullException extends RuntimeException {
    public BasketFullException(String message) {
        super(message);
    }
}
