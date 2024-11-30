/**
 * Класс Penguin (Пингвин) - подтип Bird
 */
public class Penguin extends Bird {
    
    public Penguin(String name) {
        super(name);
    }
    
    @Override
    public String makeSound() {
        return name + " издает характерные для пингвина звуки";
    }
    
    @Override
    public String move() {
        return name + " плавает в воде и ходит по земле";
    }
}
