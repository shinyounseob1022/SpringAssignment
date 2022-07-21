import java.util.ArrayList;

public class Bus extends PublicTransport{
    int busNum; // 번호
    ArrayList<Integer> busNums = new ArrayList<>();
    int fuelVolume = 100; // 주유량
    int speed = 0; // 속도
    int maxPassenger = 30; // 최대 승객
    int currentPassenger; // 현재 승객
    int remainingSeat; // 남은 자리 수
    String state = "운행"; // 상태
    int defaultMoney = 1000; // 기본 요금

    // 생성자
    public Bus() {
        busNum = (int)(Math.random()*10000);
        if (busNums.size() == 0) {
            busNums.add(busNum);
        }
        else {
            for (int i = 0; i < busNums.size(); i++) {
                busNum = (int)(Math.random()*10000);
                if (busNums.get(i) != busNum) {
                    busNums.add(busNum);
                }
            }
        }
    }

    // Getter & Setter
    public int getBusNum() {
        return busNum;
    }

    public void setBusNum(int busNum) {
        this.busNum = busNum;
    }

    @Override
    public int getFuelVolume() {
        return fuelVolume;
    }

    @Override
    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getMaxPassenger() {
        return maxPassenger;
    }

    @Override
    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getCurrentPassenger() {
        return currentPassenger;
    }

    public void setCurrentPassenger(int currentPassenger) {
        this.currentPassenger = currentPassenger;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getDefaultMoney() {
        return defaultMoney;
    }

    public void setDefaultMoney(int defaultMoney) {
        this.defaultMoney = defaultMoney;
    }

    public int getRemainingSeat() {
        return remainingSeat;
    }

    public void setRemainingSeat(int remainingSeat) {
        this.remainingSeat = remainingSeat;
    }
}
