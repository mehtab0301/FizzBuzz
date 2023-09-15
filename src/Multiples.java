public class Multiples {
    public static int main(int n, int a, int b) {
        int count = 0;
        int i = 1;
        while (i < n){
            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;
            if (divisibleBya || divisibleByb){
                count++;
            }
            i ++;
        }
        //System.out.println("The number divisible by 3 and 5 are: " + count);
        return count;
    }

    public static int main() {
        int count = main(1000, 3, 5);
        System.out.println("The number divisible by 3 and 5 are: " + count);
        return count;
    }
}
