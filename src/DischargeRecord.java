public class DischargeRecord {
    int patientId;
    long dischargeTime;
    DischargeRecord next;

    public DischargeRecord(int patientId){
        this.patientId=patientId;
        this.dischargeTime=System.currentTimeMillis();
        this.next=null;


    }
}
