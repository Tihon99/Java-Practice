public class InvalidAgeException extends Exception {
    private final int invalidAge;
    
    public InvalidAgeException() {
        super();
        this.invalidAge = 0;
    }
    
    public InvalidAgeException(String message) {
        super(message);
        this.invalidAge = 0;
    }
    
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
        this.invalidAge = 0;
    }
    
    public InvalidAgeException(String message, int invalidAge) {
        super(message);
        this.invalidAge = invalidAge;
    }
    
    public int getInvalidAge() {
        return invalidAge;
    }
}
