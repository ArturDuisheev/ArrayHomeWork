import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.OptionalDouble;

//ДЗ:
//        Создать массив дробных (не целых) чисел размером 15 элементов и наполнить
//        его положительными и отрицательными числами;
//        Затем через цикл “for each” посчитать среднее
//        арифметическое положительных чисел расположенных после первого отрицательного
//        числа и вывести его на экран (8, -2, -4, 2, 3, 6, -7) =  11/3
//
public class Main {
    public static void main(String[] args) {
        double[] numbers = {0.3 ,1.3 ,2.3 ,-3.2 ,15.3, 13.3, -12.3, 54.4, -23.4, 213.4, 24.3, 25.4, 24.4, -14.4, 65.5};
        double sum = 0;
        Integer count = 0;
        boolean proverka = false;
        for (Double FloatNumber : numbers) {
            if(FloatNumber < 0){
                proverka = true;
            }else if (FloatNumber > 0 && proverka){
                sum+=FloatNumber;
                count++;
            }

        }
        System.out.println("Среднее арифмитеческое: " + sum/count);

        }
        }
        
