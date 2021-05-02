// https://leetcode.com/problems/pascals-triangle

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) {return null;}
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        al.add(1);
        mainList.add(al);
        for(int i=1; i<numRows; i++) {
            mainList.add(getPascal(mainList.get(i-1)));
        }
        return mainList;
    }
    public List<Integer> getPascal(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        for(int i=0; i<list.size()-1; i++) {
            temp.add(list.get(i)+list.get(i+1));
        }
        temp.add(1);
        return temp;
    }
}