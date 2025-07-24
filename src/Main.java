//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char clientOS = '1';
        if (clientOS == '1') {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == '0') {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        char client_OS = '0';
        int clientDeviceYear = 2010;
        if (clientDeviceYear < 2015 && client_OS == '1') {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && client_OS == '0') {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (client_OS == '1') {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (client_OS == '0') {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        int year = 1808;
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        int distance = 95;
        if (distance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else if (distance > 100) {
            System.out.println("Доставки нет");
        }

        int monthNumber = 15;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("сезон - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("сезон - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("сезон - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("сезон - осень");
                break;
            default:
                System.out.println("Указанного месяца не существует");
        }
    }
}