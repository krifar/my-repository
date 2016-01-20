import java.util.HashSet;
import java.util.Iterator;

public class Q7 {
    public static void main(String[] args) {
        HashSet<Integer> data = new HashSet<Integer>();
        data.add(new Integer(1));
        data.add(new Integer(13));
        data.add(new Integer(2));
        data.add(new Integer(3));
        Iterator itr = data.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
    }
}
