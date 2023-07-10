import java.text.SimpleDateFormat
import java.util.*

class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        val date1ToString = date1.map { it.toString() }.reduce { x, y -> "$x/$y" }
        val date2ToString = date2.map { it.toString() }.reduce { x, y -> "$x/$y" }
        val sdf = SimpleDateFormat("yyyy/MM/dd")
        val date1 = sdf.parse(date1ToString)
        val date2 = sdf.parse(date2ToString)
        
        return if (date1.before(date2)) 1 else 0
    }
}