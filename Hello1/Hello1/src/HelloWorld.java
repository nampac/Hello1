
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Hello World ");
		if(args.length != 0){
			for(String s:args){
				builder.append(s);
			}
		}
		System.out.println(builder.toString());
		
		// TODO Auto-generated method stub

	}

}
