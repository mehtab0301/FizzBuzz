public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        int i =  1;
        while (i < 1000){
            count += result(i);
            i ++;
        }
        System.out.println("The number divisible by 3 and 5 are: " + count);
    }
    private static int result(int i){
        int count = 0;
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;if (divisibleBy3 || divisibleBy5) {
             count ++;
        }
        return count;


    }
}
