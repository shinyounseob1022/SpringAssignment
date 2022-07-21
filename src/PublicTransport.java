import java.awt.event.WindowFocusListener;

public class PublicTransport {
    int num; // 번호
    int fuelVolume = 100; // 주유량
    int speed = 0; // 속도
    int maxPassenger; // 최대 승객

    // 생성자
    public PublicTransport() {
        // 기본 생성자입니다.
    }

    // 운행 시작
    public void startOperation() {
        // 시나리오에 필요 없는 기능입니다.
    }

    // 속도 변경
    public void changeSpeed() {
        // 시나리오에 필요 없는 기능입니다.
    }

    // 상태 변경(Bus)
    public void changeState(Bus bus, int fillingAmount) {
        bus.setFuelVolume(bus.getFuelVolume()+fillingAmount);
        if (bus.getState() == "운행") {
            bus.setState("차고지 행");
        } else if (bus.getState() == "차고지 행") {
            bus.setState("운행");
        }
        if (bus.getFuelVolume() < 10) {
            bus.setState("차고지 행");
            System.out.println("주유 필요!!");
        }
    }

    // 상태 변경(Taxi)
    public void changeState(Taxi taxi, int fillingAmount) {
        taxi.setFuelVolume(taxi.getFuelVolume()+fillingAmount);
        if (taxi.getFuelVolume() < 10) {
            taxi.setState("운행불가");
            System.out.println("주유 필요!!");
        }
    }

    // 승객 탑승(Bus)
    public int boardingPassenger(int newPassenger, Bus bus) {
        if (newPassenger > bus.maxPassenger) {
            System.out.println("최대 승객 수 초과!!");
        } else {
            bus.setCurrentPassenger(newPassenger);
            bus.setRemainingSeat(bus.getMaxPassenger() - newPassenger);
            int money = newPassenger * bus.defaultMoney;
            return money;
        }
        return 0;
    }

    // 승객 탑승(Taxi)
    public int boardingPassenger(int newPassenger, String destination,
                                 int distanceDestination, Taxi taxi) {
        if (newPassenger > taxi.maxPassenger) {
            System.out.println("최대 승객 수 초과!!");
        } else {
            taxi.setCurrentPassenger(newPassenger);
            taxi.setRemainingSeat(taxi.getMaxPassenger() - newPassenger);
            taxi.setDestination(destination);
            taxi.setDistanceDestination(distanceDestination);
            int money = taxi.distanceMoneyPlus(taxi);
            taxi.setState("운행중");
            return money;
        }
        return 0;
    }

    // Getter & Setter
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }
}
