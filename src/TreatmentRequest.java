public class TreatmentRequest {
    int patientId;
    String name;
    long arrivalTime;
    boolean priority;
    TreatmentRequest next;



    public TreatmentRequest(int patientId,long arrivalTime){
        this.patientId=patientId;
        this.arrivalTime=System.currentTimeMillis();


    }
    public  TreatmentRequest(int patientId,String name,boolean priority){
        this.patientId=patientId;
        this.name=name;
        this.priority=priority;
        this.next=null;
    }
    public String toString(){
        return "Request ID: " +patientId;
    }


}
