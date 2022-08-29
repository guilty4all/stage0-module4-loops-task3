package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz" ;
        for(int count = 0; count < alphabet.length();count++){
            System.out.println(alphabet.charAt(count));
        }
    }
}
