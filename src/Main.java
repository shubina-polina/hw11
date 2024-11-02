public class Main {
    public static void main(String[] args) {
        // задача 1
        int year = 2024;
        checkLeapAndPrint(year);
        // задача 2
        int clientDeviceYear = 2013;
        int clientOss = 0;
        calculateDeviceVersion(clientDeviceYear, clientOss);
        // задача 3
        int deliveryDistance = 60;
        int deliveryDays = days(deliveryDistance);
        if (deliveryDays == 0) {
            System.out.println("Свыше 100 км доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }




    //задача 1
    private static void checkLeapAndPrint(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }
    // задача 2
    private static void calculateDeviceVersion(int clientDeviceYear, int clientOss) {
        int currentYear = clientDeviceYear;
        if (clientOss == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOss == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOss == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOss == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }
    private static int days(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance < 20){
            days++;
            return days;
        } else if (deliveryDistance < 60) {
            days += 2;
            return  days;
        } else if (deliveryDistance <= 100) {
            days+= 3;
            return days;
        }
        return days;
    }






    }



