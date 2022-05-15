package codingTest.parkingcalculation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestLevel2_CarParking {
	public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        List<CarParkingInfo> cpiList = new ArrayList<CarParkingInfo>();
        for(String rec : records) {
        	String[] data = rec.split(" ");
        	String time = data[0];
        	String number = data[1];
        	String check = data[2];
        	
        	int index = myContains(cpiList, number);
        	if(check.equals("IN")) {
        		if(index != -1){//존재한다
        			cpiList.get(index).setStartTime(time);
        		}else { // 존재하지 않는다
        			cpiList.add(new CarParkingInfo(number, time, fees[0], fees[1], fees[2], fees[3]));
        		}
        	}else { //out
        		CarParkingInfo cpi = cpiList.get(index);
        		cpi.setEndTime(time);
        		cpi.calcAccount();
        	}
        }
        
        answer = new int[cpiList.size()];
        int idx = 0;
        
        cpiList.sort(new Comparator<CarParkingInfo>() {

			@Override
			public int compare(CarParkingInfo o1, CarParkingInfo o2) {
				int front = Integer.parseInt(o1.getCarNumber());
				int back = Integer.parseInt(o2.getCarNumber());
				return front - back;
			}
		});
        
        for(CarParkingInfo cpi : cpiList) {
        	if(!cpi.isParkCheck()) {
        		cpi.finalCalcAccount();
        	}
        	answer[idx] = cpi.getAccount();
        	idx += 1;
        }
        
        return answer;
    }
	


	public int myContains(List<CarParkingInfo> list, String number) {
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getCarNumber().equals(number)) {
				return i;
			}
		}

		return -1;
	}
}
