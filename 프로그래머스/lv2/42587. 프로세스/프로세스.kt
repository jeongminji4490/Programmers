import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val queue : Queue<Int> = LinkedList()
        val pQueue = PriorityQueue<Int>(Collections.reverseOrder())
        var loc = location
    
        for (p in priorities) {
            queue.add(p)
            pQueue.add(p)
        }
        
        while (true) {
            val cur = queue.poll()
            if (pQueue.peek() == cur) {
                pQueue.poll()
                answer++
                if (loc == 0) break
                loc--
            } else {
                queue.offer(cur)
                loc--
                if (loc < 0) loc = pQueue.size - 1
            }
        }

        return answer
    }
}