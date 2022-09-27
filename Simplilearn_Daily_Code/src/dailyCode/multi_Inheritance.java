package dailyCode;
class car
{
	int carNumber=6969;
	String carName="Maruti";
	String carColour="Red";
	String carRating="****";
}
class bike extends car
{
	int bikeNumber=9999;
	String bikeName="Pulsar";
	String bikeColour="Black";
	String bikeRating="#####";
}

public class multi_Inheritance extends bike
{
	public static void main(String args[])
	{
		multi_Inheritance multi_in=new multi_Inheritance();
		System.out.println("Name of Bike:-\t"+multi_in.bikeName+"\tBike number :-\t"+multi_in.bikeNumber+
				"\tBike Colour :-\t"+multi_in.bikeColour+"\tBike Rating :-\t"+multi_in.bikeRating);
		System.out.println("Name of Car :-\t"+multi_in.carName+"\tCar Number :-\t"+multi_in.carNumber+
				"\tCar Colour :-\t"+multi_in.carColour+"\tCar Rating :-\t"+multi_in.carRating);
	}
}
