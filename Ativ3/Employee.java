package Ativ3;

public class Employee {

    String name;
    double grossSalary;
    double tax;

    void increaseSalary(double percentage){
        grossSalary += grossSalary * (percentage/100);
    }
    double netSalary(){
        return grossSalary - tax;
    }

    @Override
    public String toString() {
        return name + ", " + "$ " + netSalary();
    }
}
