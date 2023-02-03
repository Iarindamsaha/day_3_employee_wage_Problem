public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Program");
        System.out.println("............................................");
        System.out.println(" ");

        final int isPresent = 1;
        final int isAbsent = 0;
        final int isPartTime =2;

        int daily_wage_per_hour = 100;
        int max_hour_in_month=100;
        int working_day = 20;
        //while loop vars
        int Total_salary=0;
        int total_working_hr=0;
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

            /*if(total_emp_hr>max_hour_in_month){
                total_emp_hr=total_emp_hr-return_value;
                break;
            }
            */

            dailySalary = return_value*daily_wage_per_hour;
            System.out.println("Daily Salary="+dailySalary);


            Total_salary = Total_salary + dailySalary;
            total_working_days++;
        }
        System.out.println("..........................");
        System.out.println("Total Salary:"+Total_salary);
    }
}
