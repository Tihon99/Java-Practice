public class Task2 {
    public static void main(String[] args) {
        int value = 2;
        int i = 0;
        
        System.out.println("Before switch: i = " + i);
        
        switch(value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
            case 3:
                i = 3;
                break;
            default:
                i = 4;
        }
        
        System.out.println("After switch: i = " + i);
        
        value = 1;
        i = 0;
        System.out.println("\nBefore switch: i = " + i);
        
        switch(value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
            case 3:
                i = 3;
                break;
            default:
                i = 4;
        }
        
        System.out.println("After switch: i = " + i);
    }
}
