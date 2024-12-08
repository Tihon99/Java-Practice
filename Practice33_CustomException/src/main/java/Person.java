/**
 * Класс для демонстрации использования пользовательского исключения
 */
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        setAge(age);
    }
    
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Возраст не может быть отрицательным", age);
        }
        if (age > 150) {
            throw new InvalidAgeException("Возраст не может быть больше 150 лет", age);
        }
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
