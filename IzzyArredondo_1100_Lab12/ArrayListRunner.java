import java.util.ArrayList;

public class ArrayListRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        
        // a)
        names.add("Alice"); 
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        
        System.out.println(names);
        System.out.println();
        
        // b)
        String first = names.get(0);
        //String last = names.get(7);
        
        // d)
        String last = names.get(names.size() - 1);
        
        System.out.println(first);
        System.out.println(last);
        
        System.out.println();
        
        // c)
        System.out.println(names.size());
        
        System.out.println();
        
        // e)
        names.set(0, "Alice B. Toklas");
        System.out.println(names);
        
        System.out.println();
        
        // f)
        names.add(4, "Doug");
        System.out.println(names);
        
        System.out.println();
        
        // g)
        for(String n : names)
        {
            System.out.println(n);
        }
        
        System.out.println();
        
        // h)
        ArrayList<String> names2 = new ArrayList<String>(names);
        System.out.println(names2);
        
        System.out.println();
        
        // i)
        names.remove(0);
        System.out.println(names);
        System.out.println(names2);
       
    }
} 