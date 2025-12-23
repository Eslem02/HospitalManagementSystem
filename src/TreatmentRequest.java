public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    TreatmentRequest next;



    public TreatmentRequest(int patientId, String name){
        this.patientId=patientId;
        this.arrivalTime=System.currentTimeMillis();
        this.next=null;
    }
}
