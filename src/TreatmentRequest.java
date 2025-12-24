public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean priority;
    TreatmentRequest next;



    public TreatmentRequest(int patientId, String name,boolean priority){
        this.patientId=patientId;
        this.arrivalTime=System.currentTimeMillis();
        this.priority=priority;
        this.next=null;
    }
}
