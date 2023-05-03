public class PermanentHire extends SalariedWorker{
    public static final double PermanentHire_BasePay = 8000;
    public double PermanentHire_Bonus = 0;
    public PermanentHire(String name, int social){
        super(name, social, PermanentHire_BasePay );
    }

    public PermanentHire(String name, int social, double PermanentHire_Bonus) {
        super(name, social, PermanentHire_BasePay);
        this.PermanentHire_Bonus = PermanentHire_Bonus;
    }
    @Override
    public double calculateWeeklyPay(){
        return (PermanentHire_BasePay / 4) + PermanentHire_Bonus;
    }
}
