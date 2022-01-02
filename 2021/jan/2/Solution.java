class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] r = new int[60];
        for(int i = 0; i < time.length; i++) {
            r[time[i]%60]++;
        }
        int x = (r[0]*(r[0]-1))/2;
        x += (r[30]*(r[30]-1))/2;
        for(int i = 1; i < 30; i++) {
            x += r[i]*r[60-i];
        }
        return x;
    }
}
