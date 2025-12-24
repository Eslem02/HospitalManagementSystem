public class PriorityTreatmentQueue {
    TreatmentQueue priorityQueue;       //Queue for priority patients
    TreatmentQueue normalQueue;     //Queue for normal patients

    public PriorityTreatmentQueue(){        //Create both queues
        priorityQueue=new TreatmentQueue();
        normalQueue=new TreatmentQueue();
    }
    public void addRequest(TreatmentRequest r){     //Adds a new request to the correct queue based on its priority value
        if(r.priority){
            priorityQueue.enQueue(r);
            System.out.println("Priority added: "+r.patientId);
        }else{
            normalQueue.enQueue(r);
            System.out.println("Normal added: "+r.patientId);
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
        priorityQueue.printQueue();

        System.out.println("---Normal Queue---");
        normalQueue.printQueue();
    }
}
