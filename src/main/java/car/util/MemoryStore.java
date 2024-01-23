package car.util;

import car.model.Auto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemoryStore {

    private static HashMap<String, Auto> autos= new HashMap<>();

    //añadir auto
    public static void addAuto(Auto auto){
        String placa= auto.getPlaca();
        if (autos.containsKey(placa)) {
            autos.remove(placa, auto);
        }
        autos.put(placa, auto);
    }

    //autualizar auto
    public static void editAuto(Auto auto){
        autos.replace(auto.getPlaca(), auto);
    }

    //listar todos los autos
    public static List<Auto> getAutos(){
        return new ArrayList<>(autos.values());
    }

    //obtener un auto
    public static Auto getAuto(String placa){
        return autos.get(placa);
    }

    public static void deleteAuto(String placa){
        if (autos.containsKey(placa)) {
            autos.remove(placa);
        }

    }



}
