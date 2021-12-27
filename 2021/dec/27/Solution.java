class Solution {
    public int findComplement(int num) {
        int c = 0;
        while(Math.pow(2, c)<=num){
            c++;
        }
        c = (int)((long)Math.pow(2, c)-1);
        return c-num;
    }
}
