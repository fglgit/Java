public class Continue{
	public static void main(String[] args){
		lb1:
		for(int j=0;j<4;j++){
		lb2:
			for(int i=0;i<4;i++){
				if(i==2){
					continue;
					//continue lb2;
					//continue lb1;
				}
				System.out.println("i="+i);
			}
		}
	}
}