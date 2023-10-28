import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        List<Integer> numbers = new ArrayList<>();
        logger.log("Добро пожаловать");
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();
        System.out.print("Введите верхнюю границу: ");
        int m = scan.nextInt();
        logger.log("Создаём массив");
        System.out.print("Вот случайный список: ");
        for (int i = 0; i < n; i++) {
            numbers.add(random.nextInt(m));
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println("\nВведите число фильтра: ");
        int x = scan.nextInt();
        Filter filter = new Filter(x);
        List<Integer> filteredNumbers = filter.filterOut(numbers);
        logger.log("Отфильтрованный список: " + filteredNumbers);
        logger.log("Завершаем программу");
    }
}