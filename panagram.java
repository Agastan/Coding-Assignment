package array;

public class panagram {
		    public static void main(String[] args) {
		        String input = "abcdefghijklmnopqrstuvwxyz";
		        boolean isPangram = checkIfPangram(input);
		        System.out.println("Is the input a pangram? " + isPangram);
		    }

		    public static boolean checkIfPangram(String input) {
		        input = input.toLowerCase();
		        boolean[] alphabetPresent = new boolean[26];
		        for (char c : input.toCharArray()) {
		            if (Character.isLetter(c)) {
		                alphabetPresent[c - 'a'] = true;
		            }
		        }
		        for (boolean letterPresent : alphabetPresent) {
		            if (!letterPresent) {
		                return false;
		            }
		        }

		        return true;
		    }
		

	}

