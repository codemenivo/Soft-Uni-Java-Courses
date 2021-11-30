package Exercises_06_Objects_and_Classes;

public class Vehicle {
   private String type;
   private String model;
   private String color;
   private int horsepower;

   public Vehicle(String type, String model, String color, int horsepower) {
      this.type = type;
      this.model = model;
      this.color = color;
      this.horsepower = horsepower;
   }

   public String getModel() {
      return model;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getColor() {
      return color;
   }

   public int getHorsepower() {
      return horsepower;
   }

   @Override
   public String toString() {
      return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
              this.getType(), this.getModel(), this.getColor(), this.getHorsepower() );
   }
}
