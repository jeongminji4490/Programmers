class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        finished.forEachIndexed { idx, isFinished ->
            if (isFinished == false) {
                answer += todo_list[idx]
            }
        }
        
        return answer
    }
}