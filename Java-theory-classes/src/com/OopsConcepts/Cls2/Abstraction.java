package com.OopsConcepts.Cls2;
//  Abstraction

abstract class Bird{

      abstract void fly();
      abstract void eat();
    }
abstract class Eagle extends Bird{

    void fly() {
        System.out.println("Eagle flies at higher heights");
    }
}
abstract class Sparrow extends Bird{

    void fly() {
        System.out.println("Sparrow flies at medium heights");
    }
}
class SerpentEagle extends Eagle{

      void eat(){
          System.out.println("SerpentEagle eats snakes");
      }
}
class OceanEagle extends Eagle{

      void eat() {
          System.out.println("OceanEagle eats fishes");
    }
}
class VegSparrow extends Sparrow{

    void eat() {
        System.out.println("VegSparrow eats grains ");
    }
}
class NonVegSparrow extends Sparrow{

    void eat() {
        System.out.println("NonVegSparrow eats insects");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        SerpentEagle se=new SerpentEagle();
        OceanEagle oe=new OceanEagle();
        VegSparrow ve=new VegSparrow();
        NonVegSparrow nve=new NonVegSparrow();

        se.fly();
        se.eat();

        oe.fly();
        oe.eat();

        ve.fly();
        ve.eat();

        nve.fly();
        nve.eat();
    }
}
