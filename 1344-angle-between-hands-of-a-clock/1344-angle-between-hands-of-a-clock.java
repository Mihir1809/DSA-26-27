class Solution {
    public double angleClock(int hour, int minutes) {
        Double res=Math.abs(30*hour-5.5*minutes);
        return Math.min(res,360-res);
    }
}