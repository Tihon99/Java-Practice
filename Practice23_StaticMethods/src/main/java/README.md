# Практика 23: Статические методы и полиморфизм

Статические методы не могут быть полиморфными по следующим причинам:

1. Статические методы принадлежат классу, а не объекту
   - Они существуют даже без создания экземпляра класса
   - Вызываются через имя класса, а не через объект

2. Привязка происходит на этапе компиляции
   - Компилятор выбирает метод на основе типа ссылки
   - Нет проверки типа объекта во время выполнения

3. Нет виртуальной таблицы методов
   - Для статических методов не создается записей в vtable
   - Нет механизма динамической диспетчеризации

4. Сокрытие вместо переопределения
   - Статический метод в подклассе скрывает (hiding), а не переопределяет (overriding) метод суперкласса
   - Аннотация @Override не может быть использована
