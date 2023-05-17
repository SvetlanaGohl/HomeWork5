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
            } else if (clientOSystem == 0) {
                if (clientDeviceYear > 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке ...");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке...");
                }
            }

        System.out.println("Задача 3");
        int year = 2300 ;
        if (year%4 == 0 && year%100 !=0 || year%400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задача 4");
        int deliveryDistance = 90;
        int timeDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + timeDelivery + " суток.");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (timeDelivery + 1) + " суток.");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (timeDelivery + 2) + " суток.");
        } else {
        System.out.println("Доставки нет");
        }


        System.out.println("Задача 5");
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону ЗИМА.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону ВЕСНА.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону ЛЕТО.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону ОСЕНЬ.");
                break;
            default:
                System.out.println("Попробуйте ввести номер месяца еще раз.");
        }

    }
}

