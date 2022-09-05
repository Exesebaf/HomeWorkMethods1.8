import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        int year = 2004;
        task1(year);

        int clientDeviseYear = 2020;
        int clietnOC = 1;
        task2(clietnOC, clientDeviseYear);

        int  deliveryDistance = 95;
        System.out.println("Потребуеться дней на доставку " + task3(deliveryDistance) + " дня");
    }
    public static void task1( int year){
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " Год является висококосным");
        } else {
            System.out.println(year + " Год не является висококосным");
        }
    }

    public static void task2(int clietnOC, int clientDeviseYear) {
        int currentYear = LocalDate.now().getYear();
        if (clietnOC == 0) {
            if (clientDeviseYear < currentYear) {
                System.out.println("Установите облегченную версию IOS по ссылке");

            } else {
                System.out.println("Установите версию приложения IOS по ссылке");
            }
        } else {
            if (clientDeviseYear < currentYear) {
                System.out.println("Установите облегченную версию Android по ссылке");
            } else {
                System.out.println("Установите версию приложения Android по ссылке");
            }
        }

    }
    public static int task3( int deliveryDistance){
        int deloveryDays = 1;
        if (deliveryDistance > 20){
            deloveryDays++;
        }
        if (deliveryDistance > 60){
            deloveryDays++;
        }
        return deloveryDays;
    }

}