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

        hs.addTreatmentRequest(1,"Mirhan",false);
        hs.addTreatmentRequest(2,"Alim efe",false);
        hs.addTreatmentRequest(4,"Adem",false);
        hs.addTreatmentRequest(6,"Yiğit Ali",false);
        hs.addTreatmentRequest(8,"Umut",false);
        hs.addTreatmentRequest(3,"Kerem",true);
        hs.addTreatmentRequest(5,"Hamza Selim",true);
        hs.addTreatmentRequest(9,"Hatice",true);

        hs.addDischargeRecord(100);
        hs.addDischargeRecord(200);

        System.out.println("\n===Processing 4 Treatment Request(Priority first)===");
        hs.processTreatmentRequest();
        hs.processTreatmentRequest();
        hs.processTreatmentRequest();
        hs.processTreatmentRequest();

        hs.sortPatientBySeverity();


        System.out.println("\n===Final System State===");
        hs.printAllPatients();
        hs.printPriorityQueue();
        hs.printDischargePatients();


    }
}
