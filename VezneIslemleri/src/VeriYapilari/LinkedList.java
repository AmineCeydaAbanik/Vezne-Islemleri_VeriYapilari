
package VeriYapilari;

/**
  Amine Ceyda ABANİK
 * 1721221024
 * VERİ YAPILARI ÖDEV 1
 */
public class LinkedList {
    Node head;
    static LinkedList liste =new LinkedList();
    static LinkedList listetemp =new LinkedList();
    void AddLast(Musteri data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.nextNode!=null){
                temp=temp.nextNode;
            }
            temp.nextNode=newNode;
                
        } 
    }
    void AddFirst(Musteri data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.nextNode=head;
            head=newNode;        
        }

        
    }
    void RemoveFirst(){
        if(head==null){
            System.out.println("Listede eleman yok!");
            
        }else{
            System.out.println(head.data+" silindi");
            head=head.nextNode;
        }
        
    }
    void RemoveLast(){
        if(head==null){
            System.out.println("Listede eleman yok!");
        }else{
            Node temp=head;
            while(temp.nextNode!=null){
                temp=temp.nextNode;
            }
            System.out.println(temp.data+"silindi");
            temp=null;
        }
        
    }
    void Remove(Musteri data){
        if(head==null){
            System.out.println("Listede eleman yok!");
        }
        else if(head.data==data) {
            RemoveFirst();
        }else{
            Node temp=head;
            while(temp.nextNode==null && temp.nextNode.data!=data){
               temp=temp.nextNode; 
            }
            if(temp.nextNode!=null && temp.data==data){
                temp.nextNode=temp.nextNode.nextNode;
            }else if (temp.nextNode==null && temp.data==data){
                RemoveLast();
            }
            
        }
        
    }
    void insertAfter(Musteri data,Musteri search){
        Node temp=head;
        while(temp!=null && temp.data!=search){
            temp=temp.nextNode;
        }
        if(temp!=null){
            Node newNode=new Node(data);
            newNode.nextNode=temp.nextNode;
            temp.nextNode=newNode;
            
        }else{
            AddLast(data);
        }
        
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.nextNode;
        }
        System.out.println("null"); 
    }
    int getSize(){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.nextNode;
            size++;
        }
        
        
        return size;
    }
}
