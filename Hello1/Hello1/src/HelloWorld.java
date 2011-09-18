import javax.sound.midi.SysexMessage;


public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Hello World ");
		StringBuffer b1 = new StringBuffer();
		b1.append("f");
		
		if(args.length != 0){
			for(String s:args){
				builder.append(s);
			}
		}
		System.out.println(builder.toString());
		System.out.println(b1.toString());
		System.out.println();
		
		
		// TODO Auto-generated method stub

	}

}
