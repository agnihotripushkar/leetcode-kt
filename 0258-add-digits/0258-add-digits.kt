class Solution {
    fun addDigits(num: Int): Int {
        if(num<10) return num
        var no = num
        var sum = 0

        while(no/10 > 0){
            sum += no % 10
            no = no/10
            if(no < 10){
                sum +=no
                break
            }
        }

        return addDigits(sum)
        
    }
}