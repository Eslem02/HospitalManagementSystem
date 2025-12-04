import java.lang.reflect.ParameterizedType;

public class PatientList {
    Patient head=null;
    Patient tail=null;
    Patient temp;
    Patient temp2;

    void addPatient(Patient p1){

        if(head==null){
            p1.next=null;
            head=p1;
            tail=p1;
            System.out.println("Patient registration list created");
        }else{
            tail.next=p1;
            tail=p1;
            System.out.println(p1.id+" Patient id enregistered.");
        }
    }
    void removePatient(int id) {
        if (head == null) {
            System.out.println("List is empty, no patient to delete ");
        } else {
            if (id == head.id && head.next == null) {
                head = null;//vb
                tail = null;
            } else if (id == head.id && head.next != null) {
                head = head.next;
                System.out.println(id + " The patient with the ID was deleted");
            } else {
                temp = head;
                temp2 = head;
                while (temp.next != null) {
                    if (id == temp.id) {
                        temp2.next = temp.next;
                        System.out.println(id + "The patiTent with the ID was deleted");
                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if (id == temp.id) {
                    temp2.next = null;
                    tail = temp2;
                    System.out.println(id + " The patiTent with the ID was deleted");
                }
            }
        }
    }
     public boolean findPatient(int id){
        Patient temp=head;
        while(temp!=null){
            if(temp.id==id)
                return true;
            temp=temp.next;
        }
        return false;
     }


    void printList(){
        if(head==null){
            System.out.println("List is empty");
        }else{
           Patient temp=head;
            while(temp!=null){
                System.out.println("\nID: "+temp.id);
                System.out.println("Name :"+ temp.name);
                System.out.println("Severity :"+ temp.severity);
                System.out.println("Age :"+ temp.age);
                System.out.println("***************************");
                temp=temp.next;
            }
        }
    }


}
