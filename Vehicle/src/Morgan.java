public class Morgan extends Car {
    private int serviceMonths;
    public Morgan(int serviceMonths) {
        super("Morgan","Small",3,2,6,false);
        this.serviceMonths=serviceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        }
        else if(newVelocity>0 && newVelocity<=10)
            changeGear(1);
        else if(newVelocity>10 && newVelocity<=20)
            changeGear(2);
        else if(newVelocity>20 && newVelocity<=40)
            changeGear(3);
        else if(newVelocity>40 && newVelocity<=100)
            changeGear(4);
        else if(newVelocity>100 && newVelocity<=180)
            changeGear(5);
        else if(newVelocity>180 && newVelocity<=260)
            changeGear(6);

        if(newVelocity>0)
            changeVelocity(newVelocity,getCurrentDirection());
    }
}
