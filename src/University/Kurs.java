package University;

import java.util.Random;

public class Kurs {
    private String kursName;
    private long kursId;

    public Kurs(String kursName) {
        this.kursName = kursName;
        this.kursId = Math.abs(new Random().nextLong());
    }

    public String getKursName() {
        return kursName;
    }

    public void setKursName(String kursName) {
        this.kursName = kursName;
    }
}
