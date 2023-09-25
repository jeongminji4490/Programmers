class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        var release = intArrayOf()
        for (i in 0 until progresses.size) {
            var count = 0
            var result = progresses[i]
            while (result < 100) {
                result += speeds[i]
                count++
            }
            release += count
            count = 0
        }

        var fidx = 0
        var nidx = 1
        var release_num = 1
        while (nidx < release.size) {
             
            if (release[nidx] <= release[fidx]) { 
                release_num++ 
                nidx++ 
            } else { 
                fidx = nidx++ 
                answer += release_num 
                release_num = 1
            }
        
        }
        answer += release_num
        return answer
    }
}