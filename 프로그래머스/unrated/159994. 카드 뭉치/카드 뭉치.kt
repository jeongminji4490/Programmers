class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var result = ""
        var answer = "No"
    
        var cards1_Idx = 0
        var cards2_Idx = 0

        for (idx in 0 until goal.size) {
            
            if (cards1_Idx <= cards1.lastIndex && cards1[cards1_Idx] == goal[idx]) {
                result += cards1[cards1_Idx] 
                cards1_Idx++ 
            } else if (cards2_Idx <= cards2.lastIndex && cards2[cards2_Idx] == goal[idx]) {
                result += cards2[cards2_Idx] 
                cards2_Idx++
            }
            
            if (result == goal.joinToString("")) {
                answer = "Yes"
                break
            }
        }
        return answer
    }
}