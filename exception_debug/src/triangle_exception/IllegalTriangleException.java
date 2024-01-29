package triangle_exception;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    /*public IllegalTriangleException() {
//        super("Not a triangle");
    }*/
}
