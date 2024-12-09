public class PhoneList {
    private ContactNode head;

    public PhoneList() {
         head = null;
    }

        // addContact Method
    public void addContact(String Name, String PhoneNumber ){

        ContactNode newNode = new ContactNode(Name,PhoneNumber,null);
        // if linked list is empty
        if(head==null){
            head=newNode;
            System.out.println("Contact added : " + head.Name+ ", " + head.PhoneNumber);
        }else{
            ContactNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            System.out.println("Contact added : " + current.next.Name+ ", " + current.next.PhoneNumber);
        }
    }

        // deleteContact Method
        // deleteContact Method
        public void deleteContact(String Name){
            // if linked list is empty
            if (head == null) {
                System.out.println("Contact list is empty.");
                return;
            }
            // if linked list has one node
            if (head.Name.equals(Name)) {
                System.out.println("Deleting Contact: " + head.Name + ", " + head.PhoneNumber);
                head = head.next; // Update head to the next node
                return;
            }
            // if linked ist has more node
            ContactNode current = head.next;
            ContactNode temp = head;
            while(current != null && !current.Name.equals(Name)){
                temp = current;  // Move temp to current node
                current = current.next;  // Move current to the next node
            }
            if(current==null) System.out.println("Contact with name " + Name + "not found");
            else{   // current !=null and the name is found
                temp.next=current.next;
                System.out.println("Deleting Contact : " + current.Name+ ", " + current.PhoneNumber);
            }
        }




    // displayList method
    public void displayList(){
        
        ContactNode current=head;
        if(current==null) {
            System.out.println("Phone List is empty ");
            return;
        }
        System.out.println("these are all contacts");
        while(current!=null){
            System.out.println("Name: " + current.Name +", Phone: "+ current.PhoneNumber);
            current=current.next;
        }

    }

      // searchContact method
    public void searchContact(String Name){

        ContactNode current=head;
        while(current!=null){
            if(current.Name.equals(Name)){
                System.out.println("Contact found: Name: " + current.Name +", Phone: "+ current.PhoneNumber);
               return;
            }
            current=current.next;
        }
       System.out.println("Contact with name " + Name + " not found");
    }

}
