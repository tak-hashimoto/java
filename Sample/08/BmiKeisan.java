import java.util.*;

public class BmiKeisan {
  public static void main(String[] args){
    Profile hashimoto = new Profile("hashimoto",1.70,57);
    Profile yamada = new Profile("yamada",1.80,89);
    Profile tanaka = new Profile("tanaka",1.50,76);
    ArrayList<Profile> profile = new ArrayList<Profile>();
    profile.add(hashimoto);
    profile.add(yamada);
    profile.add(tanaka);
    for (int i=0; i<profile.size(); i++){
      System.out.println( profile.get(i).name + "さんのBMIは" + Bmi.BmiCalculateWithInstance(profile.get(i)) +"です。");
    }
    System.out.println("bmiを測定した人数は" + Profile.profileCount + "人です。");
  }
}
