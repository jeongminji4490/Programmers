import java.util.*

fun main() {
    var n = readln().toInt()
    var left = 1000 - n
    val change = listOf(500, 100, 50, 10, 5, 1)
    var result = 0

    for (c in change) {
        if (left >= c) {
            result += (left/c)
            left -= (c*(left/c))
        }
    }

    println(result)
}