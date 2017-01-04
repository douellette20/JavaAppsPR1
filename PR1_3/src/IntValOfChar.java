
public class IntValOfChar {

	public static void main(String[] args) {
		DisplayIntValue('A');
		DisplayIntValue('B');
		DisplayIntValue('C');
		DisplayIntValue('a');
		DisplayIntValue('b');
		DisplayIntValue('c');
		DisplayIntValue('0');
		DisplayIntValue('1');
		DisplayIntValue('2');
		DisplayIntValue('5');
		DisplayIntValue('^');
		DisplayIntValue('+');
		DisplayIntValue('/');
		DisplayIntValue(' ');
	}
	
	private static void DisplayIntValue(char c)
	{
		System.out.printf("The character %c has the value %d\n", c, (int)c);
	}

}
