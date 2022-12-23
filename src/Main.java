import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    /**Создайте массив из 15 случайных целых чисел из отрезка [0;99].
     * Выведите массив на экран.
     * Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
     */
    public static int[] generateRandomArray1() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray1();
        System.out.println(Arrays.toString(arr));
        int total = 0;
        for (int i: arr) {
            if (i % 2 ==0) {
                total++;
            }
        }
        System.out.println(total);
    }
    public static int[] generateRandomArray2() {
        java.util.Random random = new java.util.Random();
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(11);
        }
        return arr2;
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] arr2 = generateRandomArray2();
        System.out.println("Массив" + Arrays.toString(arr2));
        for (int i=0; i< arr2.length; i++) {
            if (i%2 !=0) {
                arr2[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] generateRandomArray3() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(6);
        }
        return arr;
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr1 = generateRandomArray3();
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = generateRandomArray3();
        System.out.println(Arrays.toString(arr2));
        int total1 = 0;
        int total2 = 0;
        for (int element: arr1) {
            total1+=element;
        }
        System.out.println(total1);
        for (int element: arr2) {
            total2+=element;
        }
        System.out.println(total2);
        double middle1 = (double) total1/arr1.length;
        double middle2 = (double) total2 / arr2.length;
        System.out.println(middle1);
        System.out.println(middle2);
        if (middle1 > middle2) {
            System.out.println("среднее арифметическое для массива arr1 оказалось больше");
        } else if (middle2 > middle1) {
            System.out.println("среднее арифметическое для массива arr2 оказалось больше");
        } else {
            System.out.println("среднее арифметическое в двух массивах равны");
        }
    }
/**Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
 * Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
    public static int[] generateRandomArray4() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = random.nextInt(90) + 10;
         }
         return arr;
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = generateRandomArray4();
        int b = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i+1]) {
                b++;
            }
        }
        if (b == 3) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int[] arr = new int[20];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }

    /**Определите закономерность данных ниже последовательностей чисел
     1, 4, 9, 16, 25...
     1, -4, 9, -16, 25...
     1, -1, 1, -1, 1, -1...
     1, 0, 2, 0, 3, 0, 4...
      */
    public static void task6() {
        System.out.println("Задача 6");
        int[] arr1 = new int[10];
        int number1 = 1;
        int a = 1;
        for (int i = 0; i < arr1.length; i++) {
                arr1[i] = number1;
                a += 2;
                number1 += a;
            if (i%2 != 0) {
                arr1[i] = -arr1[i];
            }
        }

        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[10];
        int number2 = 1;
        int a2 = 1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = number2;
            a2 +=2;
            number2 +=a2;
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i]= 1;
            if (i%2!=0) {
                arr3[i] = - arr3[i];
            }
        }
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[10];
        arr4[0] = 1;
        for (int i = 1; i < arr4.length; i++) {
            if (i%2 == 0) {
                arr4[i] = arr4[i-2] + 1;
            } else {
                arr4[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr4));




    }

}