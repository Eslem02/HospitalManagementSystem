public class DischargeStack {
    int cnt;        //Stores the number of elements in the stcak
    DischargeRecord top;        //Points to the top element of the stack

    public DischargeStack(){        //Constructor:initializes an empty stack
        cnt=0;      //Stack is empty at the beginning
        top=null;       //No top element
    }
    void push(DischargeRecord record){     //Adds a new discharge record to the top of the stack
           if(isEmpty()){       //If the stack is empty,the new element becomes the top
               top=record;
           }else{       //If the stack is not empty,place the new element on top
               record.next=top;
               top=record;
           }
           cnt++;       //Increase the number of elements
    }
    void pop(){     //Removes the top element from the stack
        if(isEmpty()){
            System.out.println("Stack is empty.");
        }else{      //Remove the top element(LIFO principle)
            top=top.next;
            cnt--;      //Decrease the number of elements
        }
    }

    void peek(){        //Display the top element without removing it
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Top element: "+top.patientId);
        }
    }
    void printStack(){      //Prints all elements in the stack from top to bottom
        if(isEmpty()){
            System.out.println("There are no patients to show");
        }else{
            DischargeRecord temp=top;
            System.out.println("----Discharged Patients----");

            while(temp!=null){      //Traverse the stack and print each patient ID
                System.out.println(temp.patientId);
                temp=temp.next;
            }
            System.out.println("\n");
        }
    }

    boolean isEmpty(){
        return cnt==0;
    }       //Checks whether the stack is empty
}
