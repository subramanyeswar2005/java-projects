package javaprojects;

abstract class car {
	abstract void start();//accelerate();//
	abstract void drive();//braek();//
	abstract void stop();//changegear(Sring gear);//

}
class drivercar extends car{
	void start() {
		System.out.println("the car is started");
	}
	void drive() {
		System.out.println("the car is driwen by driver");
	}
	void stop() {
		System.out.println("the car is stop");
	}	
}
public class Carr{
	public static void main(String[]args) {
		car mycar=new drivercar();
		mycar.start();
		mycar.drive();
		mycar.stop();
	}
}


