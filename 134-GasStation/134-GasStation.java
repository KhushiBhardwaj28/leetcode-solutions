// Last updated: 6/10/2025, 10:30:13 am
class Solution {
    public int fib(int n) {
        int a =0, b=1;
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}