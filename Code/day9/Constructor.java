public class Constructor{
	public static void main(String[] args){
		Person p=new Person("Smith",80);
		Person P=new Person();
		Person q=new Person("Smith");
		Person Q=new Person("Smith",18,'��');
		System.out.println("������"+p.name+" ���䣺"+p.age);
		System.out.println("������"+P.name+" ���䣺"+P.age);
		System.out.println("������"+Q.name+" ���䣺"+Q.age+" �Ա�"+Q.gender);
		System.out.println("p��hashCode��"+p.hashCode());
		System.out.print("this��hashCode��");
		p.code();
		System.out.println("p��hashCode��"+q.hashCode());

	}
}
class dog{
	//dog(){}
	//Ĭ�Ϲ�����������new dog()�ͽ��͵�ͨ��
}
class Person{
	String name;
	int age;
	char gender;
	//������û�з���ֵ��Ҳ����void
	//���������ƺ���һ��
	//�β��б�ͳ�Ա����һ��
	public Person(String pname,int page){
		System.out.println("������������~��ʱ�����Ѿ���ʼ����");
		name=pname;
		age=page;
	}
	public Person(String pname){
		System.out.println("������������~��ʱ�����Ѿ���ʼ����");
		name=pname;
	}
	public Person(){
		System.out.println("������������~��ʱ�����Ѿ���ʼ����");
		age=18;
	}
	public Person(String name,int age,char gender){
		System.out.println("������������~��ʱ�����Ѿ���ʼ����");
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void code(){
		System.out.println(this.hashCode());
	}
}