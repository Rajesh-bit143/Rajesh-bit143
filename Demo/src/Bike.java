
public class Bike {

static int wheels=2;
String color="";
static void braking()
{
	System.out.println("bike halts when brakes appiled ");
	}
 void mileage(int s)
{
	System.out.println("mileage is "+ s+"kmph");
	}
public static void main (String [] args) {

Bike jawa=new Bike();
Bike RE=new Bike();
Bike Hero=new Bike();
//System.out.println("no.of wheels"+jawa.wheels);
//System.out.println("no.of wheels"+RE.wheels);
//System.out.println("no.of wheels"+Hero.wheels);
//jawa.color="black";
//RE.color="red";
//Hero.color="blue";
//System.out.println(""+jawa.color);
//System.out.println(""+RE.color);
//System.out.println(""+Hero.color);
jawa.braking();
RE.braking();
Hero.braking();

jawa.mileage(45);
RE.mileage(40);
Hero.mileage(50);

}
}