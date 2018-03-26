import java.util.Scanner;
/**
 * @author Aleksandra Anosova
 */
public class Calc {
    public static void main(String[] args) {
        Scanner Calc = new Scanner(System.in);
        // Создаем переменную Calc  с возможостью ввода данных в консоли System.in
        float one, two, result;
        /* cоздаем переменные для хранения введенных данных*/
        System.out.println("Введите первое дробное число:");
        /* cообщение о вводе первого значения*/
        one = Calc.nextFloat();
        /*Ввод значения с клавиатуры с плавающей  точкой*/
        System.out.println("Введите второе дробное число:");
        two = Calc.nextFloat();
        result = one + two;
        /**Суммирование значений в переменной result */
        System.out.printf("Сумма значений: %.4f", result);
        /**Вывод в консоль значения поля result с округлением до 4 знаков после запятой */
    }
}