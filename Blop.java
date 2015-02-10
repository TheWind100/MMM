public class Blop extends Monster
{
   public Blop(int r, int c, String[][][] image)
   {
      super("The-Blop", r, c, image, 10, 20, 1, 0, 90, "Glop", 50);
      setCanSplit(true);
      setImperviousToBullets(true);
      setSlimeTrail(true);
   }
   
   public Blop(String n, int r, int c, String[][][] image, int sp, int spp, int rt)
   {
      super( n, r, c, image, 10, sp, spp, rt, 90,"Glop", 50);
   }
   
   public boolean canGrabUnit(String name)
   {
      return true;
   }
   
   public void eatUnit()
   {
   }
   
   public void grabUnit(String name)
   {
   }
   
   public String reloadingMessage()
   {
         return "Not Enough Slime Power!";
   }
}