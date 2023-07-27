fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    var idx = 1
    repeat (n) {
        repeat (idx) {
            print("*")
        }
        println()
        idx++
    }
}