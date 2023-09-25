import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] release = new int[progresses.length];
        int speed_idx = 0;
        int release_idx = 0;
    
        for (int p : progresses) {
            int count = 0;
            int result = p;
            while (result < 100) {
                result += speeds[speed_idx];
                count++;
            }
            release[release_idx] = count;
            speed_idx++;
            release_idx++;
        }
        
        int fidx = 0;
        int nidx = 1;
        int release_num = 1;
        int aidx = 0;
        
        ArrayList<Integer> answer = new ArrayList<>();
         
        while (nidx < release.length) {
            if (release[nidx] <= release[fidx]) {
                nidx++;
                release_num++;
            } else {
                fidx = nidx++;
                answer.add(aidx, release_num);
                release_num = 1;
                aidx++;
            }
        }
        
        answer.add(aidx, release_num);
        
        int[] arr = new int[answer.size()];
    
        
        for (int i=0;i<answer.size();i++) {
            arr[i] = answer.get(i).intValue();
        }
        
        return arr;
    }
}