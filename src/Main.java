public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Program");
        System.out.println("............................................");
        System.out.println(" ");


        int check =(int)((Math.random()*10)%3);

        int daily_wage_per_hour= 20;
        int emp_hour=8;
        int emp_part_hour=5;

        if (check == 1){
            int salary = emp_hour*daily_wage_per_hour;
            System.out.println("The Employee is Present and the Salary is:" + salary);
        }
        else if (check == 2){
            int salary = emp_part_hour*daily_wage_per_hour;
            System.out.println("The Employee is Present But Part Time and The Salary is:" + salary);
        }
        else{
            int salary=0;
            System.out.println("The Employee is Absent and The Salary is: " + salary);
        }

    }
}
