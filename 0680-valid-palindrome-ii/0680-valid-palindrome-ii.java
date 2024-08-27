class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() <3){
            return true;
        }
        int st =0;
        int end= s.length()-1;
        boolean countDone = false;
        while(st < end){
            if(s.charAt(st) == s.charAt(end)){
                 st++;
                 end --;

            } else{
               return validPalindrome(s,st,end-1) || validPalindrome(s,st+1,end);
            }
        }
        return true;
    }

    public boolean validPalindrome(String s, int st , int end) {
        while(st < end){
            if(s.charAt(st) != s.charAt(end)){
                return false;
            }
             st++;
             end --;
        }
        return true;
    }
}