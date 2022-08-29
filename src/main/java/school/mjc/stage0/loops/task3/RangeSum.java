package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int result = 0;
        for (int count = firstBoarder;count<=secondBoarder;count++){
            result += count;
        }
        System.out.println(result);
    }
}
