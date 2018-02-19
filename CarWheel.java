package Module5;

import java.util.Scanner;

public class CarWheel {

    private double conditionWheel;
    private boolean newWheel;


    public CarWheel(){
        this.conditionWheel = conditionWheel;
        this.newWheel = true;
        conditionWheel = 1;

    }

    //Сменить шину на новую
    public void changeWheel(){
        if (newWheel=false) {
            System.out.println("\n" + "Необходимо заменить колесо новым");
        }
    }

    //Стереть шину на X%
    public double wipeTheWheel(double percent){

        conditionWheel *= (1 - (percent / 100));
        System.out.println("Шина изношена" + percent + "% и теперь имеет состояние " + conditionWheel);

        return conditionWheel;

    }

    //Отобразить информацию об объебке в консоль
    public void infoWheel(){
        if ( conditionWheel > 0 && conditionWheel <= 1){
            System.out.println("Шина новая (замены не требуется).");
        }
        else {
            System.out.println("Шину надо заменить.");

        }
    }

}
