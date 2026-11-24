class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        String n = "";
        int temp = x;

        if(x == 0)
            return true;

        while(x > 0) {
            int ld = x % 10;
            n += ld;
            x = x / 10;
        }

        return n.equals(String.valueOf(temp));
    }
}