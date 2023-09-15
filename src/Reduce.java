public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int number = 2;
        boolean divisibleby2;
        while (number > 0){
            divisibleby2 = number % 2 == 0;
            if (divisibleby2) {
                number = number / 2;
            }
            else{
                number--;
            }
            steps ++;
        }
        System.out.println("The number of steps it takes to reach 100 are: " + steps);
    }
}
