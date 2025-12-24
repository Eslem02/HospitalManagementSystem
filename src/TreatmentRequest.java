public class TreatmentRequest {
    int patientId;
    String name;
    long arrivalTime;
    boolean priority;
    TreatmentRequest next;



    public TreatmentRequest(int patientId,String name,boolean priority){
        this.patientId=patientId;
        this.name=name;
        this.arrivalTime=System.currentTimeMillis();
        this.priority=priority;
        this.next=null;

    }


}
