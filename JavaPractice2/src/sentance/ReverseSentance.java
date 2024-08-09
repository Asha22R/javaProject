package sentance;

public class ReverseSentance {
public static void main(String[] args) {
	String s = "welcome to tp welcome to gc18";
	//Case1: output || gc18 to welcome tp to welcome
	String[] s1 = s.split(" ");
	for (int i =s1.length-1; i>=0;i--) {
	System.out.print(s1[i]+" ");
	}
	}
}
