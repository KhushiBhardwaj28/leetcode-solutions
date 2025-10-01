// Last updated: 1/10/2025, 3:16:16 pm
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int amount : bills){
            if(amount == 5){
                five++;
            }else if(amount == 10){
                if(five>0){
                    five--;
                    ten++;
                }else{
                    return false;
                }
            }else{
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }else if(five>2){
                    five -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;

    }
}