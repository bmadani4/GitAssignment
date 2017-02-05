package edu.fsu.cs.cen4021.armory;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by bmadani4 on 2/2/17.
 */
class TheChosenOneAxe extends BasicWeapon implements Weapon {
    TheChosenOneAxe() {super(TheChosenOneAxe.getDamage());}

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int dam = DAMAGE;
        if(armor > 0 && armor < 20){
            return dam;
        }
        return dam - armor;
    }


    public static int getDamage(){
        int damage = 0;
        Path file = FileSystems.getDefault().getPath("/Users/bmadani4/Desktop/GitAssignment/conf", "thechosenone.txt");
        //String fileName = "conf/thechosenone.txt";
        try (InputStream in = Files.newInputStream(file);
             BufferedReader reader =
                     new BufferedReader(new InputStreamReader(in))) {
            String array[] = new String[5000];
            String line = null;
            int i = 0;

            while ((line = reader.readLine()) != null) {
                array[i] = line;
                i++;
            }
            String ar[] = new String[2];
            //System.out.println(array[0] + " " + array[1]);
            for(int j = 0; j < array.length;j++){
                //System.out.println(j + "\n");
                if(array[0].equals(array[1])){
                    if((array[j].equals(array[0])) == false){
                       // System.out.println("HERE : " + array[j] + "\n");
                        damage = j + 1;
                        break;
                    }
                }


            }
        } catch (IOException x) {
            System.err.println(x);
        }



        return damage;
    }


}
