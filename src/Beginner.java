import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Beginner {


    public static void main(String[] args) {

        System.out.println(sleepIn(false,true));

    }
    // Параметр weekday имеет
    // значение true если это рабочий день недели,
    // и параметр vacation имеет значение true если у нас каникулы.
    // Мы спим, если это не рабочий день или у нас каникулы.
    // Вернуть значение true, когда мы спим.

    public static boolean sleepIn(boolean weekday, boolean vacation){
        return (!weekday || vacation);
    }

    // Дано целое число n​, вернуть абсолютную разницу между n и 21,
    // но вернуть удвоенную разницу, если n больше 21

    public static int diff21(int n){
        if(n<=21){
            return 21-n;
        } else {
            return (n-21) * 2;
        }
    }

    // Дана строка​, вернуть новую строку,
    // где последние 3 символа в верхнем регистре(заглавные).
    // Если строка длины меньше 3, перевести это в заглавные.

    public static String endUpp(String str){

        int InUpp = str.length()-3;
        int length = str.length();

        if (str.length() < 3)
            return str.toUpperCase();

        String upp = str.substring(InUpp, length).toUpperCase();
        return str.substring(0, InUpp) + upp;
    }

    //Даны три целых числы​ a b c, вернуть наибольшее.

    public static int Maximum(int a, int b, int c){
        int max = 0;
        if ( a > b){
            max = a;
        }else{
            max = b;
        }if (c > max){
            max = c;
        }
        return max;
    }

//  Даны два массива целых чисел. Вернуть true если у них одинаковый первый или последний элемент.
    // Оба массива длины 1 или более.

    public boolean commonEnd(int[] a, int[] b) {

        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    // Дан массив целых чисел.​Вернуть сумму двух первых элементов массива. Если длина массива меньше двух,
    // вернуть сумму всех элементов. Вернуть 0, если длинамассива равна нулю.

    public static int sum2(int[] nums) {
        int sum = 0;
        if(nums.length >= 2) {
            return (nums[0] + nums[1]);
        } else if(nums.length == 1) {
            return nums[0];
        }else{
            return sum;
        }
    }

    // Вернуть количество четных чисел в массиве​ целых чисел.

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    // Вернуть версию входного массива, где каждое нулевое значение
    // заменено максимальным нечетным значением, справа от нуля.
    // Если нечетных числе справа отнуля нет, то оставляем ноль.

    public static int[] zeroMax(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                temp = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > temp && nums[j] % 2 != 0)
                        temp = nums[j];
                }
                if (temp != 0)
                    nums[i] = temp;
            }
        }
        return nums;
    }

    // Вернуть массив, смещенный влево на один индекс. То ест для {6, 2, 5, 3} вернуть {2,5, 3, 6}.
    // Можно вернуть измененный данный массив, а можно вернуть новый.

    public static int[] shiftLeft(int[] nums){
        if (nums.length > 0) {
            int first = nums[0];
            for (int i = 0; i < nums.length - 1; i++)
                nums[i] = nums[i + 1];
            nums[nums.length - 1] = first;
        }
        return nums;
    }

    // Даны две строки,​вернуть их конкатенацию,
// но без первого символа в каждой. Строки не нулевой длины.

    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    //  Дана строка четной длины.​Вернуть строку из двух центральных символов,
    // напримерстрока "string" превратиться в "ri". Длина входной строки минимум 2.

    public static String middleTwo(String str) {

        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }


}