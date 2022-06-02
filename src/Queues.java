import java.util.PriorityQueue;
import java.util.List;
import java.util.Queue;
import java.util.Iterator;
public class Queues {
    public void demonsQueue(){
        Queue<Integer> strQue = new PriorityQueue<>();
        System.out.println(strQue.isEmpty());
        strQue.add(100);
        System.out.println(strQue.isEmpty());
        strQue.add(200);
        strQue.add(300);
        strQue.add(400);
        strQue.add(400);
        Iterator<Integer> itrInteger = strQue.iterator();
        while(itrInteger.hasNext()){
            System.out.println(itrInteger.next());
        }

        System.out.println(strQue);
        System.out.println(strQue.poll());
//strQue.poll(); //

        strQue.remove();

// To print the elements of the queue
        Iterator<Integer> itrInteger1 = strQue.iterator();
        while(itrInteger1.hasNext()){
            System.out.println(itrInteger1.next());
        }
    }

    public static void main(String[] args) {
        Queues qDemons = new Queues();
        qDemons.demonsQueue();
    }
}
