// Last updated: 5/1/2026, 3:58:37 pm
1class Solution {
2    public int minimumBuckets(String hamsters) {
3        char[] arr = hamsters.toCharArray();
4        int n = arr.length;
5        int buckets = 0;
6        for(int i = 0; i<n; i++){
7            if(arr[i] == 'H'){
8                if(i-1 >= 0 && arr[i-1] == 'B'){
9                    continue;
10                }else if(i+1<n && arr[i+1]=='.'){
11                    arr[i+1] = 'B';
12                    buckets++;
13                }else if(i-1>=0 && arr[i-1]=='.'){
14                    arr[i-1] = 'B';
15                    buckets++;
16                }else{
17                    return -1;
18                }
19            }
20        }
21        return  buckets;
22    }
23}