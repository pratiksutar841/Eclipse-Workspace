package DreamJava;
import java.util.LinkedList;
public class CollectionFramework3
{
    public static void main(String[] args)
    {
        LinkedList<Integer> c =new LinkedList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        System.out.println(c);
        
        c.remove(2);
        System.out.println(c);
        
        c.set(1,90);
        System.out.println(c);
        
        boolean f=c.contains(100);
        System.out.println(f);
    }
}
