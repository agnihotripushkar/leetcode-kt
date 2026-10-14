class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0,0,new ArrayList<>(),result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index,int total,List<Integer> current, List<List<Integer>> result){
        if(total == target){
            result.add(new ArrayList<>(current));
            return;
        }
        if(total > target || index>=candidates.length){
            return;
        }

        // adding the current index 
        current.add(candidates[index]);
        // allow reuse (index same but total is added)
        backtrack(candidates,target,index, total+candidates[index], current,result);

        // undo
        current.remove(current.size() - 1);
        // skip: move to next index without adding the current item in total  
        backtrack(candidates, target, index+1,total,current,result);
    }
}