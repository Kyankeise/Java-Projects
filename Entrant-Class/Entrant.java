
/**
 * Class Entrant - Simulates an entrant in Walton Classic Car Race.
 * 
 * @author Kyan Keise
 * @version 01/05/2019
 */
public class Entrant implements Comparable<Entrant>
{
      private static int nextNumber = 1; // static instance variable

   /* instance variables */

   private int number;       // entrant's number
   private String name;      // entrant's name
   private String category;  // "E1", "E2" or "E3"
   private double time;  // entrant's marathon time in seconds


   /**
    * Constructor for objects of class Entrant.
    */
   public Entrant()
   {
      super();
      name = "";
      category = "";
      time = 0.0;
      this.number = nextNumber ++;

   }
   
   /**
    * Constructor for objects of class Entrant.
    */
   public Entrant(String aName, String aCat)
   {
      super();
      name = aName;
      category = aCat;
      time = 0.0;
      this.number = nextNumber ++;

   }
   

   /**
    * getter for number
    */
   public int getNumber()
   {
      return number;
   }

   /**
    * getter for name
    */
   public String getName()
   {
      return name;
   }

   /**
    * setter for name
    */
   public void setName(String aName)
   {
      name = aName;
   }

   /**
    * getter for category
    */
   public String getCategory()
   {
      return category;
   }

   /**
    * setter for category
    */
   public void setCategory(String carType)
   {
      category = carType;
   }

   /**
    * getter for time
    */
   public double getTime()
   {
      return time;
   }  

   /**
    * setter for time
    */
   public void setTime(double aTime)
   {
      time = aTime;
   }
   
   public int compareTo(Entrant anotherEntrant)
   {
      return Double.compare(getTime(), anotherEntrant.getTime());
     
   } 
 
   


}
