public class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Рефлексивность: объект равен самому себе
        if (this == obj) {
            return true;
        }

        // 2. Проверка на null
        if (obj == null) {
            return false;
        }

        // 3. Симметричность: проверка типа
        if (getClass() != obj.getClass()) {
            return false;
        }

        // Приведение типа после проверки
        Book other = (Book) obj;

        // 4. Транзитивность и согласованность: 
        // сравнение всех значимых полей
        if (isbn != null) {
            return isbn.equals(other.isbn);
        }
        
        return title.equals(other.title) &&
               author.equals(other.author) &&
               year == other.year;
    }

    @Override
    public int hashCode() {
        // Если equals использует поле, оно должно использоваться и в hashCode
        int result = 17;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
               "title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", year=" + year +
               ", isbn='" + isbn + '\'' +
               '}';
    }
}
