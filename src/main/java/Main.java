import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalParticipantsCount = 3;
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= totalParticipantsCount; i++) {
            String name = "";
            while (true) {
                System.out.println("— Введите название машины №" + i + ":");
                name = scanner.next().trim();
                if (!name.isEmpty()) break;
                System.out.println("— Название машины не должно быть пустым");
            }

            int speed = 0;
            while (true) {
                System.out.println("— Введите скорость машины №" + i  + ":");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (speed > 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("— Неправильная скорость. К гонке допускаются автомобили со скоростью от 1 до 250 км/час");
                    }
                } else {
                    System.out.println("— Неправильная скорость. Скорость должна быть целым числом");
                    scanner.next();
                }
            }

            race.determineWinner(new Car(name, speed));
        }

        System.out.println("Самая быстрая машина: " + race.getCurrentWinnerName());
        scanner.close();
    }
}