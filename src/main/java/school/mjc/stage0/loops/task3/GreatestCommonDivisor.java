package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int border ;
        int del = 2;
        int result = 0 ;
        if (first > second){
            border = first;

        }else {
            border = second;
        }
        if(first == second) {
            result = first;

        }else if (first == 0 || second == 0){
            if (first > second){
                result = first;
            }else {
                result = second;
            }
        }else{
            for(int i = 0;i <= border; i++){
                if (first % del == 0 && second % del == 0){
                    result = del;
                }else{
                    del++;
                }

            }
        }
        System.out.println(result);
    }
}
