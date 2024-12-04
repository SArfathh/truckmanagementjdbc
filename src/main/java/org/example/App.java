package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Truck volvo = new Truck("volvo", "2008",900, "fairoz");
        Truck tata = new Truck("tata", "2007",1200, "fayaz");
        Truck eicher = new Truck("eicher", "2020",800, "mohadin");


////        adding trucks
        TruckDao dao = new TruckDao();
//        dao.addTruck(volvo);
//        dao.addTruck(tata);
//        dao.addTruck(eicher);
//
//        fetching trucks data
        System.out.println(dao.getTruckById(1));
        System.out.println(dao.getTruckById(2));
        System.out.println(dao.getTruckById(3));


//         update truck
        Truck truck = dao.getTruckById(2);
        truck.setDriver("wajid");
        dao.updateTruck(truck);
        System.out.println(dao.getTruckById(2));

//        delete truck
        dao.delete(3);
        System.out.println(dao.getTruckById(3));


    }
}
