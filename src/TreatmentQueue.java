public class TreatmentQueue {
    TreatmentRequest front;
    TreatmentRequest rear;
    int cnt;
    int size;

    public TreatmentQueue(){
        cnt=0;
        front=null;
        rear=null;
    }
    void enQueue(TreatmentRequest request ){
        if(isEmpty()){
            front=rear=request;
            System.out.println("The queue was created and the first patient arrived. ");
        }else{
            rear.next=request;
            rear=request;
            System.out.println(rear.patientId+" got in line.");
        }
        cnt++;

    }


    void deQueue(){
        if(isEmpty()){
            System.out.println("There is no one to take out of the queue");
        }else{
            System.out.println(front.patientId+ " Treatment request was met");
            front=front.next;
            cnt--;
        }
    }
    int realSize(){
        int cnt=0;
        TreatmentRequest temp=front;

        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }

    void printQueue(){
        if(isEmpty()){
            System.out.println("There are no patients waiting.");
        }else{
            TreatmentRequest temp=front;
            System.out.print("front->");
            while (temp!=null){
                System.out.print(temp.patientId+" ->");
                temp=temp.next;
            }
            System.out.println("rear");
        }
    }

    boolean isEmpty(){
        return cnt==0;
    }

    boolean isFull(){
        return cnt==size;
    }

}

