package advanve;

public class LearnRecursion {

    int count=0;

    public void stInfo(){
        count++;
        if (count <=5) {
            System.out.println("student name id arman");
            stInfo();
        }
    }

    public static void main(String[] args) {
        LearnRecursion obj=new LearnRecursion();
        obj.stInfo();
    }
}
