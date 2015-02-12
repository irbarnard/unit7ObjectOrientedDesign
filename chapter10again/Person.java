
public class Person implements Comparable
{

   private String name;
   public Person(String name)
   {
        this.name = name;
   }
   public int compareTo(Object other)
   {
       Person otherPerson = (Person) other;
       String myName = this.name;
       String otherName = otherPerson.name;
       return myName.compareTo(otherName);
    }
}
