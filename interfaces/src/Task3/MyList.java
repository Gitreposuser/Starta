package Task3;

// **************
// *** Task 3 ***
// **************

public interface MyList {
    // Remove elements from array(list) in array from to
    public <T> void removeRange(T [] array, int from, int to);

    // Fill array(list) with max possible value
    public <T> void fillWithMax(T [] array);

    // Fill array(list) with min possible value
    public <T> void fillWithMin(T [] array);

    // Fill array(list) with random values in range
    public <T> void fillWithRandom(T [] array, int from, int to);

    // Concatenate all strings in array(list) to one string
    public String concatenateAll(String [] array);
}