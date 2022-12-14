package Chapter3.ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void starCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }
    public void washCar(){
                                    // 필요한 경우에 재정의
    }

    final public void run(){
        starCar();
        drive();
        wiper();
        stop();
        turnOff();
        washCar();
    }
}
