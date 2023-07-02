class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        for (i in str_list.indices) {
            if (str_list[i] == "l") {
                answer = str_list.copyOfRange(0, i)
                break
            } 
            if (str_list[i] == "r") {
                answer = str_list.copyOfRange(i+1, str_list.size)
                break
            }
        }
        
        return answer
    }
}