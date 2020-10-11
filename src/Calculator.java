import static java.lang.Math.sqrt;
import static java.lang.Math.round;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.ceil;

public class Calculator {
    public static void main(String[] args){
        double doc = sqrt(2223320);
        System.out.println(doc);
        //получаем корень данного значения 1491.0801453979595

        double roundd = round(233.99999999f);
        System.out.println(roundd);
        //округляем числа 233.99999999f до ближайшего числа 234.0

        float maxx = max(2412,413232);
        System.out.println(maxx);
        //получаем максимальное значение

        float minn = min(2412,413232);
        System.out.println(minn);
        //находим и возвращаем наименьшее из переданных чисел

        double ceill = ceil(2412.413232);
        System.out.println(ceill);
        //вычисляем и возвращаем наименьшее целое число,
        //которое больше или равно переданному числу, тоист округляем число вверх



    }



}
