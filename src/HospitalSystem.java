import java.util.HashMap;
public class HospitalSystem {
    PatientList patientList;

    TreatmentQueue treatmentQueue;

    DischargeStack dischargeStack;

    HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();

        System.out.println("Hospital system created. ");
    }

    public void addNewPatient(Patient p) {
        System.out.println("----Adding New Patient----");
        System.out.println("Adding to patient list...");
        patientList.addPatient(p);

        System.out.println("Adding to HashMap for fast access...");
        patientMap.put(p.id, p);
        System.out.println("Patient added successfully. ID: " + p.id + ", Name: " + p.name);
        System.out.println("----------------------------------------------");
    }

    public Patient findPatientById(int id) {
        System.out.println("Searching for patient with ID: " + id);

        Patient found = patientMap.get(id);
        if (found != null) {
            System.out.println("Patient found: " + found.name);
        } else {
            System.out.println("Patient not found in system!");
        }
        return found;
    }

    public void senToTreatmentQueue(int id) {
        System.out.println("----Sending Patient to Treatment Queue----");

        Patient p = findPatientById(id);

        if (p != null) {
            System.out.println("Adding patient to treatment queue...");
            treatmentQueue.enQueue(p);//
            System.out.println("Patient " + p.id + " added to queue.");
        }
        System.out.println("----------------------------------------");
    }
    public void dischargePatient(){
        System.out.println("----Discharge Patient----");

        System.out.println("Removing from tratment queue...");
        Patient p =treatmentQueue.deQueue();
        if(p!=null){
            System.out.println("Adding to discharge stack...");
            dischargeStack.push(p);//

            System.out.println("Removing from patient list...");
            patientList.removePatient(p.id);

            System.out.println("Removing from HashMap...");
            patientMap.remove(p.id);
            System.out.println("Patient discharged: ID "+p.id);
        }else{
            System.out.println("No patient in queue to discharge! ");
        }
        System.out.println("---------------------------------------");
    }
    public void printAllPatients(){
        System.out.println("----All Patients in System----");
        patientList.printList();
        System.out.println("--------------------------------------");
    }
    public void printTreatmentQueue(){
        System.out.println("----Treatment Queue----");
        treatmentQueue.printQueue();
        System.out.println("-------------------------------------");
    }
    public void printDischargePatients(){
        System.out.println("----Discharged Patients----");
        dischargeStack.printStack();
        System.out.println("------------------------------");
    }
}
