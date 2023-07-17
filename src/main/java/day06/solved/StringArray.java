 

package day06.solved;
import java.util.Arrays; 
public class StringArray {

	public static void main(String[] args) {

		// How its stored in an normal array
		String[] cityArr = new String[3];
		cityArr[0] = "Chennai";
		cityArr[1] = "Bangalore";
		cityArr[2] = "Mumbai";

		// Display the city names
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		
	
		for(int i = 0 ; i < cityArr.length ; i++ ) {
			if(cityArr[i] == "Mumbai") {
				cityArr[i] = "Delhi";
			}else if(cityArr[i]=="Bangalore") {
				cityArr[i] = "Kolkata";
			}
		}
		
		System.out.println(Arrays.toString(cityArr));
	}
}
