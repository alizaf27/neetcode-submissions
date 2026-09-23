class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] f1= new int[128];
        int[] f2= new int[128];
        for(int i=0;i<t.length();i++){
            f1[t.charAt(i)]++;
        }
        int left=0;
              int start = 0;
        int min=Integer.MAX_VALUE;
int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
             f2[c]++;
             if(f1[c]>0&& f2[c]<=f1[c]){
                count++;
             }
            while(count==t.length()){
               if(i-left+1<min){
                min=i-left+1;
                start=left;
                   }
                   char lc=s.charAt(left);
                   f2[lc]--;
                   if(f1[lc]>0&& f2[lc]<f1[lc]) count--;
                   left++;



            }
        }if (min == Integer.MAX_VALUE) {
            return "";
        

        } return s.substring(start,start+min);
       
            }
}
