import java.util.ArrayList;

interface EmpWage{
    int isPresent = 1;
    int isPartTime = 2;

    void employeeWageCalculation(String employeeName, String companyName, int dailyWage, int max_hour_in_month, int working_day);

}

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Program");
        System.out.println("............................................");
        EmpService obj = new EmpService();
        obj.employeeWageCalculation("ABC", "Microsoft", 900, 65, 30);
        obj.employeeWageCalculation("XYZ", "Google", 800, 80, 27);
        obj.displayAll();
    }
}

class EmpService implements EmpWage{

    ArrayList<EmployeeStore> emp = new ArrayList<>();
    EmployeeStore empStore;

    @Override
    public void employeeWageCalculation(String employeeName, String companyName, int dailyWage, int max_hour_in_month, int working_day) {

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
        empStore = new EmployeeStore(employeeName,companyName,dailyWage,max_hour_in_month,working_day,Total_salary);
        emp.add(empStore);

        //System.out.println("Employee Name : " + employeeName + "\n" + "Company Name : " + companyName);
        //System.out.println("Total Salary:" + Total_salary);
        //System.out.println("........................");

    }
    public void displayAll(){
        for(int i = 0 ; i < emp.size(); i++){
            if(emp.get(i) != null ){
                System.out.println(emp.get(i));
            }
        }
    }
}

class EmployeeStore{
    String employeeName;
    String companyName;
    int dailyWage;
    int max_hour_in_month;
    int working_day;

    int total_salary;

    public EmployeeStore(String employeeName, String companyName, int dailyWage, int max_hour_in_month, int working_day, int total_salary) {
        this.employeeName = employeeName;
        this.companyName = companyName;
        this.dailyWage = dailyWage;
        this.max_hour_in_month = max_hour_in_month;
        this.working_day = working_day;
        this.total_salary = total_salary;
    }

    @Override
    public String toString() {
        return "EmployeeStore{" +
                "employeeName='" + employeeName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", dailyWage=" + dailyWage +
                ", max_hour_in_month=" + max_hour_in_month +
                ", working_day=" + working_day +
                ", total_salary=" + total_salary +
                '}';
    }
}