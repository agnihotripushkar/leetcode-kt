class Solution {
    public boolean detectCapitalUse(String word) {
        char[] chars = word.trim().toCharArray();
        int count = chars.length;
        int upperCount = 0;
        int lowerCount = 0;
        boolean firstCap = false;

        if(Character.isUpperCase(chars[0])){
            firstCap = true;
        }

        for(char ch: chars){
            if(Character.isLowerCase(ch)){
                lowerCount++;
            }
            if(Character.isUpperCase(ch)){
                upperCount++;
            }
        }

        if(firstCap && upperCount == count) return true;
        if(!firstCap && lowerCount==count) return true;
        if(firstCap && lowerCount+1==count) return true;
        return false;
    }
}