package Task4;// **************
// *** Task 4 ***
// **************

public class WhileDefinition4 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            // Semantic error, operator i++ should be
            // in while scope area at line 8
            i++;
        }
    }
}