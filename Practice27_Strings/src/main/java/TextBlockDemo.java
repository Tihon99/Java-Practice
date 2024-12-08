public class TextBlockDemo {
    public static void demonstrateTextBlocks() {
        // Text Blocks (тройные кавычки) появились в Java 15
        // Они позволяют создавать многострочные строки с сохранением форматирования
        
        String json = """
                {
                    "name": "John",
                    "age": 30,
                    "city": "New York"
                }
                """;
        System.out.println("1. JSON с сохранением форматирования:");
        System.out.println(json);
        
        String html = """
                <html>
                    <body>
                        <h1>Hello, World!</h1>
                    </body>
                </html>
                """;
        System.out.println("\n2. HTML с сохранением отступов:");
        System.out.println(html);
        
        // Можно использовать \ для продолжения строки
        String sql = """
                SELECT name, age \
                FROM users \
                WHERE age > 18 \
                ORDER BY name;
                """;
        System.out.println("\n3. SQL запрос в одну строку:");
        System.out.println(sql);
    }
}
