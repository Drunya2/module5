package Module5;

import java.util.ArrayList;

public class Car {
    private String date;
    private String type;
    private int maxSpeed;
    private int timeToMax;
    private int passangers;
    private int PassangersNow;
    private int speedNow;
    private CarDoor[] cardoors = new CarDoor[4];
    private CarWheel[] carwheels = new CarWheel[4];
    private int countWheels;
    private int countDoors;

    public Car(String date){
        this.date = date;
    }

    public Car(String date, String type, int maxSpeed, int timeToMax, int passangers, int PassangersNow, int speedNow){

        this.date = date;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.timeToMax = timeToMax;
        this.passangers = passangers;
        this.PassangersNow = PassangersNow;
        this.speedNow = speedNow;
        this.countWheels=4;
        this.countDoors=4;
    }

    //Изменение текущей скорости
    public void speedNow(int newSpeed){
        speedNow = newSpeed;
        System.out.println("Текущая скорость = " + speedNow);
    }

    //Посадить 1 пассажира в автомобиль
    public int PassangersPlus(){
        PassangersNow=PassangersNow+1;
        System.out.println("Кол-во пассажиров сейчас = "+PassangersNow);
        return PassangersNow;
    }
    //Высадить 1 пассажира
    public int PassangersMinus1(){
        PassangersNow=PassangersNow-1;
        System.out.println("Кол-во пассажиров = "+PassangersNow);
        return PassangersNow;
    }

    //Высадить всех пассажиров
    public int outPassangers(){
        PassangersNow=0;
        System.out.println("Кол-во пассажиров = "+PassangersNow);
        return PassangersNow;
    }

    //Получить двери и колеса по индексу
    public void setCarDoors(){
        for (int i = 0; i < 4; i++){
            cardoors[i] = new CarDoor();
        }
    }

    public void setCarWheels(){
        for (int i=0; i < 4; i++){
            carwheels[i] = new CarWheel();
        }
    }

    public CarDoor getCarDoor(int i) {
        if ((i >= 0) && (i <= 4 - 1)) {

        }
        return cardoors[i];
    }

    public CarWheel getCarWheel(int i) {
        if ((i >= 0) && (i <= 4 - 1)) {

        }
        return carwheels[i];
    }
    //Убрать все колеса из автомобиля

    public void removeWheels(){
        countWheels = 0;
        System.out.println("Все колеса сняты");

    }


    //Установите новое колесо на машину X (в дополнение к существующим)


    public int increseWheel(int w){

        countWheels=countWheels+w;
        System.out.println("Текущее число колес = " + countWheels);
        return countWheels;

    }

    /*
    Вычислить текущую возможную максимальную скорость (Скорость машины вычисляется так:
    Максимальная скорость новой машины множиться на самое стертое колесо в машине.
    Максимальная скорость равна 0 если в машине нет ни одного пассажира, так как некому ее вести)
     */
    public void maxSpeed(int samoeStertoe){
        if(PassangersNow > 0) {
            speedNow = maxSpeed * samoeStertoe;
            System.out.println("Макс скорость сейчас = " + speedNow);
        }
        else {
            System.out.println("Максимальная скорость - 0, так как нет пассажиров");
        }

    }

    //Вывести в консоль данные об объекте

    public void infoCar(){
        System.out.println("date of manufacture: " +date);
        System.out.println("engine's type: " + type);
        System.out.println("The maximum speed of a new machine: " + maxSpeed);
        System.out.println("Acceleration time to 100 km / h= " + timeToMax);
        System.out.println("Passenger capacity = " + passangers);
        System.out.println("Number of passengers inside at the moment = " + PassangersNow);
        System.out.println("Current speed = " + speedNow);
    }

}
