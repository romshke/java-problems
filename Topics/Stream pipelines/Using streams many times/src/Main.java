import java.util.function.*;
import java.util.stream.*;

class FunctionUtils {

    public static <T> Supplier<Stream<T>> saveStream(Stream<T> stream){
        // write your code here
        return stream.toList()::stream;
    }

//    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        Supplier<Stream<Integer>> saved = FunctionUtils.saveStream(stream.filter(n -> n % 2 == 0));
//
//        System.out.println(saved.get().count());
//        System.out.println(saved.get().max(Integer::compareTo).get());
//        System.out.println(saved.get().min(Integer::compareTo).get());
//    }
}