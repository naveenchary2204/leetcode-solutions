class Solution {
    public boolean isPalindrome(int x) {
        int d = x;
        int revnum = 0;
        while(x>0){
            int lastdigit = x % 10;
            x = x/10;
            revnum = (revnum * 10) + lastdigit;
        }

        return d == revnum;
}
}