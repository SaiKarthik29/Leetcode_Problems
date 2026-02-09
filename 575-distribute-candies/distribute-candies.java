class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:candyType){
            set.add(num);
        }
        int canEat=candyType.length/2;
        if(canEat>=set.size()){
            return set.size();
        }
        return canEat;
    }
}