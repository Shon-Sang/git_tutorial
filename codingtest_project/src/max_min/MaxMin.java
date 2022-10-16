package max_min;

public class MaxMin {
	public String solution(String s) {
        int max = -9999;
        int min = 9999;
        String answer = "";
        String[] maxmin = new String[2];
        String[] strArr = s.split(" ");
        int buf = 0;
        for(int i=0; i<strArr.length; i++){
            buf = Integer.parseInt(strArr[i]);
            if(min > buf){
                maxmin[0] = String.valueOf(buf);
                min = buf;
            }
            
            if(max < buf){
                maxmin[1] = String.valueOf(buf);
                max = buf;
            }
        }
        
        answer = String.format("%s %s",maxmin[0], maxmin[1]);
        return answer;
    }
}
