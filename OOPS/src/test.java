public class test {
    public static void main(String[] args) {

//    lakshay.rno = 10;
//    lakshay.name = "lakshayo";
//    lakshay.marks = 99.9f;
        Student lakshay = new Student(13,"name",99.54f);
        System.out.println(lakshay.rno);
        System.out.println(lakshay.name);
        System.out.println(lakshay.marks);
    }

}

class Student {
    int rno;
    String name;
    float marks;

    Student(int roll,String naam,float perc) {
        this.rno = roll ;
        this.name = naam;
        this.marks = perc;

    }
}