package Task1;// **************
// *** Task 1 ***
// **************

public class WhileDefinition1 {
    public static void main(String[] args) {
        int i = 1;
        // Missing opening scope after while in line 5 - "("
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}
