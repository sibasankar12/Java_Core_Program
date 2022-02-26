package program;

public class FirstletterCaptialinString {

	public static void main(String[] args)
	{
		String s="hari";
		String firstltr=s.substring(0,1);
		String remainltr=s.substring(1);
		String firstltr1 = firstltr.toUpperCase();
        String firstlettercapital=firstltr1+remainltr;
        System.out.println("firstletter capital of a name:"+firstlettercapital);
	}

}
