class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){return 1;}
        int x = (int)Math.pow(2, log2(n)+1)-1;
        return x-n;
    }
    public int log2(int n) {
        double x = Math.log(n)/Math.log(2);
        return (int)x;
    }
}
