import java.util.*

fun main() {
    var n = readln()!!.toInt()
    var count = 0
    
    while (n > 0) {
        if (n%5 == 0) {
            count += n/5
            break
        } else {
            n -= 2
            count++
        }
    }

    if (n >= 0) {
        println(count)
    } else {
        println(-1)
    }
}