// to check weather the char in vowel or consent or num

class Asig3 
{
	public static void main(String[] args) 
	{
		char ch='B';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' ||ch == 'A'|| ch == 'E' || ch=='I'|| ch=='O' ||ch=='U')
			System.out.println("char is a vowel");
		else if(ch>='0' && ch<='9')
			System.out.println("char is num");
		else
			System.out.println("char is a consent");
		{
		}

	}
}
