public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    TreatmentRequest next;


    public TreatmentRequest(int patientId){
        this.patientId=patientId;
        this.arrivalTime=System.currentTimeMillis();
        this.next=null;
    }
}
