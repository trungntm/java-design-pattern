package com.trungntm;

public class RoadLogistics extends Logistics {

  @Override
  public Transport createTransport() {
    return new Truck();
  }
}
