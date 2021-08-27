package HW5;

public class Sotrudnik {
    String FIO;
    String workposition;
    String mail;
    long phone;
    int payment;
    int age;


    public Sotrudnik (String FIO, String workposition, String mail, int phone, int payment, int age) {
        this.FIO = FIO;
        this.workposition = workposition;
        this.mail = mail;
        this.phone =phone;
        this.payment = payment;
        this.age = age;





    }
        String infoYoshiko () {
         String print = FIO + " " + workposition + " " +  mail + " " + phone + " " + payment + " " + age;
         System.out.println("InfoAboutYoshiko = " +print);

        return " ";
    }

    }





