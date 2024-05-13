import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeoutException;

public class Task3 {
    //Создайте 10 checked и 10 unchecked исключений. Сделайте два массива с ними
    public static void main(String[] args) {
        System.out.println("checked");
        Class<?>[] checkedExceptions = {
                IOException.class,
                TimeoutException.class,
                NoSuchMethodException.class,
                URISyntaxException.class,
                InterruptedException.class,
                FileNotFoundException.class,
                InterruptedException.class,
                ParseException.class,
                IllegalAccessException.class,
                InvocationTargetException.class,
        };

        for (int i = 0; i < checkedExceptions.length; i++) {
            System.out.println(checkedExceptions[i]);
        }
        System.out.println("unchecked");
        Class<?>[] uncheckedExceptions = {
                NullPointerException.class,
                ArrayIndexOutOfBoundsException.class,
                ClassCastException.class,
                IllegalArgumentException.class,
                IllegalStateException.class,
                ArithmeticException.class,
                UnsupportedOperationException.class,
                IndexOutOfBoundsException.class,
                NoSuchElementException.class,
                NumberFormatException.class
        };

        for (int i = 0; i < uncheckedExceptions.length; i++) {
            System.out.println(uncheckedExceptions[i]);
        }
        System.out.println("------");
        System.out.println(returnExceptions(checkedExceptions, uncheckedExceptions));
    }

    //Сделайте метод, который возвращает из этих массивов случайный элемент;
// иногда из первого, иногда из второго. Какой тип данных будет возвращать этот метод?
    static String returnExceptions(Class<?>[] checked, Class<?>[] unchecked) {
        Random random = new Random();
        boolean isFirstArray = random.nextBoolean();
        if (isFirstArray && checked.length > 0) {
            int index = random.nextInt(checked.length);
            return ("1 element " + checked[index]);
        } else if (unchecked.length > 0) {
            int index = random.nextInt(unchecked.length);
            return ("2 element " + unchecked[index]);
        }
        return null;

    }


}

