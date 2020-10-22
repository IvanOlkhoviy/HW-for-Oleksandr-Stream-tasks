import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTasks {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();

        for (int i = 0; i <= 100; i++){
            arr.add((int)(Math.random()*1000));
        }

        printEvenNumbers(arr);
        printFibonacciSequence();
    }


    public static void printEvenNumbers(List<Integer> list){

        list = list.stream()
                .filter(value -> value % 2 ==0)
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }


    public static void printFibonacciSequence(){
         Stream.iterate(new int[]{0,1}, x -> new int[]{x[1], x[0] + x[1]})
                 .limit(20)
                 .map(x -> x[0])
                 .forEach(System.out::print);
    }
}
