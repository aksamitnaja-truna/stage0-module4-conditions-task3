package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double result;
        if (salary <= 0){
            System.out.println("wrong input!");
            return;
        }
        else if (salary <= 10_000){
            result = salary - salary * 0.15;
        } else if (salary <= 20_000) {
            result = salary - salary * 0.18;
        }
        else {
            result = salary - salary * 0.2;
        }

        System.out.println(result);
    }
}
