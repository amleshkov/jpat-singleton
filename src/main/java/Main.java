import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = ConsoleLogger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Старт программы");
        logger.log("Ввод данных для генерации списка");
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите максимальное значение для элемента: ");
        int max= scanner.nextInt();
        RandomList randomList = new RandomList(size, max);
        List<Integer> result = randomList.generate();
        System.out.print("Введите пороговое значение: ");
        int threshold = scanner.nextInt();
        Filter filter = new Filter(threshold);
        List<Integer> list = filter.filterOut(result);
        logger.log("Выводим результат пользователю");
        System.out.println("Получен список: " + list);
    }
}
