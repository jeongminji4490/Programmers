import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] release = new int[progresses.length];
        int release_idx = 0;
        int speed_idx = 0;
        
        for (int p : progresses) {
            int count = 0;
            int result = p;
            while (result < 100) {
                result += speeds[speed_idx];
                count++;
            }
            release[release_idx] = count;
            release_idx++;
            speed_idx++;
        }
       
        ArrayList<Integer> arr = new ArrayList<>();
        
        int fidx = 0;
        int nidx = 1;
        int release_num = 1;
        int aidx = 0;
        
        while (nidx < release.length) {
            if (release[nidx] <= release[fidx]) {
                release_num++;
                nidx++;
            } else {
                fidx = nidx++;
                arr.add(aidx, release_num);
                release_num = 1;
                aidx++;
            }
        }
        
        arr.add(aidx, release_num);

        int[] answer = new int[arr.size()];
        
        for (int i=0;i<answer.length;i++) {
            answer[i] = arr.get(i).intValue();
        }
        return answer;
    }
}