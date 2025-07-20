import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        // there is no need to input data from the command line
        // instead, use arguments elem, list1 and list2
        return list1.stream().filter(el -> el == elem).count() == list2.stream().filter(el -> el == elem).count();
    }
}