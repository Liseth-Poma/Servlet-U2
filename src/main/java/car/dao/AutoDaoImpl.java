package car.dao;

import car.idao.IAutoDao;
import car.model.Auto;
import car.util.MemoryStore;

import java.util.List;

public class AutoDaoImpl implements IAutoDao {
    @Override
    public void add(Auto auto) {
        MemoryStore.addAuto(auto);

    }

    @Override
    public void update(Auto auto) {
        MemoryStore.editAuto(auto);
    }

    @Override
    public List<Auto> get() {
        return MemoryStore.getAutos();

    }

    @Override
    public Auto getAuto(String placa) {
        return MemoryStore.getAuto(placa);
    }

    @Override
    public void delete(String placa) {
        MemoryStore.deleteAuto(placa);
    }



    }



