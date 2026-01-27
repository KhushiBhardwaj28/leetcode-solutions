// Last updated: 27/1/2026, 4:38:30 pm
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        Queue<Integer> q = new LinkedList<>();
4        for(int i = 0; i<tickets.length; i++){
5            q.add(i);
6        }
7        int ans = 0;
8        while(!q.isEmpty()){
9            ans++;
10            int front = q.poll();
11            
12            tickets[front]--;
13            if(tickets[front] == 0 && front == k) return ans;
14            if(tickets[front]!=0) q.offer(front);
15        }
16        return ans;
17    }
18}