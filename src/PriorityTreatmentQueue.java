public class PriorityTreatmentQueue {
    TreatmentQueue priorityQueue;       //Queue for priority patients
    TreatmentQueue normalQueue;     //Queue for normal patients

    public PriorityTreatmentQueue(){        //Initializes two separate queues: priority and normal
        priorityQueue=new TreatmentQueue();
        normalQueue=new TreatmentQueue();

    }
    public void enqueue(TreatmentRequest request){      //Adds a new treatment request to the correct queue
        if(request.priority){
            System.out.println("Priority patient added: "+request.patientId);
            priorityQueue.enQueue(request);     //Priority patients maintain FIFO inside their group
        }else{
            normalQueue.enQueue(request);       //Normal patients also maintain FIFO
            System.out.println("Normal patient added: "+request.patientId);
        }
    }
    public TreatmentRequest dequeue(){      //Removes the next patient for treatment
       if(!priorityQueue.isEmpty()){        //Priority patients always come first
           return priorityQueue.deQueue();
       }
       if(!normalQueue.isEmpty()){
           return normalQueue.deQueue();        //If no priority patients,treat normal patients
       }
       System.out.println("All queues empty.");     //No patients left in the system
       return null;
    }
    public void printQueues() {     //Prints both the priority and normal queues
        System.out.println("\n----Priority Queue----");
        priorityQueue.printQueue();

        System.out.println("\n----Normal Queue----");
        normalQueue.printQueue();
    }
    public int size(){      //Returns the total number of waiting patients
        return priorityQueue.realSize()+normalQueue.realSize();
    }
    public boolean isEmpty(){       //Checks whether both queues are empty
        return priorityQueue.isEmpty()&& normalQueue.isEmpty();
    }


    }

