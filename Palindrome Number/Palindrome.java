class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int reverse=0;
        int remainder;
        while(original>0)
        {
            remainder=original%10;
            reverse=reverse*10+remainder;
            original=original/10;  
        }
        if(reverse==x)
        {
            return true;
        }
        else{
            return false;
        }
        
    }
}