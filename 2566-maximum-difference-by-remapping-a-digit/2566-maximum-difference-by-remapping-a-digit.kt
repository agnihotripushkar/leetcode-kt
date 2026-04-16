class Solution {
    fun minMaxDifference(num: Int): Int {
        val str = num.toString().toCharArray()
        val size = str.size
       
        val minNo = CharArray(size)
        val firstForMin = str[0]

        for(i in 0 until size){
            if(str[i]==firstForMin){
                minNo[i]='0'
            }
            else{
                minNo[i] = str[i]
            }
        }

        var left = 0
        while (left < size && str[left] == '9') {
            left++
        }
        val firstForMax = if (left < size) str[left] else '9'
        val maxNo = CharArray(size)
        for(i in 0 until size){
            if(str[i] ==firstForMax){
                maxNo[i] = '9'
            }
            else{
                maxNo[i] = str[i]
            }
        }

        return String(maxNo).toInt() - String(minNo).toInt()
        
    }
}