package calculadora2;

public class Calculadora {

	private int ans;
	
	public Calculadora() {
		ans=0;
	}
	
		public int add(int a,int b) {
			ans=a+b;
			return ans;
		}
		
		public int sub(int a,int b) {
			ans=a-b;
			return ans;
		}
		
		public int add(int v) {
			ans+=v;
			return ans;
		}		
		
		public int sub(int v) {
			ans-=v;
			return ans;
		}
		
		public int ans() {
			return ans;
		}
		
		public int div(int a,int b) {
			if (b==0) {
				throw new ArithmeticException("no puedes dividir por 0");
			}
			ans=a/b;
			return ans;
		}
		
		public void operacionOptima() {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//
//			}
			
			for(;;);
			
		}
		
		public void clear() {
			 ans = 0;
		}
	}

