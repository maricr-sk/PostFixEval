import java.io.Serial;

class StackException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public StackException(final String msg) {
        super(msg);
    }

    public StackException(final String msg, final Throwable t) {
        super(msg, t);
    }
}
