class Solution {
    fun matchPlayersAndTrainers(players: IntArray, trainers: IntArray): Int {
        players.sort()
        trainers.sort()

        var playerPtr = 0
        var trainerPtr = 0

        while(playerPtr < players.size && trainerPtr < trainers.size){
            if(players[playerPtr] <= trainers[trainerPtr]){
                playerPtr++
            }
            
            trainerPtr++
            
        }
        return playerPtr

    
    }
}