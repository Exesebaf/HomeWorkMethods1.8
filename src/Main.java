import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        int numberYears = 2003;
        int total = task1(numberYears);

        int clientDeviseYear = 2021;
        int clietnOC = 0;
        int totalOcAndYear = task2(clietnOC,clientDeviseYear);

        int  deliveryDistance = 95;
        int totalDays = task3(deliveryDistance);
    }
    public static int task1( int year){

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " Год является висококосным");
        } else {
            System.out.println(year + " Год не является висококосным");
        }return year;
    }

    public static int task2(int clietnOC, int clientDeviseYear) {
        int currentYear = LocalDate.now().getYear();
        if (clietnOC == 0) {
            if (clientDeviseYear < currentYear) {
                System.out.println("Установите облегченную версию IOS по ссылке");
                return clietnOC;
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
        return clientDeviseYear;
    }
    public static int task3( int deliveryDistance){
        int deloveryDays = 1;
        if (deliveryDistance > 20){
            deloveryDays++;
        }
        if (deliveryDistance > 60){
            deloveryDays++;
        }
        System.out.println("Потребуеться дней на доставку " +deloveryDays + " дня");

        return deloveryDays;
    }

}