public class Dog extends Animal {
    // Ковариантный возвращаемый тип (String является подтипом Object)
    @Override
    public String getType() {
        return "Собака";
    }
    
    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }
}
