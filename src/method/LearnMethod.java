package method;

public class LearnMethod {


    public void doSummations(){
        int num1 = 29;
        int num2 = 34;
        int sum= num1+num2;
        System.out.println("Summations vales is " + sum);
    }


    public int doSubtraction (int num1, int num2){
        int number1 = num1;
        int number2= num2;
        int sub= number1-number2;
        System.out.println("Sub.... value is " + sub);
        return sub;

    }

    public String stInfo (String fName, String lName, int age){

        String fullName= fName+" "+lName;
        System.out.println("Full name is " + fullName+"Age"+age);
        return fullName;

    }


    public static void stInfo(){
        System.out.println("student information");
        System.out.println("student information");
        System.out.println("student information");
        System.out.println("student information");

    }

    public static void main(String[] args) {
        LearnMethod.stInfo();
        LearnMethod obj= new LearnMethod();
        obj.doSummations();
        obj.doSubtraction(30,33);
        obj.stInfo("Arman","Hossain" ,24);

    }
}
