import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PatientList list=new PatientList();
        TreatmentQueue queue=new TreatmentQueue();
        DischargeStack stack= new DischargeStack();

        //list.addPatient(new Patient(1,"Eslem",6,40));
        //list.addPatient(new Patient(2,"Mustafa",3,25));
        //list.addPatient(new Patient(3,"İrem",2,52));
        //list.addPatient(new Patient(4,"Zeynep",4,20));
        //list.addPatient(new Patient(5,"Fatma",8,38));


        //list.removePatient(3);
        //System.out.println(list.findPatient(5));
        //list.printList();

        System.out.println("----------------------------------------------------------------------");

        //queue.enQueue(new TreatmentRequest(101));
        //queue.enQueue(new TreatmentRequest(102));
        //queue.enQueue(new TreatmentRequest(103));
        //queue.enQueue(new TreatmentRequest(104));
        //queue.enQueue(new TreatmentRequest(105));
        //queue.enQueue(new TreatmentRequest(106));
        //queue.enQueue(new TreatmentRequest(107));
        //queue.enQueue(new TreatmentRequest(108));

        //queue.deQueue();
        //queue.deQueue();
        //queue.deQueue();

        //queue.printQueue();

        //System.out.println("Queue size: "+queue.realSize());

        stack.push(new DischargeRecord(101));
        stack.push(new DischargeRecord(102));
        stack.push(new DischargeRecord(103));
        stack.push(new DischargeRecord(104));
        stack.push(new DischargeRecord(105));

        stack.pop();
        stack.pop();

        stack.printStack();


}
}

