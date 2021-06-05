
package VeriYapilari;

/**
 Amine Ceyda ABANİK
 * 1721221024
 * VERİ YAPILARI ÖDEV 1
 */
public class Queue <T> {
    private Musteri[] Queque;
    private  int  front=-1;
    
    private int size=0;
    private int count=0;
    public Queue(int size){
    this.size=size;
    Queque=new Musteri[size];
}
    public void insert(Musteri obje){
        if(count==size)
            System.out.println("Queque is full");
  
        if(isEmpty()){
            front++;
            Queque[front]=obje;
        }else{
            int i;
            
            for ( i =count-1; i >= 0; i--) {
                if(obje.oncelik>Queque[i].oncelik){
                    Queque[i+1]=Queque[i];
                }else
                    break;
            }
            Queque[i+1]=obje;
            front++;
        }
        count++;
    }
    public boolean isEmpty(){
        return (count==0);
    }
            
    public Object Remove(){
        if(this.isEmpty()){
            System.out.println("Liste boş");
        }
        Musteri temp =Queque[front];
        Queque[front]=null;
        front--;
        count--;
        return temp;
        
        
        
    }
    public String printQueque(){
        String a="";
        if(isEmpty()){
            System.out.println("Liste boş");
        }else{
              int i;
               Musteri obje=Queque[count-1];
            for ( i =count-1; i >= 0; i--) {
                     
                    
                    
                     obje=Queque[i];
                      a+=obje.isim+"\n";
           
            }
             a+="null";    
                 
        }
        return a;
    }

    public String getQueque(int data){
      Musteri obje=Queque[data];
      String a="";
      a+=("İsim: "+ obje.isim + " ,Öncelik: " + obje.oncelik + " ,İslem Süresi: " +obje.islemSuresi+"ms");
     
        return a;
    }
     public Musteri getData(int data){
      Musteri obje=Queque[data];
      
        return obje;
    }

public int getCount() {
        return count;
    }



    
}
