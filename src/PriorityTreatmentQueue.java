public class PriorityTreatmentQueue {
    TreatmentQueue priorityQueue;
    TreatmentQueue normalQueue;

    public PriorityTreatmentQueue(){
        priorityQueue=new TreatmentQueue();
        normalQueue=new TreatmentQueue();
    }
    public void addRequest(TreatmentRequest r){
        if(r.priority==true){
            priorityQueue.enQueue(r);
            System.out.println("Priority added: "+r.patientId);
        }else{
            normalQueue.enQueue(r);
            System.out.println("Normal added: "+r.patientId);
        }
    }
    public TreatmentRequest getNext(){
        if(priorityQueue.realSize()>0){
            return priorityQueue.deQueue();
        }else{
            return normalQueue.deQueue();
        }
    }
    public int totalSize(){
        return priorityQueue.realSize()+normalQueue.realSize();
    }
    public void pritnAll(){
        System.out.println("---Priority Queue---");
        priorityQueue.printQueue();

        System.out.println("---Normal Queue---");
        normalQueue.printQueue();
    }


}
