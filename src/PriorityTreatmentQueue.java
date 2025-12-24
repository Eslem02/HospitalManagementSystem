public class PriorityTreatmentQueue {
    TreatmentQueue priorityQueue;       //Queue for priority patients
    TreatmentQueue normalQueue;     //Queue for normal patients

    public PriorityTreatmentQueue(){        //Create both queues
        priorityQueue=new TreatmentQueue();
        normalQueue=new TreatmentQueue();
    }
    public void addRequest(TreatmentRequest r){         //Adds a new request to the correct queue based on its priority value
        TreatmentRequest copy= new TreatmentRequest(r.patientId,r.name,r.priority);
        if(r.priority){
            priorityQueue.enQueue(copy);
        }else{
            normalQueue.enQueue(copy);
        }
    }                                       //Priority queue is always checked first
    public TreatmentRequest getNext(){      //Returns the next patient to be treated
        if(priorityQueue.realSize()>0){
            return priorityQueue.deQueue();     //Take from priority queue
        }else{
            return normalQueue.deQueue();       //If empty,take from normal queue
        }
    }
    public boolean isEmpty(){
        return priorityQueue.realSize()==0 && normalQueue.realSize()==0;
    }
    public TreatmentRequest deQueue(){
        return getNext();
    }
    public void printQueue(){
        printAll();
    }
    public int totalSize(){     //Prints both queues for debugging and visualization
        return priorityQueue.realSize()+normalQueue.realSize();
    }
    public void printAll(){
        System.out.println("---Priority Queue---");
        if(priorityQueue.realSize()==0){
            System.out.println("There are no prioritypatients.");
        }else {
            priorityQueue.printQueue();
        }

        System.out.println("---Normal Queue---");
        if(normalQueue.realSize()==0){
            System.out.println("There are no normal patients");
        }else {
            normalQueue.printQueue();
        }
    }
}
