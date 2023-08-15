import java.util.*
import java.time.*;
import java.time.format.TextStyle;

class Solution {
    fun solution(a: Int, b: Int): String {
        val date = LocalDate.of(2016, a, b) 
        val dayOfWeek = date.dayOfWeek
        return dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase()
    }
}