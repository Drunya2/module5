package Module5;

public class CarDoor {
    private boolean door;   //закрыта
    private boolean window; //закрыто

    public CarDoor() {
        this.door = true;
        this.window = true;


    }

    public void openDoor() {
        if (door) {
            System.out.println("The door was opened");
            door = false;
        }
    }


    public void closeDoor() {
        if (door = false) {
            System.out.println("The door was closed");
            door = true;

        }
    }


    public void checkDoorAndAction() {

        if (door) {
            System.out.println("Open the closed door");
            door = false;

        } else
        {

            System.out.printf("Close the open door");
            door = true;
        }
    }

    public void openWindow() {
        if (window) {
            System.out.println("Open the window");
            window=false;

        }
    }

    public void closeWindow() {
        if (window = false) {
            System.out.println("Close a window");

        }

    }
    // открыть/закрыть дверь (если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
    public void checkWindowAndAction() {
        if (window = true) {
            System.out.println("you need to open a closed window");
            window = false;
        } else {
            System.out.println("It is necessary to bury the open window");
            window = true;

        }
    }

    //Отобразить информацию об объекте в консоль
    public void infoDoor() {
        if (door = true) {
            System.out.println("The door is closed");
        } else {
            System.out.println("The door is open");
        }
    }

    public void infoWindow() {
        if (window = true) {
            System.out.println("Closed window");
        } else {
            System.out.println("The window is open");
        }
    }
}
