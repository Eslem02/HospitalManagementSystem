public class TreatmentQueue {
    TreatmentRequest front;     // Points to the first element in the queue (first patient)
    TreatmentRequest rear;      // Points to the last element in the queue (last patient)
    int cnt;        //Stores the current number of elements in the queue


    public TreatmentQueue(){        //Constructor:initializes an empty queue
        cnt=0;      //Queue is empty at the beginning
        front=null;     //No first element
        rear=null;      //No last element
    }
    void enQueue(TreatmentRequest request ){
        if(isEmpty()){      //If the queue is empty,the new element becomes both front and rear
            front=rear=request;
        }else{     //If the queue is nıt empty,add the new element to the end
            rear.next=request;
            rear=request;
        }
        cnt++;   //Increase the number of elements

    }

    public TreatmentRequest deQueue(){     //Removes the first treatment request from the queue
        if(isEmpty()){      //If the is emty,there is nothing to remove
            return null;
        }else{      //Remove the front element(FIFO principle)
            TreatmentRequest temp=front;
            front=front.next;
            cnt--;      //Decrease the number of elements
            return temp;
        }

    }
    int realSize(){     //Calculates the actual number of elements by traversing the queue
        int cnt=0;      //Local counter
        TreatmentRequest temp=front;

        while(temp!=null){      //Traverse the queue and count elements
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }

    void printQueue(){      //Prints all elements in the queue from front to rear
        if(isEmpty()){
            System.out.println("There are no patients waiting.");
            return;
        }else{
            TreatmentRequest temp=front;
            System.out.print("front->");
            while (temp!=null){     //Print each patient ID in order
                System.out.print(temp.patientId+" ->");
                temp=temp.next;
            }
            System.out.println("rear");
        }
    }

    boolean isEmpty(){
        return cnt==0;
    }       //Checks whether the queue is empty


}

