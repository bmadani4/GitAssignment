package edu.fsu.cs.cen4021.armory;

import com.sun.tools.javac.util.ArrayUtils;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmadani4 on 2/2/17.
 */
class AncientMagicStuff extends BasicWeapon implements Weapon {
    AncientMagicStuff() {super (AncientMagicStuff.getDamage());}

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        return DAMAGE;
    }

    public static int getDamage(){
        int damage = 0;
        List<Object> listNumbers = new ArrayList<Object>();
        try{
            FileInputStream fileIn = new FileInputStream("/Users/bmadani4/Desktop/GitAssignment/conf/ancientstaff.obj");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            listNumbers.add(in.readObject());
            in.close();
            fileIn.close();
            String obj = listNumbers.get(0).toString();
            obj = obj.replaceAll("[^a-zA-Z0-9,]","");
            String y[] = obj.split(",");
            int x[] = new int[y.length];
            List<Integer> lst = new ArrayList<Integer>();
            for(int i = 0; i < y.length; i++){
                    x[i] = Integer.parseInt(y[i]) * Integer.parseInt(y[i]);
                    lst.add(Integer.parseInt(y[i]) * Integer.parseInt(y[i]));



            }
            lst.remove(2);
            lst.remove(5);
            int v[] = new int[x.length];
            int c = lst.size() - 1;
            while(c>0){
                for(int u = 0; u < y.length - 2; u++){
                    v[u] = lst.get(c);
                    c--;
                }
            if(v.length > 10) {
                damage = v[0] + v[2] + v[6];
                return damage;
            }

            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return damage;
    }
}
