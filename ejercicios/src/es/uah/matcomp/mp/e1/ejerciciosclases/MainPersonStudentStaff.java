package es.uah.matcomp.mp.e1.ejerciciosclases;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Person;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Student;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Staff;
public class MainPersonStudentStaff {
    public static void main(String[] args){
        Person p= new Person("Ana","hola");
        Student s= new Student("Ana","hola","mia",17,12);
        Staff sf= new Staff("Ana","hola","Carmen Burgos", 45);
        System.out.println(p);
        System.out.println(s);
        System.out.println(sf);
        System.out.println("name is:"+p.getName());
        System.out.println("address is:"+p.getAddress());
        System.out.println("program is:"+s.getProgram());
        System.out.println("year is:"+s.getYear());
        System.out.println("fee is:"+s.getFee());
        System.out.println("school is:"+sf.getSchool());
        System.out.println("pay is:"+sf.getPay());
    }
}
