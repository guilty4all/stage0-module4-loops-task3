package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if (t < 0){
            t = t*-1;
        }
        String word = "" + t;
        int result = 0;
        int num = 0;

        for(int i = 0;i<word.length();i++){
            num = Character.getNumericValue(word.charAt(i));
            result += num;
        }
        System.out.println(result);
    }
}
