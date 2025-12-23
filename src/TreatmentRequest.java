public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    TreatmentRequest next;
    boolean priority;


    public TreatmentRequest(int patientId, String name){
        this.patientId=patientId;
        this.arrivalTime=System.currentTimeMillis();
        this.priority=priority;
        this.next=null;
    }
}
