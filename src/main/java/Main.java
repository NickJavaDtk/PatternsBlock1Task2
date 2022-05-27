import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] sArray = {"Запускаем программу", "Добрый день\nПросим вас ввести два числа размер " +
                "списка и верхнюю границу значений\nПример 2 4",
                "Создаём и наполняем список",
                "Введите порог для фильтра",
                "Запускаем фильтрацию",
                "Завершаем программу"};
        Logger logger = Logger.getInstance( );
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            logger.log(sArray[0]);
            logger.log(sArray[1]);
            String inputTwoNumbers = br.readLine( );
            logger.log(sArray[2]);
            List<Integer> listInt = Main.getList(inputTwoNumbers);
            System.out.println("Заполненный список случайными значений " + listInt);
            logger.log(sArray[3]);
            String input = br.readLine( );
            int f = Integer.parseInt(input);
            Filter filter = new Filter(f);
            logger.log(sArray[4]);
            filter.filterOut(listInt);

        } catch (Exception e) {
            e.printStackTrace( );
        }
    }

    public static List<Integer> getList(String input) {
        String[] s = input.split(" ");
        Random rand = new Random( );
        int f = Integer.parseInt(s[0]);
        Integer[] array = new Integer[f];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(Integer.parseInt(s[1]));
        }
        List<Integer> listInt = Arrays.asList(array);
        return listInt;
    }

}

