
public class Test {

	public static void main(String[] args) {
		
		//example_1
		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
	
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		//example_2
		Person jiro = new Person("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		//演習5-1
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		//演習5-2
		Person a = new Person(25);
		System.out.println(a.name);
		System.out.println(a.age);
		
		//演習5-3
		Person hanako = new Person("hanako", 17);
		System.out.println(hanako.name);
		System.out.println(hanako.age);

	}

}
