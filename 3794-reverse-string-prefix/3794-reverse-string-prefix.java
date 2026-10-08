class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int size = s.length();
        for(int i=k-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        for(int j=k;j<size;j++){
            sb.append(s.charAt(j));
        }

        return sb.toString();
    }
}