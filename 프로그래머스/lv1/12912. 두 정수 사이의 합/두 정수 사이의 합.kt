class Solution {
    fun solution(a: Int, b: Int): Long {
        val _a = a.toLong()
        val _b = b.toLong()
        if (_a < _b) {
            return (_a.._b).sum().toLong()
        } else {
            return (_b.._a).sum().toLong()
        }
    }
}