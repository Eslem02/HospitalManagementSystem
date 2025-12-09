public class DischargeStack {
    int cnt;
    DischargeRecord top;

    public DischargeStack(){
        cnt=0;
        top=null;
    }
    void push(DischargeRecord patient){
           if(isEmpty()){
               top=patient;
               System.out.println(top.patientId+ " First patient added to stack");
           }else{
               patient.next=top;
               top=patient;
               System.out.println(top.patientId+" Patient added");
           }
           cnt++;
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
        }else{
            System.out.println(top.patientId+" removed");
            top=top.next;
            cnt--;
        }
    }

    void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Top element: "+top.patientId);
        }
    }
    void printStack(){
        if(isEmpty()){
            System.out.println("There are no patients to show");
        }else{
            DischargeRecord temp=top;
            System.out.println("Patients on the stack \n");

            while(temp!=null){
                System.out.println(temp.patientId);
                temp=temp.next;
            }
            System.out.println("\n");
        }
    }

    boolean isEmpty(){
        return cnt==0;
    }
}
