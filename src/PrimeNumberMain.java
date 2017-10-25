import java.util.Scanner;

public class PrimeNumberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jeśli chcesz sprawdzić, czy liczba jest liczbą pierwszą wybierz 1");
        System.out.println("Jeśli chcesz sprawdzić ile jest liczba pierwszych do liczby którą podałeś wybierz 2");
        int numberOfChoice = scanner.nextInt();
        int number;

        switch (numberOfChoice){
            case(1):
                System.out.print("Podaj liczbę: ");
                number = scanner.nextInt();
                if(isPrime(number)){
                    System.out.println("Liczba " + number + " jest liczbą pierwszą");
                }
                break;
            case(2):
                System.out.print("Podaj liczbę: ");
                number = scanner.nextInt();
                int count = 0;
                for(int i = 1; i < number; i++) {
                    if (isPrime(i)) {
                        count++;
                        System.out.println("Liczba " + i + " jest liczbą pierwszą");
                    }
                }
                break;

        }

    }
    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
