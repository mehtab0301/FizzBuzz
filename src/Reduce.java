public class Reduce {
    public static int main(int n) {
        int steps = 0;
        boolean divisibleby2;
        while (n > 0){
            divisibleby2 = n % 2 == 0;
            if (divisibleby2) {
                n = n / 2;
            }
            else{
                n--;
            }
            steps ++;
        }
        return steps;
        //System.out.println("The number of steps it takes to reach 100 are: " + steps);
    }

    public static void main(){
        int steps = Reduce.main(100);
        System.out.println("The number of steps it takes to reach 100 are: " + steps);


    }
}
