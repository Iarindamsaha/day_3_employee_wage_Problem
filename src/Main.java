public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Program");
        System.out.println("............................................");
        System.out.println(" ");


        final int isPresent = 1;
        final int isAbsent = 0;
        final int isPartTime =2;
        int dailyWage = 20;
        int dailyWorkHour;
        int dailySalary;
        int return_value = 0;
        int checkAttendance =(int)((Math.random()*10)%3);

        switch(checkAttendance){
            case isPresent: {
                System.out.println("The Employee is Present");
                dailyWorkHour = 8;
                return_value=dailyWorkHour;
                break;
            }
            case isPartTime: {
                System.out.println("The Employee is Present But Part Time..");
                dailyWorkHour = 5;
                return_value=dailyWorkHour;
                break;
            }
            default: {
                System.out.println("The Employee is Absent");
                dailyWorkHour=0;
                return_value=dailyWorkHour;
                break;
            }
        }
        dailySalary = dailyWage * return_value;
        System.out.println("Daily Salary is ="+dailySalary);
    }
}
