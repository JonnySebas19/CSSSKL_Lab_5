public class Consultant extends HourlyWorker {
    public static final double hourlyPay = 3;
    public boolean partTime;
    public Consultant(String name, int social, boolean partTime){
        super(name, social, hourlyPay);
        this.partTime = partTime;
    }
    @Override
    public double calculateWeeklyPay(){
        if (partTime) {
            return 20 * hourlyPay;
        }
        return 40 * hourlyPay;
    }
}