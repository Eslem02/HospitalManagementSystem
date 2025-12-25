import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PatientList list=new PatientList();
        TreatmentQueue queue=new TreatmentQueue();
        DischargeStack stack= new DischargeStack();

        /*list.addPatient(new Patient(1,"Eslem",6,40));
        list.addPatient(new Patient(2,"Tuğba",3,25));
        list.addPatient(new Patient(3,"İrem",2,52));
        list.addPatient(new Patient(4,"Zeynep",4,20));
        list.addPatient(new Patient(5,"Fatma",8,38));


        list.removePatient(3);
        System.out.println(list.findPatient(5));
        list.printList();

        System.out.println("----------------------------------------------------------------------");*/

       /*TreatmentRequest r1=new TreatmentRequest(101,System.currentTimeMillis());
        TreatmentRequest r2=(new TreatmentRequest(102,System.currentTimeMillis()));
        TreatmentRequest r3=(new TreatmentRequest(103,System.currentTimeMillis()));
        TreatmentRequest r4=(new TreatmentRequest(104,System.currentTimeMillis()));
        TreatmentRequest r5=(new TreatmentRequest(105,System.currentTimeMillis()));
        TreatmentRequest r6=(new TreatmentRequest(106,System.currentTimeMillis()));
        TreatmentRequest r7=(new TreatmentRequest(107,System.currentTimeMillis()));
        TreatmentRequest r8=(new TreatmentRequest(108,System.currentTimeMillis()));
        System.out.println("---8 treatment request are added---");
        queue.enQueue(r1);
        queue.enQueue(r2);
        queue.enQueue(r3);
        queue.enQueue(r4);
        queue.enQueue(r5);
        queue.enQueue(r6);
        queue.enQueue(r7);
        queue.enQueue(r8);
        queue.printQueue();
        System.out.println("\n---Dequeue 3 request---");
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

        System.out.println("\n---Remaining queue---");
        queue.printQueue();

        System.out.println("Queue size: "+queue.realSize());

        System.out.println("----------------------------------------------------------------------");*/



        /*stack.push(new DischargeRecord(101));
        stack.push(new DischargeRecord(102));
        stack.push(new DischargeRecord(103));
        stack.push(new DischargeRecord(104));
        stack.push(new DischargeRecord(105));
        stack.printStack();


        System.out.println("\n---Popping 2 records---");
        stack.pop();
        stack.pop();

        System.out.println("\n---2 record removed. Last Stack: ");
        stack.printStack();*/




}
}

