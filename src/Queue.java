import java.util.stream.IntStream;

public class Queue {
    int queue[] = new int[7];
    int lngth=queue.length;
    int size=0;
    int rear;
    int front;
    int dqVal;
    int ptr;
    //Constructor
    public Queue() {
        this.rear=(this.lngth-1)%this.lngth;
        this.front=rear;
    }
    //Methods
    public boolean isEmpty(){ return size==0; }
    public boolean isFull(){ return size == lngth; }
    public void enQueue(int data){
        if(!isFull()) {
            size++; front = (lngth - size)%lngth;
            if (queue[1] != 0) for (int i = 1; i <= rear; i++) queue[(i - 1)] = queue[i];
            else for (int i = front; i <= rear; i++) queue[(i - 1)] = queue[i];
            queue[rear] = data;
        }
        else{ System.out.println("Queue is Full"); }
    }
    public int deQueue() {
        if(!isEmpty()){ size--; dqVal = queue[(front)]; queue[(front)] = 0; front = (lngth-size)%lngth; return dqVal; }
        else{ System.out.println("Queue is Empty"); front=rear; return 0; }
    }
    public void show(){
        IntStream.rangeClosed(front, rear).mapToObj(i -> queue[i] + " ").forEach(System.out::print); System.out.println();//new line
        for(int n: queue) System.out.print(n + " "); System.out.println();//new line
    }
    //Getters
    public int getSize(){ return size; }
    public int getRear(){ return rear; }
    public int getFront(){ return front; }
    public int getDqVal(){ return dqVal;}

}

        /*for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }*/
        /*int i=front;
        while (i<=rear) {
            System.out.print(queue[i]+" ");
            i++;
        }*/
        /*int i=front;
        if (i <= rear) {
            do {
                System.out.print(queue[i] + " ");
                i++;
            } while (i <= rear);
        }*/

/*in the main put this
Queue queue = new Queue();
        queue.enQueue(5);
        queue.enQueue(4);
        queue.enQueue(3);
        queue.enQueue(2);
        queue.enQueue(1);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();queue.deQueue();

        queue.show();
        System.out.println( "IsEmpty: "+queue.isEmpty() ); System.out.println( "IsFull: "+queue.isFull() );
        System.out.println("Front: "+queue.getFront()); System.out.println("Rear: "+queue.getRear());
        System.out.println("Size: "+queue.getSize()); System.out.println("Value of deQueue: "+queue.getDqVal());
        */

