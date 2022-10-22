package install_base_station;

import java.util.Arrays;

public class InstallBaseStationMain {

	public static void main(String[] args) {
		InstallBaseStation ibs = new InstallBaseStation();
		int[] intArr = {1, 8, 9, 10, 16};
		System.out.println(ibs.solution02(16, intArr ,2));
	}

}
