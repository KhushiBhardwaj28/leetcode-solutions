// Last updated: 16/1/2026, 10:49:30 am
1class Solution {
2    public int countPrimes(int n) {
3        if(n<2){
4            return 0;
5        }
6        boolean[] isPrime = new boolean[n];
7        for(int i = 2; i<n; i++){
8            isPrime[i] = true;
9        }
10        for(int i = 2; i*i<n; i++){
11            for(int j = i*i; j<n; j+=i){
12                if(isPrime[j]){
13                    isPrime[j] = false;
14                }
15            } 
16        }
17        int count = 0;
18        for(int i = 2; i<n; i++){
19            if(isPrime[i]){
20                count++;
21            }
22        }
23        return count;
24    }
25}