package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String num = "9";
        String number = "";
        int result = 0;
        for (int i =1; i <= lengthOfLastNumber;i++){
            number = "";
            for(int c = 1; c <= i; c++){
                number += num;
            }
            result += Integer.parseInt(number);
        }
        System.out.println(result);
    }
}
