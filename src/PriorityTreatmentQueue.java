public class PriorityTreatmentQueue {
    TreatmentQueue priorityQueue;       //Queue for priority patients
    TreatmentQueue normalQueue;     //Queue for normal patients

    public PriorityTreatmentQueue(){        //Initializes two separate queues: priority and normal
        priorityQueue=new TreatmentQueue();
        normalQueue=new TreatmentQueue();

    }
    public void enqueue(TreatmentRequest request){
        if(request.priority){
            System.out.println("Priority patient added: "+request.patientId);
            priorityQueue.enQueue(request);
        }else{
            normalQueue.enQueue(request);
            System.out.println("Normal patient added: "+request.patientId);
        }
    }
    public TreatmentRequest dequeue(){         //Adds a new request to the correct queue based on its priority value
       if(!priorityQueue.isEmpty()){
           return priorityQueue.deQueue();
       }
       if(!normalQueue.isEmpty()){
           return normalQueue.deQueue();
       }
       System.out.println("All queues empty.");
       return null;
    }
    public void printQueues() {
        System.out.println("\n----Priority Queue----");
        priorityQueue.printQueue();

        System.out.println("\n----Normal Queue----");
        normalQueue.printQueue();
    }
    public int size(){
        return priorityQueue.realSize()+normalQueue.realSize();
    }
    public boolean isEmpty(){
        return priorityQueue.isEmpty()&& normalQueue.isEmpty();
    }


    }

