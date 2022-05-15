package codingTest.parkingcalculation;


public class CarParkingInfo {
	private String startTime;
	private String endTime;
	private boolean parkCheck;
	private String carNumber;
	private int baseAccount;
	private int baseMinute;
	private int unitTime;
	private int unitPrice;
	private int account;
	private final int FINALMINUTE = (23 * 60) + 59;
	
	public CarParkingInfo() {
		
	}
	public CarParkingInfo(String carNumber, String startTime, int baseMinute, int baseAccount, int unitTime, int unitPrice) { // 가장첨에 만들때 차번호, 주차시작시간, 기본요금, 기본시간
		this.carNumber = carNumber;
		this.startTime = startTime;
		this.baseAccount = baseAccount;
		this.baseMinute = baseMinute;
		this.unitTime = unitTime;
		this.unitPrice = unitPrice;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		parkCheck = false;
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		parkCheck = true;
		this.endTime = endTime;
	}


	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}
	
	public boolean isParkCheck() {
		return parkCheck;
	}
	public void setParkCheck(boolean parkCheck) {
		this.parkCheck = parkCheck;
	}
	
	public void calcAccount() {
		int endMinute = minuteMaker(endTime);
		int startMinute = minuteMaker(startTime);
		baseMinute = baseMinute - (endMinute - startMinute);
		if(baseMinute < 0) {
			account = baseAccount + (int)(Math.ceil((baseMinute*-1)/(double)(unitTime)))*unitPrice;
		}
		else {
			account = baseAccount;
		}
		
//		startTime = "";
//		endTime = "";
	}
	
	private int minuteMaker(String time) {
		String[] data = time.split(":");
		int result = 0;
		result = Integer.parseInt(data[0])*60 + Integer.parseInt(data[1]);
		
		return result;
	}
	
	public void finalCalcAccount() {
		baseMinute = baseMinute - (FINALMINUTE - minuteMaker(startTime));
		if(baseMinute < 0) {
			account = baseAccount + ((int)(Math.ceil((baseMinute*-1)/(double)(unitTime))))*unitPrice;
		}else {
			account = baseAccount;
		}
	}
}
