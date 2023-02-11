public class Main {

    public static final int isPresent = 1;
    public static final int isPartTime = 2;


    public void employeeWageCalculation(String employeeName, String companyName, int dailyWage, int max_hour_in_month, int working_day){

        System.out.println(" ");

        //while loop vars
        int Total_salary=0;
        int total_working_days=1;
        int total_emp_hr=0;
        int dailySalary;

        while (total_emp_hr <= max_hour_in_month && total_working_days < working_day){

            int return_value;
            int checkAttendance =(int)((Math.random()*10)%3);
            switch(checkAttendance){
                case isPresent: {
                    int dailyWorkHour = 8;
                    return_value=dailyWorkHour;
                    break;
                }
                case isPartTime: {
                    int dailyWorkHour = 5;
                    return_value=dailyWorkHour;
                    break;
                }
                default: {
                    int dailyWorkHour=0;
                    return_value=dailyWorkHour;
                    break;
                }
            }
            total_emp_hr=total_emp_hr+return_value;

            dailySalary = return_value*dailyWage;

            Total_salary = Total_salary + dailySalary;
            total_working_days++;
        }
        System.out.println("Employee Name : " + employeeName + "\n" + "Company Name : " + companyName);
        System.out.println("Total Salary:" + Total_salary);
        System.out.println("........................");
    }
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Program");
        System.out.println("............................................");
        Main obj = new Main();
        obj.employeeWageCalculation("ABC" , "Microsoft" , 900, 65, 30);
        obj.employeeWageCalculation("XYZ" , "Google" , 800, 80, 27 );

    }
}
