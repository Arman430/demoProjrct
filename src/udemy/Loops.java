package udemy;


public class Loops {

    public static void main(String[] args) {
        int a=1;
        while(a<=11){
            a+=2;
            System.out.println(a);
        }
        System.out.println("******************");
        int input=8;
        int outpur=1;
        int sum=0;


        for(int i=0; i<input; i++){
            System.out.println(outpur);
            sum+=outpur;
            outpur+=2;
        }
        System.out.println("The sum of add number upto "+ input+ " terms is "+ sum+".");




    }
}
