class AirWayTester{
public static void main(String[] args)
{
AirWay airWay=new AirWay();



AirWay airWay1=new AirWay("Dheli","Mumbai",35667);
System.out.println(airWay1.arrival);
System.out.println(airWay1.departure);
System.out.println(airWay1.flightNo);

AirWay airWay2=new AirWay("Goa","KIA",56745);
 airWay2=airWay1;
System.out.println(airWay2.arrival);
System.out.println(airWay2.departure);
System.out.println(airWay2.flightNo);
}

}