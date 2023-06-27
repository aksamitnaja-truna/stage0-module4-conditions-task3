package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
//        java.util.Map<String,String> mounths = new java.util.HashMap<String,String>();
        int[] mounths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month < 0 || month > 12){
            System.out.println("wrong number!");
            return;
        }
        System.out.println(mounths[month]);
    }
}
