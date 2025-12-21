
public class PatientList {
    Patient head=null;  //First node of linked list
    Patient tail=null;  //Last node of linked list
    Patient temp;       //Used as current node
    Patient temp2;      //Used as previous node

    void addPatient(Patient p1){    //Adds a new patient to the end of the list

        if(head==null){   //If list is empty,new patient becomes head and tail
            p1.next=null;
            head=p1;
            tail=p1;
            System.out.println("Patient registration list created "+","+ p1.id + " Patient id enregistered.");
        }else{     //Add patient to the end using tail reference
            tail.next=p1;
            tail=p1;
            System.out.println(p1.id+" Patient id enregistered.");
        }
    }
    void removePatient(int id) {     //Removes a patient from the list by ID
        if (head == null) {   //List is empty
            System.out.println("List is empty, no patient to delete ");
        } else {
            if (id == head.id && head.next == null) {   //Only one node in the list
                head = null;
                tail = null;
            } else if (id == head.id && head.next != null) {   // More than one node,move head forward
                head = head.next;
                System.out.println(id + " The patient with the ID was deleted");
            } else {    //Deleting from middle or tail
                temp2 = head;   //previous node
                temp = head.next;  //current node
                while (temp.next != null) {
                    if (id == temp.id) {   //Remove current node
                        temp2.next = temp.next;
                        System.out.println(id +" The patient with the ID was deleted");
                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if (id == temp.id) {
                    temp2.next = null;
                    tail = temp2;
                    System.out.println(id + " The patient with the ID was deleted");
                }
            }
        }
    }
     public boolean findPatient(int id){  //Searches for patient by ID
        Patient temp=head;
        while(temp!=null){
            if(temp.id==id)
                return true;
            temp=temp.next;
        }
        return false;
     }


    void printList(){    //Prints all patients in the list
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
