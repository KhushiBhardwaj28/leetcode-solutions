// Last updated: 6/10/2025, 10:28:00 am
class Solution {
    public int fib(int n) {
        int a =0, b=1;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            for(int i =2; i<=n; i++){
                int c = a+b;
                a = b;
                b = c;
            }
            return b;
        }
    }
}