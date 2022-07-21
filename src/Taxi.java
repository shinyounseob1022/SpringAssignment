import java.util.ArrayList;

public class Taxi extends PublicTransport{
    int taxiNum; // 번호
    ArrayList<Integer> taxiNums = new ArrayList<>();
    int fuelVolume = 100; // 주유량
    int speed = 0; // 속도
    int maxPassenger = 4; // 최대 승객
    String destination; // 목적지
    int distanceDestination; // 목적지까지 거리
    int defaultDistance = 1; // 기본 거리
    int defaultMoney = 3000; // 기본 요금
    int distanceMoney = 1000; // 거리당 요금
    String state = "일반"; // 상태
    int currentPassenger; // 현재 승객
    int remainingSeat; // 남은 자리 수

    // 생성자
    public Taxi() {
        taxiNum = (int)(Math.random()*10000);
        if (taxiNums.size() == 0) {
            taxiNums.add(taxiNum);
        }
        else {
            for (int i = 0; i < taxiNums.size(); i++) {
                taxiNum = (int)(Math.random()*10000);
                if (taxiNums.get(i) != taxiNum) {
                    taxiNums.add(taxiNum);
                }
            }
        }
    }

    // 거리당 요금 추가
    public int distanceMoneyPlus(Taxi taxi) {
        int money = taxi.defaultMoney +
                ((taxi.distanceDestination-taxi.defaultDistance) *
                        taxi.distanceMoney);
        return money;
    }

    // 요금 결제
    public void payment(int money) {
        System.out.println("누적 요금 = "+money+"원 결제되었습니다!");
    }

    // Getter & Setter
    public int getTaxiNum() {
        return taxiNum;
    }

    public void setTaxiNum(int taxiNum) {
        this.taxiNum = taxiNum;
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

    public int getDistanceDestination() {
        return distanceDestination;
    }

    public void setDistanceDestination(int distanceDestination) {
        this.distanceDestination = distanceDestination;
    }

    public int getDefaultDistance() {
        return defaultDistance;
    }

    public void setDefaultDistance(int defaultDistance) {
        this.defaultDistance = defaultDistance;
    }

    public int getDefaultMoney() {
        return defaultMoney;
    }

    public void setDefaultMoney(int defaultMoney) {
        this.defaultMoney = defaultMoney;
    }

    public int getDistanceMoney() {
        return distanceMoney;
    }

    public void setDistanceMoney(int distanceMoney) {
        this.distanceMoney = distanceMoney;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCurrentPassenger() {
        return currentPassenger;
    }

    public void setCurrentPassenger(int currentPassenger) {
        this.currentPassenger = currentPassenger;
    }

    public int getRemainingSeat() {
        return remainingSeat;
    }

    public void setRemainingSeat(int remainingSeat) {
        this.remainingSeat = remainingSeat;
    }
}
