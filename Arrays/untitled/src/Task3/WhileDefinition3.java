package Task3;// **************
// *** Task 3 ***
// **************

public class WhileDefinition3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        // Missing closing scope at line 8 "}"
        }
    }
}
