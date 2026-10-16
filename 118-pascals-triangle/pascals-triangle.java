class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(List.of(1));
        if(numRows==1) return list;
        list.add(List.of(1,1));
        for(int i=2;i<numRows;i++){
            int a=0;
            List<Integer> list1=new ArrayList<>();
           for(int j=0;j<i;j++){
               a=a+list.get(i-1).get(j);
                list1.add(a);
                a=list.get(i-1).get(j);
           }
           list1.add(1);
           list.add(list1);
        }
        return list;
    }
}