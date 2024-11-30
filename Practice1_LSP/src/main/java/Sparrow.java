/**
 * Класс Sparrow (Воробей) - подтип Bird
 */
public class Sparrow extends Bird {
    
    public Sparrow(String name) {
        super(name);
    }
    
    @Override
    public String makeSound() {
        return name + " чирикает";
    }
    
    @Override
    public String move() {
        return name + " летает в воздухе";
    }
}
