// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		// Convering the 24-hour format to the 12 hour format 
		int hoursAMPM = hours % 12;
		// Covering the case that the time is 12:XX so it does not show up as 00:XX
		if (hoursAMPM == 0) {
			hoursAMPM = hours;
		}
		// Prints out the AM/PM hours and minutes, formats the minutes so if they are a single digit pads it with a 0
		// Does not end with a line break, AM/PM time needs to be printed afterwards 
		System.out.printf("%d:%02d ", hoursAMPM, minutes);
		
		// checks if the time is before noon or after, and prints AM/PM accordingly
		if (hours < 12) {
			System.out.println("AM");
		}
		else {
			System.out.println("PM");
		}
		
	}
}