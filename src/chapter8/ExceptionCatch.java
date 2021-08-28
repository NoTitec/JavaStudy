package chapter8;

public class ExceptionCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data =0;
		
		try {
			data=Integer.parseInt("1123.45");
		} 
		catch (ClassCastException e) {
			System.out.println("first except"+e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("second except"+e);
			System.out.println("second except"+e.getMessage());
			e.printStackTrace();
			
		}
	}

}
