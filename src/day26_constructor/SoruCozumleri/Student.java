package day26_constructor.SoruCozumleri;

public class Student {
    String name="Emily";
    int age=20;
    Student(String name, int age){
        this.name=name;
        this.age=22;
            }
    public static void main(String[] args) {
        Student st=new Student("Oliver",21);
        System.out.print(st.name);
        System.out.print(","+st.age);

    }

}
