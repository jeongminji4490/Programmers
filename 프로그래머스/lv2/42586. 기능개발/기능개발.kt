class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        var release = intArrayOf() // 각 배포마다 배포되는 기능 수 
        for (i in 0 until progresses.size) {
            var count = 0 // 작업일
            var result = progresses[i]
            while (result < 100) { // 각 기능마다 100%에 이를 때까지 얼마나 걸리는지 작업일 계산
                result += speeds[i]
                count++
            }
            release += count
            count = 0
        }

        var fidx = 0
        var nidx = 1
        var release_num = 1 // 하나는 무조건 배포되니까 1부터 시작
        while (nidx < release.size) {
             // 다음 기능이 이전 기능보다 빨리 작업되어도 이전 기능이 배포될 때 배포되어야 함
             // 따라서 배포된 기능 수만 늘리고 다음 기능으로 이동
            if (release[nidx] <= release[fidx]) { 
                release_num++ 
                nidx++ 
            } else { 
                // 다음 기능이 이전 기능보다 오래걸리면 answer에 지금까지 배포된 기능 수 저장하고
                // 배포된 기능 수를 다시 1로 초기화한 후 다음 기능부터 순회 시작 
                fidx = nidx++ 
                answer += release_num 
                release_num = 1
            }
        
        }
        answer += release_num // 남아있는 기능 개수 저장
        return answer
    }
}