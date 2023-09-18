    */
   public boolean sleep()
   {
      boolean happy = true; 
      if (getTimesFedToday() > 0 && getHappiness() > 0 )
      {
      return happy;
      }
      else if (getTimesFedToday() == 0 || getHappiness() == 0 )
      {
         System.out.println("Not happy, can’t sleep" );
      }
     return false;
   }
   
   public void noWalkies() 
   {
      System.out.println("No walkies :-(" + decrementHappiness());
   }
   
   
}

