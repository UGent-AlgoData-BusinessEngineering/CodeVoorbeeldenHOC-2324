public class UnknownOpException extends Exception {
    public UnknownOpException() {
        super("Operatie net gekend");
    }

    public UnknownOpException(String message) {
        super(message);
    }
}
