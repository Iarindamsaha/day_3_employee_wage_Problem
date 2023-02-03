public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Program");
        System.out.println("............................................");
        System.out.println(" ");
        int isPresent = 0;
        int isAbsent = 1;
        int checkAttendance =(int)((Math.random()*10)%2);

        if (checkAttendance == isPresent){
            System.out.println("The Employee is Present");

        }
        else{
            System.out.println("The Employee is Absent");

        }
    }
}