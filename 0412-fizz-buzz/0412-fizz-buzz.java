class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<>();
        String s;
        for(int i=1;i<n+1;i++){
            if(i%15==0){
            s="FizzBuzz";
            arr.add(s);
            }
            else if(i%3==0){
                s="Fizz";
            arr.add(s);
            }
            else if(i%5==0){
                s="Buzz";
            arr.add(s);
            }
            else{
            arr.add(String.valueOf(i));
            }
        }
        return arr;
        }
}