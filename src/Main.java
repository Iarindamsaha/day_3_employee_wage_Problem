public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Program");
        System.out.println("............................................");
        System.out.println(" ");

        int isPresent = 1;
        int isAbsent = 0;
        int dailyWage = 20;
        int dailyWorkHour;
        int dailySalary;
        int checkAttendance =(int)((Math.random()*10)%2);

        if (checkAttendance == isPresent){
            System.out.println("The Employee is Present");
            dailyWorkHour=8;
        }
        else{
            System.out.println("The Employee is Absent");
            dailyWorkHour=0;
        }
        dailySalary = dailyWage * dailyWorkHour;
        System.out.println("Daily Salary is ="+dailySalary);

        }
}
