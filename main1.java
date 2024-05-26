
package java_class_barka;

public class Main {
    String name = "bola ";
    String password;
    String schoolName;
    String matricNo;
    int staffNo;
    public static void main(String[] args) {
        Person uzoma = new Person("binghamUni", "uzoma", "xyz1234", "098");
        Person lecturer = new Person("uniBingham", "barka", "xyz1234", 0064);

        uzoma.setName("Marvelous");
        uzoma.setPass("1234abc");
        System.out.println(uzoma.getName());
        System.out.println(lecturer.getName());
        System.out.println(uzoma.getPass());
    }


}
