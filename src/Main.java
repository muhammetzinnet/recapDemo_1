public class Main {
    public static void main(String[] args) {
        int number_1 = 20;
        int number_2 = 25;
        int number_3 = 3;

        int bigNumber = number_1;

        if (bigNumber < number_2){
            bigNumber = number_2;
        }

        if (bigNumber < number_3) {
            bigNumber = number_3;
        }

        System.out.println("Büyük sayı: " + bigNumber);

    }
}