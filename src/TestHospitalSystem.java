public class TestHospitalSystem {
    public static void main(String[] args){
        HospitalSystem hs=new HospitalSystem();

        System.out.println("\n====Adding Patients====");

        hs.addNewPatient(new Patient(8,"Mirhan",6,7));
        hs.addNewPatient(new Patient(10,"Alim Efe",2,4));
        hs.addNewPatient(new Patient(9,"Kerem",5,9));
        hs.addNewPatient(new Patient(6,"Adem",7,3));

        hs.printAllPatients();

        System.out.println("\n====Find Patient By ID");

        hs.sendToTreatmentQueue(2);
        hs.sendToTreatmentQueue(8);

        hs.printTreatmentQueue();

        System.out.println("\n====Discharge Patient====");
        hs.dischargePatient();

        hs.printDischargePatients();

        System.out.println("\n=====Print All Patients After Discharge====");
        hs.printAllPatients();
    }

}
