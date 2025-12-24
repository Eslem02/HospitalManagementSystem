public class TestHospitalSystem {
    public static void main(String[] args){
        HospitalSystem hs=new HospitalSystem();

        System.out.println("\n====Adding 10 Patients====");

        hs.addNewPatient(new Patient(1,"Mirhan",1,7));
        hs.addNewPatient(new Patient(2,"Alim Efe",2,4));
        hs.addNewPatient(new Patient(3,"Kerem",3,9));
        hs.addNewPatient(new Patient(4,"Adem",4,3));
        hs.addNewPatient(new Patient(5,"Hamza Selim",5,15));
        hs.addNewPatient(new Patient(6,"Yiğit Ali",6,20));
        hs.addNewPatient(new Patient(7,"Furkan",7,18));
        hs.addNewPatient(new Patient(8,"Umut",8,24));
        hs.addNewPatient(new Patient(9,"Hatice",9,42));
        hs.addNewPatient(new Patient(10,"Yavuz",10,35));

        System.out.println("\n====Adding 5 Normal & 3 Priority Request===");

        hs.priorityQueue.addRequest(new TreatmentRequest(1,"Mirhan",false));
        hs.priorityQueue.addRequest(new TreatmentRequest(2,"Alim Efe",false));
        hs.priorityQueue.addRequest(new TreatmentRequest(4,"Adem",false));
        hs.priorityQueue.addRequest(new TreatmentRequest(6,"Yiğit Ali",false));
        hs.priorityQueue.addRequest(new TreatmentRequest(10,"Yavuz",false));

        hs.priorityQueue.addRequest(new TreatmentRequest(3,"Kerem",true));
        hs.priorityQueue.addRequest(new TreatmentRequest(5,"Hamza Selim",true));
        hs.priorityQueue.addRequest(new TreatmentRequest(9,"Hatice",true));




        System.out.println("\n===Processing 4 Treatment Request(Priority first)===");
        hs.dischargePatient();
        hs.dischargePatient();
        hs.dischargePatient();
        hs.dischargePatient();

        System.out.println("\n===Final System State===");

        System.out.println("\n---Remaining Patients in System---");
        hs.printAllPatients();

        System.out.println("\n---Remaining Treatment Queues---");
        hs.printPriorityQueue();

        System.out.println("\n ===Sorting Patients by Severity(High->Low)===");
        hs.patientList.sortBySeverity();
        hs.printAllPatients();


    }
}
