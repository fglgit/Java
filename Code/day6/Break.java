import java.util.Scanner;
public class Break{
	public static void main(String[] args){
		int time=0;
		while(true){
			time++;
			if((int)(Math.random()*100)+1==97)
				break;
		}
		System.out.println("time="+time);

		lable1:
		for(int j=0;j<4;j++){
			lable2:
				for(int i=0;i<10;i++){
					if(i==2){
						break lable1;
					}
					System.out.println("i="+i);
				}
		}

		System.out.println("**********************");
		lable3:
		for(int j=0;j<4;j++){
			lable4:
				for(int i=0;i<10;i++){
					if(i==2){
						break;
					}
					System.out.println("i="+i);
				}
		}

		Scanner myScanner=new Scanner(System.in);
		for(int i=1;i<4;i++){
			String name;
			String keyword;
			System.out.print("�û�����");
			name=myScanner.next();
			System.out.print("���룺");
			keyword=myScanner.next();
			if(name.equals("����")&&keyword.equals("666")){
				System.out.println("��ӭ����");
				break;
			}
			System.out.println("��¼��Ϣ����");
		}
	}
}