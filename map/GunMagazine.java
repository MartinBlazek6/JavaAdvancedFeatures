package map;

import java.util.List;

public class GunMagazine {
   private List<String> magazine;



   public void loadBullet(String bullet){
       if (isLoaded()){
           throw new RuntimeException("Magazine is fully loaded");
       }
       this.magazine.add(bullet);
   }

   public boolean isLoaded(){
       return this.magazine.size()>=9;
   }

   public void shot(){
       for (String bullet:magazine) {
        if (magazine.size()>1){
            System.out.println(bullet);
        } else if (magazine.size() == 1) {
            System.out.println("This is last one");
            System.out.println(bullet);
        }
        else {
            System.out.println("empty magazine");
        }
       }
   }
}
