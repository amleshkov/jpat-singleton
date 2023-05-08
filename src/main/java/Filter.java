import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = ConsoleLogger.getInstance();
        logger.log("Начинаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        result = source.stream().filter(x -> predicate(x)).toList();
        logger.log("Результирующий список: " + result);
        return result;
    }

    private boolean predicate(int value) {
        Logger logger = ConsoleLogger.getInstance();
        if (value > threshold) {
            logger.log("Элемент \"" + value +"\" проходит");
            return true;
        } else {
            logger.log("Элемент \"" + value +"\" не проходит");
            return false;
        }
    }
}
