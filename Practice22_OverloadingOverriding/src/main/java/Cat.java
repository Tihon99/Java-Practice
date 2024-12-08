public class Cat extends Animal {
    // Ошибка компиляции - неправильное имя метода
    @Override
    public void makesound() {  // Опечатка в имени метода
        System.out.println("Мяу-мяу");
    }
}
