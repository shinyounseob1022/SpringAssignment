
public class Main extends PublicTransport{
    public static void main(String[] args) {
        // 구분선
        System.out.println("----- Bus -----");
        // Bus
        // 1,2) Bus 2대 생성
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        // 각 Bus 번호 다른지 확인
        System.out.println("버스1의 번호 = "+bus1.getBusNum());
        System.out.println("버스2의 번호 = "+bus2.getBusNum());
        // 1) 승객 +2
        int money = bus1.boardingPassenger(2, bus1);
        // 2) 출력
        System.out.println("탑승 승객 수 = " + 2);
        System.out.println("잔여 승객 수 = "+bus1.getRemainingSeat());
        System.out.println("요금 확인 = "+money);
        // 3) 주유량 -50
        bus1.changeState(bus1, -50);
        // 4) 출력
        System.out.println("주유량 = "+bus1.getFuelVolume());
        // 5) 상태 변경
        bus1.changeState(bus1, 0);
        // 6) 주유량 +10
        bus1.changeState(bus1, 10);
        // 7) 출력
        System.out.println("상태 = "+bus1.getState());
        System.out.println("주유량 = "+bus1.getFuelVolume());
        // 8) 상태 변경
        bus1.changeState(bus1, 0);
        // 9) 승객 +45 // 10) 알럿
        bus1.boardingPassenger(45, bus1);
        // 11) 승객 +5
        money = bus1.boardingPassenger(5, bus1);
        // 12) 출력
        System.out.println("탑승 승객 수 = "+5);
        System.out.println("잔여 승객 수 = "+bus1.getRemainingSeat());
        System.out.println("요금 = "+money);
        // 시나리오에 따르면 '주유 필요!' 출력이 나중에 나와야 하지만 제 코드는 먼저 실행됩니다.
        // 13) 주유량 -55
        bus1.changeState(bus1, -55);
        // 14) 출력
        System.out.println("주유량 = "+bus1.getFuelVolume());
        System.out.println("상태 = "+bus1.getState());

        // 구분선
        System.out.println("----- Taxi -----");

        // Taxi
        // 1,2) Taxi 2대 생성
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        // 각 Taxi 번호 다른지 확인
        System.out.println("택시1 = "+taxi1.getTaxiNum());
        System.out.println("택시2 = "+taxi2.getTaxiNum());
        // 1) 승객 +2, 목적지 = 서울역, 목적지까지 거리 = 2km
        money = taxi1.boardingPassenger(2, "서울역", 2, taxi1);
        // 2) 출력
        System.out.println("탑승 승객 수 = "+2);
        System.out.println("잔여 승객 수 = "+taxi1.getRemainingSeat());
        System.out.println("기본 요금 확인 = "+taxi1.getDefaultMoney());
        System.out.println("목적지 = "+taxi1.getDestination());
        System.out.println("목적지까지 거리 = "+taxi1.getDistanceDestination()+"km");
        System.out.println("지불할 요금 = "+money);
        System.out.println("상태 = "+taxi1.getState());
        // 3) 주유량 -80
        taxi1.changeState(taxi1, -80);
        // 4) 요금 결제
        taxi1.payment(money);
        // 5) 출력
        System.out.println("주유량 = "+taxi1.getFuelVolume());
        System.out.println("누적 요금 = "+money);
        // 6) 승객 +5 // 7) 알럿
        money = taxi1.boardingPassenger(5, "", 0, taxi1);
        // 8) 승객 +3, 목적지 = 구로디지털단지역, 목적지까지 거리 = 12km
        money = taxi1.boardingPassenger(3, "구로디지털단지역", 12, taxi1);
        // 9) 출력
        System.out.println("탑승 승객 수 = "+3);
        System.out.println("잔여 승객 수 = "+taxi1.getRemainingSeat());
        System.out.println("기본 요금 확인 = "+taxi1.getDefaultMoney());
        System.out.println("목적지 = "+taxi1.getDestination());
        System.out.println("목적지까지 거리 = "+taxi1.getDistanceDestination()+"km");
        System.out.println("지불할 요금 = "+money);
        System.out.println("상태 = "+taxi1.getState());
        // 10) 주유량 -20
        taxi1.changeState(taxi1, -20);
        // 11) 요금 결제
        taxi1.payment(money);
        // 12) 출력 // 13) 알럿
        System.out.println("주유량 = "+taxi1.getFuelVolume());
        System.out.println("상태 = "+taxi1.getState());
        // 요금 결제가 되었는데 누적 요금이 왜 있는지 모르겠습니다.
        // 시나리오에 있어서 일단 그냥 넣었습니다.
        System.out.println("누적 요금 = "+money);
    }
}