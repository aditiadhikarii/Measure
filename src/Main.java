import models.Measurement;
public class Main {
    public static void main(String[] args) {
        Measurement Measure = new Measurement(10);
        System.out.println(Measure.getKm() + " Km");
        System.out.println(Measure.getCm() + " Cm");
        System.out.println(Measure.getMm() + " Mm");
        System.out.println(Measure.getDm() + " Dm");
    }
}
