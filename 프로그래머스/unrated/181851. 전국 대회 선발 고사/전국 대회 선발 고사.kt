class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var rankArr = intArrayOf()
        val attArr = attendance.mapIndexed { idx, attendance -> if (attendance) idx else -1 }
                
        for (i in attArr.indices) {
            if (attArr[i] != -1) {
                rankArr += rank[attArr[i]]
            }
        }
        
        rankArr = rankArr.sorted().toIntArray() 
        
        val a = rank.indexOf(rankArr[0]) 
        val b = rank.indexOf(rankArr[1]) 
        val c = rank.indexOf(rankArr[2]) 
        
        return (10000*a) + (100*b) + c
    }
}