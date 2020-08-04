package udemy;

public class ForAndWhileLoops {

    public static void main(String[] args) {

        int x = 0;
        while (x < 10) {
            System.out.println("Hello");
            x++;

        }
        int i = 1;

        while (i < 11) {
            System.out.println(i);
            i++;

        }

        for (int j=0; j<10; j++){
            System.out.println("whats up");

        }
        for (int a=1; a<11; a++){
            System.out.println(a);
        }


        System.out.println("*************************");
        for (int c=3; c<=30; c+=3){
            System.out.println(c);

        }

        int b=0;
        while(b<30){
            b+=3;
            System.out.println(b);
        }
        System.out.println("***************");

        int num = 1;
        while  (num <11){
            System.out.println(num*3);
            num++;
        }

    }
}





