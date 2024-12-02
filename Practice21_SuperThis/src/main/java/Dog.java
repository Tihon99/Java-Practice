public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // Вызов конструктора суперкласса
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        super.makeSound();  // Вызов метода суперкласса
        System.out.println(super.name + " породы " + breed + " гавкает");  // Доступ к полю суперкласса
    }
}
