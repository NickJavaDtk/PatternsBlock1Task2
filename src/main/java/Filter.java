import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public int getTreshold() {
        return treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int f = this.getTreshold();
//        List<Integer> result = source.stream( )
//                .filter(x -> x >= f)
//                .peek(x -> logger.log("элемент " + x + " добавлен"))
//                .collect(Collectors.toList( ));
        for (Integer intList : source) {
           if (intList >= f) {
               result.add(intList);
               logger.log("элемент " + intList + " добавлен");
            } else {
                 logger.log("элемент " + intList + " не добавлен");
           }

        }

        System.out.println("Отсортированный список " + result);

        return result;
    }
}
