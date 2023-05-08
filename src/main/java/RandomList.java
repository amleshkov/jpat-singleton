import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {
    private int size;
    private int max;
    public RandomList(int size, int max) {
        this.size = size;
        this.max = max;
    }

    public List<Integer> generate() {
        Random random = new Random();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(max));
        }
        Logger logger = ConsoleLogger.getInstance();
        logger.log("Создан список: " + result);
        return result;
    }
}
