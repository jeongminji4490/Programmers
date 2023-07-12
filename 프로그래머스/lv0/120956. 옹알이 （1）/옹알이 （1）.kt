class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer = 0;
        for (i in 0 until babbling.size) {
            if(babbling[i].replace("ye"," ").replace("aya"," ").replace("woo"," ").replace("ma"," ").trim() == "") { answer = answer + 1 ; }    
        }
        return answer
    }
}