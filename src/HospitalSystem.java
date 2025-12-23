import java.util.HashMap;
public class HospitalSystem {
    PatientList patientList;        //Linked list that stores all registered patients

    TreatmentQueue treatmentQueue;      //Queue that manages treatment order

    DischargeStack dischargeStack;      //Stack that stores discharged patients

    HashMap<Integer, Patient> patientMap;       //HashMap used for fast patient lookup by ID

    public HospitalSystem() {       //Constructor:initializes all system components
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();

        System.out.println("Hospital system created. ");
    }

    public void addNewPatient(Patient p) {      //Adds a new patient to the system
        System.out.println("----Adding New Patient----");
        System.out.println("Adding to patient list...");        //Add patient to the linked list
        patientList.addPatient(p);

        System.out.println("Adding to HashMap for fast access...");     //Add patient to HahMap for quick searching
        patientMap.put(p.id, p);
        System.out.println("Patient added successfully. ID: " + p.id + ", Name: " + p.name);
        System.out.println("----------------------------------------------");
    }

    public Patient findPatientById(int id) {        //Search for a patient using their unique ID
        System.out.println("Searching for patient with ID: " + id);

        Patient found = patientMap.get(id);     //HashMap provides O(1) average-time lookup
        if (found != null) {
            System.out.println("Patient found: " + found.name);
        } else {
            System.out.println("Patient not found in system!");
        }
        return found;
    }

    public void sendToTreatmentQueue(int id) {       //Sends a patient to the treatment queue
        System.out.println("----Sending Patient to Treatment Queue----");

        Patient p = findPatientById(id);        //First,locate the patient by ID

        if (p != null) {        //Create a TreatmentRequest and add it to the queue
            System.out.println("Adding patient to treatment queue...");
            treatmentQueue.enQueue(new TreatmentRequest(p.id, p.name));
            System.out.println("Patient " + p.id + " added to queue.");
        }
        System.out.println("----------------------------------------");
    }
    public void dischargePatient(){     //Discharges the next patient in the treatment queue
        System.out.println("----Discharge Patient----");

        System.out.println("Removing from treatment queue...");     //Remove a patient from the treatment queue
        Patient p =treatmentQueue.deQueue();        //Should return a Patient object
        if(p!=null){
            System.out.println("Adding to discharge stack...");     //Add to discharge stack
            dischargeStack.push(new DischargeRecord(p.id));//

            System.out.println("Removing from patient list...");        //Remove patient from the linked list
            patientList.removePatient(p.id);

            System.out.println("Removing from HashMap...");     //Remove from HashMap as well
            patientMap.remove(p.id);
            System.out.println("Patient discharged: ID "+p.id);
        }else{
            System.out.println("No patient in queue to discharge! ");
        }
        System.out.println("---------------------------------------");
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
    public void printDischargePatients(){       //Displays all discharged patients stored in the stack
        System.out.println("----Discharged Patients----");
        dischargeStack.printStack();
        System.out.println("------------------------------");
    }
}
// SİLLLLLSİSLLLSLSL