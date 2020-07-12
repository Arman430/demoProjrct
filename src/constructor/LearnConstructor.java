package constructor;

import javax.imageio.stream.ImageInputStream;

public class LearnConstructor {

    String name;
    String address;
    int age;
    double corseFee;

//    public LearnConstructor() {
//        // default Constructors
//    }


        public LearnConstructor(String name) {
        this.name= name;
            System.out.println(this.name);

    }

        public LearnConstructor (String name, String address, int age) {
             this.name= name;
             this.address= address;
             this.age=age;
            System.out.println(this.name+" "+ this.address+ " "+ this.age);



        }


        public static void main (String args []){
            LearnConstructor learn = new LearnConstructor( "Arman");
            //LearnConstructor now = new LearnConstructor ("Arman",);

           // LearnConstructor dc = new LearnConstructor();
            LearnConstructor arman = new LearnConstructor ( "Arman" ,"ny", 4 );

        }

    }


