import java.util.HashMap;
public class HospitalSystem {
    public PatientList patientList;        //Linked list that stores all registered patients
    public PriorityTreatmentQueue priorityQueue;        //Priority-based treatment queue(contains both priority and normal queues)
    public DischargeStack dischargeStack;      //Stack that stores discharged patients(LIFO)
    public HashMap<Integer, Patient> patientMap;       //HashMap used for fast patient lookup by ID

    public HospitalSystem() {       //Constructor:initializes all system components
        patientList = new PatientList();
        priorityQueue=new PriorityTreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();

        System.out.println("Hospital system created. ");
    }
    public void addNewPatient(Patient p) {      //Adds a new patient to the system

        patientList.addPatient(p);      //Add patient to the Linked List
        patientMap.put(p.id, p);        //Add patient to the HashMap for fast searching
        System.out.println("Patient added: " + p.id + ", Name: " + p.name);
        System.out.println("----------------------------------------------");
    }
    public void addTreatmentRequest(int patientId,String name,boolean priority){        //Adds a new treatment request to the priority-based queue
        TreatmentRequest req=new TreatmentRequest(patientId,name,priority);
        priorityQueue.enqueue(req);
    }
    public void processTreatmentRequest(){
        TreatmentRequest req=priorityQueue.dequeue();

        if(req==null){
            System.out.println("No treatment requests avaliable.\n");
            return;
        }
        System.out.println("Processing treatment for patient: "+req.patientId);
        dischargeStack.push(new DischargeRecord(req.patientId));
        System.out.println("Discharge record added for: "+req.patientId+"\n");
    }
    public void addDischargeRecord(int patientId){      //Manually adds a discharge record(for testing purposes)
        dischargeStack.push(new DischargeRecord(patientId));
        System.out.println("Manual discharge added for "+patientId+"\n");
    }



    public void printAllPatients(){     //Print all patients stored in the LinkedList
        System.out.println("----All Patients in System----");
        patientList.printList();
        System.out.println("--------------------------------------");
    }
    public void printTreatmentQueue(){      //Prints both priority and normal treatment queues
        System.out.println("----Treatment Queue----");
        priorityQueue.printQueues();
        System.out.println("-------------------------------------");
    }
    public void printPriorityQueue(){       //Prints only the priority queue structure
        System.out.println("----Priority Queue----");
        priorityQueue.printQueues();
        System.out.println("----------------------------");
    }
    public void printDischargePatients(){       //Prints all discharged patients stored in the stack
        System.out.println("----Discharged Patients----");
        dischargeStack.printStack();
        System.out.println("------------------------------");
    }
    public void sortPatientBySeverity(){
        System.out.println("-----Sorting Patients----");        //Sorts patients in the linked list by severity level(higher severity first)
        patientList.sortBySeverity();
        System.out.println("------------------------------");
    }
}
