abstract class vehicle {  //Abstract class Vehicle yang mewakili kendaraan umum
    protected String brand;

    public vehicle(String brand) {
        this.brand = brand;
    }
    
    public abstract void startEngine();  
}
    

interface Electric {  //interface Electric untuk kendaraan listrik
    void chargeBattery();
}

class Car extends vehicle implements Electric{  //class car yang mewarisi vehicle dan mengimplementasi Electric
    public Car(String brand) {
        super(brand);  //untuk memanggil constructor dari class vehicle
    }
    
    @Override
    public void chargeBattery() {
        System.out.println("Sedang mengisi daya baterai mobil " + brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Menyalakan Mobil " + brand + " dengan menekan tombol start");
    }
}

class Motorcycle extends vehicle{  //class motorcycle yang hanya mewarisi vehicle tetapi tidak mengimplementasi Electric
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Menyalakan Sepeda Motor " + brand + " dengan kick starter");
    }
}

public class SoalCoding1 {
    public static void main(String[] args) {
        vehicle myMtr = new Motorcycle("Supra_X");  //Polymorphism variabel yang bertipe Vehicle 
        vehicle myCar = new Car("Tesla");    
        myMtr.startEngine();  //menjalankan method yang di override
        myCar.startEngine();  

         if (myCar instanceof Electric) {   //untuk memanggil method dari interface Electric jika tersedia
            Electric electricCar = (Electric) myCar;
            electricCar.chargeBattery();  
        }
    }
}