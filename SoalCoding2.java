abstract class Prayer {   //Abstract class Prayer yang mewakili sholat
    protected String waktu;

    public Prayer(String waktu) {
        this.waktu = waktu;
    }

    public abstract void remind();
}

interface AudioReminder {  //interface untuk fitur adzan
    void adzan();
}

//class untuk 5 jadwal sholat 
class Fajr extends Prayer implements AudioReminder {
    public Fajr() {
        super("04:50");  //untuk memanggil constructor dari class Prayer
    }

    @Override
    public void remind() {
        System.out.println(waktu + " waktunya sholat shubuh");
    }

    @Override
    public void adzan() {
        System.out.println("Adzan Shubuh berkumandang..");
    }
}


class Dzuhur extends Prayer implements AudioReminder {
    public Dzuhur() {
        super("12:22");
    }

    @Override
    public void remind() {
        System.out.println(waktu + " waktunya sholat Dzuhur");
    }

    @Override
    public void adzan() {
        System.out.println("Adzan Dzuhur berkumandang..");
    }
}


class Ashar extends Prayer implements AudioReminder {
    public Ashar() {
        super("15:47");
    }

    @Override
    public void remind() {
        System.out.println(waktu + " waktunya sholat Ashar");
    }

    @Override
    public void adzan() {
        System.out.println("Adzan Ashar berkumandang..");
    }
}


class Maghrib extends Prayer implements AudioReminder {
    public Maghrib() {
        super("18:31");
    }

    @Override
    public void remind() {
        System.out.println(waktu + " waktunya sholat Maghrib");
    }

    @Override
    public void adzan() {
        System.out.println("Adzan Maghrib berkumandang..");
    }
}


class Isya extends Prayer implements AudioReminder {
    public Isya() {
        super("19:46");
    }

    @Override
    public void remind() {
        System.out.println(waktu + " waktunya sholat Isya");
    }

    @Override
    public void adzan() {
        System.out.println("Adzan Isya berkumandang..");
    }
}


public class SoalCoding2 {
    public static void main(String[] args) {
        System.out.println("===Sudahkah Anda Sholat??===\n");
        //Demonstrasi polymorphism
        Prayer[] jadwal = {  
        new Fajr(),
            new Dzuhur(),
            new Ashar(),
            new Maghrib(),
            new Isya(),
        };
        for (Prayer sholat : jadwal) {  //Looping semua jadwal sholat
            sholat.remind();

            if (sholat instanceof AudioReminder) {  //Cek dan panggil adzan jika object juga implement AudioReminder
                ((AudioReminder) sholat).adzan();
            }

            System.out.println(); //Untuk pemisah antar jadwal
        }
    }
}


