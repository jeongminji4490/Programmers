class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        var sortedSpell = spell.toList().sorted().joinToString("")
        var answer = 2
        for (i in 0 until dic.size) { 
            val sorted = dic[i].toList().sorted().joinToString("")
            if (sorted == sortedSpell) {
                answer = 1
                break
            }
        }
        return answer
    }
}