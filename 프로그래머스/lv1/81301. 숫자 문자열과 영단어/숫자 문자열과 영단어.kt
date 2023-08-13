class Solution {
    fun solution(s: String): Int {
        var _s = s
        if (_s.contains("zero")) {
            _s = _s.replace("zero", "0")
        } 
        if (_s.contains("one")) {
            _s = _s.replace("one", "1")
        } 
        if (_s.contains("two")) {
            _s = _s.replace("two", "2")
        }  
        if (_s.contains("three")) {
            _s = _s.replace("three", "3")
        } 
        if (_s.contains("four")) {
            _s = _s.replace("four", "4")
        } 
        if (_s.contains("five")) {
            _s = _s.replace("five", "5")
        } 
        if (_s.contains("six")) {
            _s = _s.replace("six", "6")
        } 
        if (_s.contains("seven")) {
            _s = _s.replace("seven", "7")
        } 
        if (_s.contains("eight")) {
            _s = _s.replace("eight", "8")
        }
        if (_s.contains("nine")) {
            _s = _s.replace("nine", "9")
        } 
        return _s.toInt()
    }
}