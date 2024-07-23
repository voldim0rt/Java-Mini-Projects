public class SUV extends Car{


    public SUV(String name, boolean isManual) {
        super(name, 4, 5, 6, isManual, "SUV");
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate;  //multi lavel inheritance- taken from Vehicle.
        /*
        * speed = 0 : Gear 1
        * speed = 0-10 : Gear 1
        * speed = 10-20 : Gear 2
        * speed = 20-30 : Gear 3
        * speed = 30-50 : Gear 4
        * speed = 50-70 : Gear 5
        * 6th
         */
        if(newSpeed == 0){
            stop();
            changeGear(1);
        }else if(newSpeed > 0 && newSpeed <=10){
            changeGear(1);
        }else if(newSpeed > 10 && newSpeed <=20){
            changeGear(2);
        }else if(newSpeed > 20 && newSpeed <=30){
            changeGear(3);
        }else if(newSpeed > 30 && newSpeed <=50){
            changeGear(4);
        }else if(newSpeed > 50 && newSpeed <=70){
            changeGear(5);
        }else{
            changeGear(6);
        }
        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
