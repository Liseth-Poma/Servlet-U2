package car.util;

import car.dao.AutoDaoImpl;
import car.idao.IAutoDao;
import car.model.Auto;

public class Test {
    public static void main(String[] args) {
        Auto a1 = new Auto();
        a1.setPlaca("123");
        a1.setMarca("Toyota");
        a1.setModelo("Corolla");
        a1.setAnio("2019");
        a1.setCilindraje("2000");
        a1.setConsumo("10 km por galon");

        Auto a2 = new Auto();
        a2.setPlaca("456");
        a2.setMarca("Toyota");
        a2.setModelo("Yaris");
        a2.setAnio("2019");
        a2.setCilindraje("1500");
        a2.setConsumo("15 km por galon");

        Auto a3 = new Auto();
        a3.setPlaca("789");
        a3.setMarca("Toyota");
        a3.setModelo("Hilux");
        a3.setAnio("2019");
        a3.setCilindraje("3000");
        a3.setConsumo("5 km por galon");

        IAutoDao oAutoDao = new AutoDaoImpl();
        oAutoDao.add(a1);
        oAutoDao.add(a2);
        oAutoDao.add(a3);

        for (Auto auto : oAutoDao.get()) {
            System.out.println(auto);
        }

    }


}
