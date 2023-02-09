package main.Armor;

import main.Artifact;
import java.util.ArrayList;

public class Inventory extends ArrayList<Artifact>{

    ArrayList<String> inventoryRegister;

    public Inventory(){
        inventoryRegister = new ArrayList<String>();
    }

//    public Artifact getArtifact(String itemName){
//
//        int tmp = 0;
//
//        for(Artifact ar : this ){
//            if(ar.getName.equals(itemName)){
//                return this.get(tmp);
//            }
//        }
//
//        return null;
//    }
}
