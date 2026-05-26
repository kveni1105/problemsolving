import java.time.LocalDate;
import java.time.DayOfWeek;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date=LocalDate.of(year,month,day);
        String s=date.getDayOfWeek().toString();
        return s.substring(0,1)+s.substring(1).toLowerCase();
    }
}