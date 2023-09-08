class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        
        var _lost = lost.filter { !reserve.contains(it) }.toMutableList() 
        var _reserve = reserve.filter { !lost.contains(it) }.toMutableList() 
        
        _lost.sort()
        _reserve.sort()
        
        for (i in _lost.indices) { 
            for (j in _reserve.indices) {
                if (_reserve[j] == _lost[i]-1 || _reserve[j] == _lost[i]+1) {
                    ++answer
                    _reserve.removeAt(j) 
                    break
                }
            }
        }
        
        return n - (_lost.size - answer)
        
    }
}