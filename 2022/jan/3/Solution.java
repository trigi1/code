class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] r = new int[n];
        for(int i = 0; i < trust.length; i++) {
            r[trust[i][1]-1]++;
            r[trust[i][0]-1] = Integer.MIN_VALUE;
        }
        for(int i = 0; i < r.length; i++) {
            if(r[i]==n-1) {
                return i+1;
            }
        }
        return -1;
    }
}
