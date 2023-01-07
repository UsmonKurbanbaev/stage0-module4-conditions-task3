package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary < 0){
            System.out.println("wrong input!");
        }
        else {
            if (salary <= 10000) {
                System.out.println(salary * 0.85);
            }
            if (10000 < salary && salary <= 20000) {
                System.out.println(salary * 0.82);
            }
            if (salary > 20000) {
                System.out.println(salary * 0.8);
            }
        }
    }

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();

        calculator.calculateSalary(5000);
    }
}



