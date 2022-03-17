public class Vehicle
{
  private String licensePlate;
  private double tollFee;
  private int passengers;
  
  public Vehicle(String licensePlate, double tollFee, int passengers)
  {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
  }
  
  public double calculateTollPrice()
  {
    return tollFee * passengers;
  }

  //SETTER METHODs
  public void setPassengers(int numPass)
  {
    passengers = numPass;
  }

  public void setTollFee(double newFee)
  {
    tollFee = newFee;
  }

  //GETTER METHODS
  public String getLicensePlate()
  {
    return licensePlate;
  }

  public double getTollFee()
  {
    return tollFee;
  }

  public int getPassengers()
  {
    return passengers;
  }
}