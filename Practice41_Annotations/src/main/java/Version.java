import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Аннотация будет доступна во время выполнения
@Retention(RetentionPolicy.RUNTIME)
// Аннотация может использоваться только для методов
@Target(ElementType.METHOD)
public @interface Version {
    // Обязательный параметр - номер версии
    int number();
    
    // Необязательный параметр с значением по умолчанию
    String description() default "No description";
}
