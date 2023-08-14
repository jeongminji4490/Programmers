class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var availableFoods = intArrayOf()
    
        for (i in 1 until food.size) {
            availableFoods += if (food[i]/2 < 0) 0 else food[i]/2
        }
    
        for (i in 0 until availableFoods.size) {
            repeat(availableFoods[i]) {
                answer += (i+1).toString()
            }
        }
    
        answer += "0"
    
        for (i in availableFoods.size-1 downTo (0)) {
            repeat(availableFoods[i]) {
                answer += (i+1).toString()
            }
        }
    
        return answer
    }
}