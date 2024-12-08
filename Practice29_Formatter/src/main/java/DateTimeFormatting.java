import java.util.Formatter;
import java.util.Calendar;

public class DateTimeFormatting {
    public static void demonstrateDateTimeFormatting() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        Calendar cal = Calendar.getInstance();
        
        // 1. %tH - час в 24-часовом формате
        formatter.format("Hour (24): %tH%n", cal);
        
        // 2. %tI - час в 12-часовом формате
        formatter.format("Hour (12): %tI%n", cal);
        
        // 3. %tB - полное название месяца
        formatter.format("Month: %tB%n", cal);
        
        // 4. %tY - год в четырехзначном формате
        formatter.format("Year: %tY%n", cal);
        
        // 5. %tA - полное название дня недели
        formatter.format("Day: %tA%n", cal);
        
        // Полная дата одним форматированием
        formatter.format("Full date: %tA, %tB %td, %tY%n", 
            cal, cal, cal, cal);
        
        System.out.println(sb.toString());
        
        formatter.flush();
        formatter.close();
    }
}
