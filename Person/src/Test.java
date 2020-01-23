
public class Test {
	public static void main(String[] args){
	Person taro = new Person();
	taro.name = "山田太郎" ;
	taro.age = 20;
	taro.phoneNumber = "090";
	taro.address = "xxxx@xxx.com";

	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);
	taro.talk();
	taro.walk();
	taro.run();

	Person jiro = new Person();
	jiro.name = "木村次郎";
	jiro.age = 18;
	System.out.println(jiro.name);
	System.out.println(jiro.age);

	Person hana = new Person();
	hana.name = "鈴木花子";
	hana.age =16;
	System.out.println(hana.name);
	System.out.println(hana.age);

	Person me = new Person();
	me.name = "佐藤";
	me.age = 22;
	System.out.println(me.name);
	System.out.println(me.age);



	Robot aibo = new Robot();
	aibo.name = "aibo";
	aibo.talk();
	aibo.walk();
	aibo.run();

	Robot asimo = new Robot();
	asimo.name = "asimo";
	asimo.talk();
	asimo.walk();
	asimo.run();

	Robot pepper = new Robot();
	pepper.name = "pepper";
	pepper.talk();
	pepper.walk();
	pepper.run();
	}
}
