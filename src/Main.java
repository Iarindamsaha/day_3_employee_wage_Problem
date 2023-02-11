public class Main {

    public static final int isPresent = 1;
    public static final int isPartTime = 2;

    int Total_salary_company1 = 0;
    int Total_salary_company2 = 0;


    public void employeeWageCalculation_1(){

        final int isPresent = 1;
        final int isPartTime = 2;
        int max_hour_in_month = 70;
        int working_day = 30;

        String companyName = "Google";
        int dailyWage = 1200;

        //while loop vars

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

            Total_salary_company1 = Total_salary_company1 + dailySalary;
            total_working_days++;
        }
        System.out.println("Company Name : " + companyName);
        System.out.println("Total Salary:" + Total_salary_company1);
        System.out.println("........................");

    }

    public void employeeWageCalculation_2(){
        final int isPresent = 1;
        final int isPartTime = 2;
        int max_hour_in_month = 65;
        int working_day = 15;

        String companyName = "Microsoft";
        int dailyWage = 1000;

        //while loop vars

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

            Total_salary_company2 = Total_salary_company2 + dailySalary;
            total_working_days++;
        }
        System.out.println("Company Name : " + companyName);
        System.out.println("Total Salary:" + Total_salary_company2);
        System.out.println("........................");
    }


    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Program");
        System.out.println("............................................");
        Main obj = new Main();
        obj.employeeWageCalculation_1();
        obj.employeeWageCalculation_2();

    }
}
