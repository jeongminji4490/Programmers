import java.util.*

fun main() {
    val N = readln().toInt()
    var A = readln().split(" ").map { it.toInt() }.toMutableList()
    var B = readln().split(" ").map { it.toInt() }
    var sortedA = A.sorted()
    var b = B.toMutableList()
    var S = 0
    
    // B에서 가장 큰 수부터 차례로 A의 가장 작은 수를 곱해야 작은 수가 됨.
    // A를 오름차순으로 정렬한 다음 (0, 1, 1, 1, 6) 
    // B의 가장 큰 수의 인덱스부터 차례대로 넣기?
    
    var newList = mutableListOf<Int>() // 인덱스별로 재정렬한 값이 들어감
    repeat(N) {
        newList.add(0)
    }
    
    for (n in sortedA) {
        var maxOfB = b.max()
        var maxIdxOfB = b.indexOf(maxOfB)
        newList[maxIdxOfB] = n
        b[maxIdxOfB] = -1
    }
    
    for (i in 0 until N) {
        S += newList[i]*B[i]
    }
    
    println(S)
}