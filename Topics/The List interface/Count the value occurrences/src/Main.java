class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        // there is no need to input data from the command line
        // instead, use arguments elem, list1 and list2
        // Return true if the counts are the same, otherwise false
        return Collections.frequency(list1, elem) == Collections.frequency(list2, elem);
    }
}