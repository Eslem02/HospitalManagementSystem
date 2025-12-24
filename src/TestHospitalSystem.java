public class TestHospitalSystem {
    public static void main(String[] args){
        HospitalSystem hs=new HospitalSystem();

        System.out.println("\n====Adding 10 Patients====");

        hs.addNewPatient(new Patient(10,"Mirhan",6,7));
        hs.addNewPatient(new Patient(9,"Alim Efe",2,4));
        hs.addNewPatient(new Patient(8,"Kerem",5,9));
        hs.addNewPatient(new Patient(7,"Adem",7,3));
        hs.addNewPatient(new Patient(6,"Hamza Selim",1,15));
        hs.addNewPatient(new Patient(5,"Yiğit Ali",3,20));
        hs.addNewPatient(new Patient(4,"Furkan",2,18));
        hs.addNewPatient(new Patient(3,"Umut",4,24));
        hs.addNewPatient(new Patient(2,"Hatice",6,42));
        hs.addNewPatient(new Patient(1,"Yavuz",7,35));

        System.out.println("\n===Sorting Patients By Severity Before Queueing===");
        hs.sortPatientBySeverity();


        System.out.println("\n====Adding 5 Normal & 3 Priority Request===");

        hs.priorityQueue.addRequest(new TreatmentRequest(10,"Mirhan",false));
        hs.priorityQueue.addRequest(new TreatmentRequest(8,"Kerem",false));
        hs.priorityQueue.addRequest(new TreatmentRequest(6,"Hamza Selim",false));
        hs.priorityQueue.addRequest(new TreatmentRequest(4,"Furkan",false));
        hs.priorityQueue.addRequest(new TreatmentRequest(2,"Hatice",false));

        hs.priorityQueue.addRequest(new TreatmentRequest(9,"Alim Efe",true));
        hs.priorityQueue.addRequest(new TreatmentRequest(7,"Adem",true));
        hs.priorityQueue.addRequest(new TreatmentRequest(5,"Yiğit Ali",true));

        System.out.println("\n===Print Queues Before Processing===");
        hs.priorityQueue.printQueue();

        System.out.println("\n===Processing 4 Treatment Request(Priority first)===");
        hs.dischargePatient();
        hs.dischargePatient();
        hs.dischargePatient();
        hs.dischargePatient();

        System.out.println("\n===Print Discharged Stack===");
        hs.printDischargePatients();


        System.out.println("\n=====Print Remaining Patient List====");
        hs.printAllPatients();

        System.out.println("\n===Print Remaining Request Queues===");
        hs.printAllPatients();

    }

}
