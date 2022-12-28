public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car ();
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.country = "Russia";
        ladaGranta.color = "yellow";
        ladaGranta.engineVolume = 1.7;
        ladaGranta.year = 2015;

        Car audiA850LTDIQuattro = new Car();
        audiA850LTDIQuattro.brand = "Audi";
        audiA850LTDIQuattro.model = "A8 50 L TDI quattro";
        audiA850LTDIQuattro.year = 2020;
        audiA850LTDIQuattro.country = "Germany";
        audiA850LTDIQuattro.color = "black";
        audiA850LTDIQuattro.engineVolume = 3.0;

        Car bmwZ8 = new Car();
        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.country = "Germany";
        bmwZ8.year = 2021;
        bmwZ8.color = "black";
        bmwZ8.engineVolume = 3.0;

        Car kiaSportage4 = new Car();
        kiaSportage4.brand = "KIA";
        kiaSportage4.model = "Sportage 4 generatons";
        kiaSportage4.year = 2018;
        kiaSportage4.country = "South Korea";
        kiaSportage4.color = "red";
        kiaSportage4.engineVolume = 2.4;

        Car hyundaiAvante = new Car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.country = "South Korea";
        hyundaiAvante.color = "orange";
        hyundaiAvante.engineVolume = 1.6;
        hyundaiAvante.year = 2016;

        System.out.println(ladaGranta);
        System.out.println(audiA850LTDIQuattro);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(hyundaiAvante);
    }
}