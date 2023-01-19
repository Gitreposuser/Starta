package Task2;// **************
// *** Task 2 ***
// **************

public class WhileDefinition2 {
    public static void main(String[] args) {
        int i = 1;
        // Missing opening scope after condition statement at line 5 "{"
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}
