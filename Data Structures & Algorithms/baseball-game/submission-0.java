class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack <>();
        
        for(String str : operations){
            if(str.equals("C")){
                s.pop();
            }else if(str.equals("D")){
                int x=s.peek()*2;
                s.push(x);
            }else if(str.equals("+")){
                int y=s.pop();
                int z=s.peek();
                s.push(y);
                s.push(y+z);
            }else{
                s.push(Integer.parseInt(str));
            }
        }
        int sum=0;
        for(int num : s){
            sum+=num;
        }
        return sum;
    }
}