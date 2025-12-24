import java.util.HashMap;
public class HospitalSystem {
    public PatientList patientList;        //Linked list that stores all registered patients
    public TreatmentQueue treatmentQueue;       //Queue that manages treatment order
    public PriorityTreatmentQueue priorityQueue;
    public DischargeStack dischargeStack;      //Stack that stores discharged patients
    public HashMap<Integer, Patient> patientMap;       //HashMap used for fast patient lookup by ID

    public HospitalSystem() {       //Constructor:initializes all system components
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        priorityQueue=new PriorityTreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();

        System.out.println("Hospital system created. ");
    }

    public void addNewPatient(Patient p) {      //Adds a new patient to the system

        patientList.addPatient(p);
        patientMap.put(p.id, p);
        System.out.println("Patient added: " + p.id + ", Name: " + p.name);
        System.out.println("----------------------------------------------");
    }

    public Patient findPatientById(int id) {        //Search for a patient using their unique ID

        Patient found = patientMap.get(id);     //HashMap provides O(1) average-time lookup
        if (found != null) {
            System.out.println("Patient found: " + found.name);
        } else {
            System.out.println("Patient not found in system!");
        }
        return found;
    }
    public void sendToTreatmentQueue(int id) {       //Finds the patient by ID an adds a new TreatmentRequest to the normal treatment queue.
        Patient p = findPatientById(id);        //First,locate the patient by ID
        if (p != null) {        //Create a TreatmentRequest and add it to the queue
            treatmentQueue.enQueue(new TreatmentRequest(p.id,"temp",true));     //Creates a temporary TreatmentRequest and enqueues it(severity is set to true)
        }
        System.out.println("----------------------------------------");
    }
    public int dischargePatient(){     //Discharges the next patient from the PRIORITY treatment queue

        if(priorityQueue.isEmpty()) {
            System.out.println("No patient to discharge.");
            return -1;
        }
        TreatmentRequest request=priorityQueue.deQueue();
        int id=request.patientId;

        Patient p=patientMap.get(id);
        if(p==null) {
            System.out.println("Patient not found in system : " + request.patientId);;
            return -1;
        }

        dischargeStack.push(new DischargeRecord(id));       //Adds a discharge record to the stack (for history tracking)

        patientList.removePatient(id);      //Removes patient from the linked list and HashMap to keep the system clean
        patientMap.remove(id);

        System.out.println("Discharged: "+ id);
        return id;
    }

    public void printAllPatients(){     //Displays all patients currently registered in the system
        System.out.println("----All Patients in System----");
        patientList.printList();
        System.out.println("--------------------------------------");
    }
    public void printTreatmentQueue(){      //Displays treatment queue
        System.out.println("----Treatment Queue----");
        treatmentQueue.printQueue();
        System.out.println("-------------------------------------");
    }
    public void printPriorityQueue(){
        System.out.println("----Priority Queue----");
        priorityQueue.printQueue();
        System.out.println("----------------------------");
    }
    public void printDischargePatients(){       //Displays all discharged patients stored in the stack
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
