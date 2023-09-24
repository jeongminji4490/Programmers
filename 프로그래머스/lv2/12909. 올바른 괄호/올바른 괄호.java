class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int cnt = 0;
        
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='(') {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt < 0) {
                answer = false;
                break;
            }
        }
        
        answer = cnt == 0 ? true : false;

        return answer;
    }
}