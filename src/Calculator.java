import static java.lang.Math.*;

public class Calculator {
    public static void main(String[] args){
        double doc = sqrt(2223320);
        System.out.println(doc);
        //извлекаем квадратный корень данного значения 1491.0801453979595

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
        //вне зависимости от значений дробной части, округляем числа в большую сторону



    }



}
