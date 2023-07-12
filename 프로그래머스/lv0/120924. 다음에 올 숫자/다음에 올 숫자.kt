class Solution {
    fun solution(common: IntArray): Int {
        var gap1 = common[2] - common[1]
        var gap2 = common[1] - common[0]
        return if (gap1 == gap2) common.last() + gap1 else common.last() * (gap1/gap2)
    }
}