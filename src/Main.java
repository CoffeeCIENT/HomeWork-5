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

        char ClientOS = '0';
        int clientDeviceYear = 2010;
        if (clientDeviceYear < 2015) {
            if (ClientOS == '1') {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            if (ClientOS == '0') {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (ClientOS == '1') {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (ClientOS == '0') {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        int year = 2021;
        if (((year - 1200) % 4) == 0) {
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

        int monthNumber = 22;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + " месяц - январь");
                break;
            case 2:
                System.out.println(monthNumber + " месяц - февраль");
                break;
            case 3:
                System.out.println(monthNumber + " месяц - март");
                break;
            case 4:
                System.out.println(monthNumber + " месяц - апрель");
                break;
            case 5:
                System.out.println(monthNumber + " месяц - май");
                break;
            case 6:
                System.out.println(monthNumber + " месяц - июнь");
                break;
            case 7:
                System.out.println(monthNumber + " месяц - июль");
                break;
            case 8:
                System.out.println(monthNumber + " месяц - август");
                break;
            case 9:
                System.out.println(monthNumber + " месяц - сентябрь");
                break;
            case 10:
                System.out.println(monthNumber + " месяц - октябрь");
                break;
            case 11:
                System.out.println(monthNumber + " месяц - ноябрь");
                break;
            case 12:
                System.out.println(monthNumber + " месяц - декабрь");
                break;
            default:
                System.out.println("Указанного месяца не существует");
        }
    }
}