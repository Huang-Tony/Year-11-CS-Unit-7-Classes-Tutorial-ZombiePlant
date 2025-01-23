public class ZombiePlant {
    private int potency;
    private int treatments;
    public ZombiePlant(int potency, int treatments){
        this.potency = potency;
        this.treatments = treatments;
    }
    public int getPotency(){
        return potency;
    }
    public int treatmentsNeeded(){
        return treatments;
    }
    public boolean isDangerous(){
        if(treatmentsNeeded() >= 1){
            return true;
        }
        return false;
    }
    public void treat(int treatments){
        if (treatments > 0) {
        if (treatments <= this.potency && this.treatments > 0) {
            this.treatments--;
        } else if (treatments > this.potency) {
            this.treatments++;
        }
    }
    }
}
