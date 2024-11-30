public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[] {
            new Penguin("Пингвин"),
            new Sparrow("Воробей")
        };
        
        for (Bird bird : birds) {
            bird.makeSound();
            bird.move();
        }
    }
}
