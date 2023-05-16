public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке ...");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке ...");
        }


        System.out.println("Задача 2");
        int clientOSystem = 0;
        int clientDeviceYear = 2016;
        if (clientOSystem == 1) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке ...");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке...");
            }
        } else if (clientOSystem == 0)
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке ...");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке...");
            }

        System.out.println("Задача 3");
        int year = 2000 ;
        if (year%4 == 0 && year%100 !=0) {
            if (year%400 == 0)
                System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задача 4");
        int deliveryDistance = 59;
        int timeDelivery1 = 1;
        int timeDelivery2 = 2;
        int timeDelivery3 = 3;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + timeDelivery1 + " суток.");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + timeDelivery2 + " суток.");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + timeDelivery3 + " суток.");
        } else {
        System.out.println("Доставки нет");
        }


        System.out.println("Задача 5");
        int monthNumber = 8;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Данный месяц принадлежит к сезону ЗИМА.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Данный месяц принадлежит к сезону ВЕСНА.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Данный месяц принадлежит к сезону ЛЕТО.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Данный месяц принадлежит к сезону ОСЕНЬ.");
                break;
            default:
                System.out.println("Попробуйте ввести номер месяца еще раз.");
        }

    }
}

