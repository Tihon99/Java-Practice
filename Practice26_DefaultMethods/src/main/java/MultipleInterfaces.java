public class MultipleInterfaces implements Interface1, Interface2 {
    // Обязательно нужно переопределить commonMethod,
    // так как он есть в обоих интерфейсах
    @Override
    public void commonMethod() {
        // Можно вызвать реализацию из конкретного интерфейса
        Interface1.super.commonMethod();
        // Или свою собственную реализацию
        System.out.println("MultipleInterfaces common method");
    }
}
