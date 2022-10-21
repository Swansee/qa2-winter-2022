package homework1;
import org.junit.jupiter.api.Test;

public class HomeWorkTest {
    @Test
    public void workingWithDelivery() {
        Delivery firstDelivery = new Delivery();
        firstDelivery.setBoxes(3);
        firstDelivery.setCosts(99.55);
        firstDelivery.setCourier("DPD Latvija");

        System.out.println("Delivery out");
        System.out.println("1st delivery:");
        System.out.println(firstDelivery.getBoxes());
        System.out.println(firstDelivery.getCosts());
        System.out.println(firstDelivery.getCourier());
    }
    @Test
    public void workingWithKeyboard () {
        Keyboard firstKeyboard = new Keyboard();
    //    firstKeyboard.setBluetooth("Yes");
        firstKeyboard.setColor("Black");
        firstKeyboard.setKeys(155);

        System.out.println("Logitech keyboard");
        System.out.println(firstKeyboard.getColor());
        System.out.println(firstKeyboard.getKeys());
    }
    @Test
    public void workingWithCountry() {
        Country firstCountry = new Country();
        firstCountry.setArea(64589);
        firstCountry.setCallingCode("+371");
        firstCountry.setCurrency("EUR");
        firstCountry.setPopulation(1842226);
        firstCountry.setCountryCapital("RIGA");
        firstCountry.setCountryName("Latvija");

        System.out.println(firstCountry.getCountryName());
        System.out.println(firstCountry.getCountryCapital());
        System.out.println(firstCountry.getArea());
        System.out.println(firstCountry.getPopulation());
        System.out.println(firstCountry.getCurrency());
        System.out.println(firstCountry.getCallingCode());
    }
    @Test
    public void workingWithCar() {
        Car firstCar = new Car();
        firstCar.setManufacturer("Mercedes-Benz");
        firstCar.setAutoClass("Full-size luxury car (F)");
        firstCar.setBodyStyle("5-door liftback");
        firstCar.setModelYear(2022);
        firstCar.setBatteryKwt(108);
        firstCar.setElectricRange(785);

        System.out.println(firstCar.getManufacturer());
        System.out.println(firstCar.getAutoClass());
        System.out.println(firstCar.getBodyStyle());
        System.out.println(firstCar.getModelYear());
        System.out.println(firstCar.getBatteryKwt());
        System.out.println(firstCar.getElectricRange());
    }
    @Test
    public void workingWithCoctails() {
        Coctail firstCoctail = new Coctail();
        firstCoctail.setName("Mohito");
        firstCoctail.setWhiteRum(0.050);
        firstCoctail.setSugarSyrup(0.015);
        firstCoctail.setSoda(0.100);

        System.out.println(firstCoctail.getName());
        System.out.println(firstCoctail.getWhiteRum());
        System.out.println(firstCoctail.getSugarSyrup());
        System.out.println(firstCoctail.getSoda());
    }
    @Test
    public void workingWithMovie(){
        Movie firstMovie = new Movie();
        firstMovie.setName("The Matrix");
        firstMovie.setDirector("The Wachowskis");
        firstMovie.setBudget(63);
        firstMovie.setLength(136);

        System.out.println(firstMovie.getName());
        System.out.println(firstMovie.getDirector());
        System.out.println(firstMovie.getBudget());
        System.out.println(firstMovie.getLength());
    }
    @Test
    public void workingWithOmelette(){
        Omelette firstOmelette = new Omelette();
        firstOmelette.setEggs(2);
        firstOmelette.setMilk(0.20);
        firstOmelette.setSousages(3);
        firstOmelette.setTomatoes(1);

        System.out.println(firstOmelette.getEggs());
        System.out.println(firstOmelette.getMilk());
        System.out.println(firstOmelette.getSousages());
        System.out.println(firstOmelette.getTomatoes());
    }
    @Test
    public void workingWithPayment(){
        Payment firstPayment = new Payment();
        firstPayment.setCurrency("EUR");
        firstPayment.setAccount("SWEDBANK");
        firstPayment.setAmount(157.99);

        System.out.println(firstPayment.getCurrency());
        System.out.println(firstPayment.getAccount());
        System.out.println(firstPayment.getAmount());
    }
    @Test
    public void workingWithRestourant(){
        Restourant firstRestourant = new Restourant();
        firstRestourant.setCoffee(16.750);
        firstRestourant.setWhiskey(14.550);
        firstRestourant.setCola(170.250);

        System.out.println(firstRestourant.getCoffee());
        System.out.println(firstRestourant.getWhiskey());
        System.out.println(firstRestourant.getCola());
    }
    @Test
    public void workingWithSong(){
        Song firstSong = new Song();
        firstSong.setArtist("Depeche Mode");
        firstSong.setAlbum("Music for the Masses");
        firstSong.setSong("Never Let Me Down Again");
        firstSong.setYear(1987);
        firstSong.setLength(287);

        System.out.println(firstSong.getSong());
        System.out.println(firstSong.getArtist());
        System.out.println(firstSong.getAlbum());
        System.out.println(firstSong.getYear());
        System.out.println(firstSong.getLength());
    }

}
