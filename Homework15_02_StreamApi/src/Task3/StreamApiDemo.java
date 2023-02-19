package Task3;

// **************
// *** Task 3 ***
// **************

public class StreamApiDemo {
    public static void main(String[] args) {
        String [] names = new String[]{"John", "Sam", "Tom", "Eddy", "Tony",
                "Mika", "Nikki", "Bill", "Jenny", "Josh"};

        showNames(names);

        System.out.println("\nresult of search: ");
        StreamApiService.showNamesByFilter(names,"^J");
    }

    private static void showNames(String [] names) {
        for(String name: names){
            System.out.println(name);
        }
    }
}
