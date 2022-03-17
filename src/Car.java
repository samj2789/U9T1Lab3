public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean dropOffPassengers(int numOut)
  {
    if (numOut >= getPassengers())
    {
      return false;
    }
    else
    {
      int updatedNum = getPassengers() - numOut;
      setPassengers(updatedNum);
      return true;
    }
  }

  public void applyDiscount()
  {
    if (discountApplied = false)
    {
      if (electric = true)
      {
        discountApplied = true;
        setTollFee(getTollFee() * 0.5);
      }
    }
  }

  //GETTER METHODS
  public boolean isElectric()
  {
    return electric;
  }

  public boolean isDiscountApplied()
  {
    return discountApplied;
  }

  //toString
  public String toString()
  {
    String str = "";
    str += "License Plate: " + getLicensePlate() + "\n";
    str += "Toll Fee: " + getTollFee() + "\n";
    str += "Passengers: " + getPassengers() + "\n";
    str += "Electric?: " + electric + "\n";
    str += "Discount Applied?: " + discountApplied;
    return str;
  }
}