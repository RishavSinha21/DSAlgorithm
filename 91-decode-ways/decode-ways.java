class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0)=='0') return 0;
        int one=1;
        int two=1;
        for(int i=1;i<s.length();i++){
           int current=0;
           if(s.charAt(i)!='0'){
            current=one;
           }
           int a=Integer.parseInt(s.substring(i-1,i+1));
           if(a>=10 && a<=26){
            current=current+two;
           }
           two=one;
           one=current;
        }
        return one;
    }
}