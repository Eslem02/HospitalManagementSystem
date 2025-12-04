import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PatientList list=new PatientList();

        list.addPatient(new Patient(1,"Eslem",6,40));
        list.addPatient(new Patient(2,"Mustafa",3,25));
        list.addPatient(new Patient(3,"İrem",2,52));
        list.addPatient(new Patient(4,"Zeynep",4,20));
        list.addPatient(new Patient(5,"Fatma",8,38));
// vc


        list.removePatient(3);
        System.out.println(list.findPatient(5));
        list.printList();

    }
}
