public class Task1 {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};
        
        System.out.println("До присваивания:");
        System.out.print("a1: ");
        for (int i : a1) System.out.print(i + " ");
        System.out.print("\na2: ");
        for (int i : a2) System.out.print(i + " ");
        
        a1 = a2;
        
        System.out.println("\n\nПосле присваивания:");
        System.out.print("a1: ");
        for (int i : a1) System.out.print(i + " ");
        System.out.print("\na2: ");
        for (int i : a2) System.out.print(i + " ");
        
        System.out.println("\n\nИзменим значение a2[0]:");
        a2[0] = 100;
        System.out.print("a1: ");
        for (int i : a1) System.out.print(i + " ");
        System.out.print("\na2: ");
        for (int i : a2) System.out.print(i + " ");
    }
}
