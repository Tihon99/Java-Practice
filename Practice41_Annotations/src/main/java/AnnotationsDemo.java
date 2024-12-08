import java.util.ArrayList;
import java.util.List;

public class AnnotationsDemo {
    
    // @Override - указывает, что метод переопределяет метод суперкласса
    @Override
    public String toString() {
        return "AnnotationsDemo instance";
    }
    
    // @Deprecated - помечает метод как устаревший
    @Deprecated
    public void oldMethod() {
        System.out.println("Этот метод устарел, используйте newMethod()");
    }
    
    public void newMethod() {
        System.out.println("Используйте этот новый метод");
    }
    
    // @SuppressWarnings - подавляет предупреждения компилятора
    @SuppressWarnings("unchecked")
    public void suppressWarningDemo() {
        // Использование сырого типа вызовет предупреждение, но оно подавлено
        List list = new ArrayList();
        list.add("item");
    }
    
    // Демонстрация работы с собственной аннотацией
    @Version(number = 1, description = "Начальная версия")
    public void annotatedMethod() {
        System.out.println("Метод с собственной аннотацией");
    }
    
    // Метод для получения информации об аннотации
    public void printAnnotationInfo() {
        try {
            // Получаем аннотацию с метода
            Version version = getClass()
                .getMethod("annotatedMethod")
                .getAnnotation(Version.class);
                
            if (version != null) {
                System.out.println("Версия: " + version.number());
                System.out.println("Описание: " + version.description());
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден");
        }
    }
}
