public class WhileDefinition5 {
    public static void main(String[] args) {
        int i = 1;
        // Semantic error, wrong condition
        // should be less equal at while condition line 6
        while (i <= 100) {
            System.out.println(i);
            // Semantic error, should increase counter
            // line 10 i++
            i++;
        }
    }
}
