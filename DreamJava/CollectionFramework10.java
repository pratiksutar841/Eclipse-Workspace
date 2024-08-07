
package DreamJava;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionFramework10
{
    public static void main(String[] args)
    {
        List<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        System.out.println(c);
        c.remove(2);
        System.out.println(c);
        int d = c.get(2);
        System.out.println(d);
        c.clear();
        System.out.println(c);
        c.set(1,90);
        boolean f=c.contains(100);
        System.out.println(c);
        System.out.println(f);
        
        ListIterator<Integer> d1 = c.listIterator();
        while(d1.hasNext())
        {
        	System.out.println(d1.next());
        }
        while(d1.hasPrevious())
        {
        	System.out.println(d1.previous());
        }
    }
}
