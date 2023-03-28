// Write a program that demonstrates the use of the super keyword in method
// overriding.
// Define a superclass called Animal with a method called speak() that prints
// "Animal speaks".
// Define a subclass called Dog that extends Animal and overrides the speak()
// method to print "Dog barks".
// In the Dog class, call the speak() method of the Animal class using the super
// keyword.

class Animal{

  void speak(){
    System.out.println("Animal speaks");
  }
}

  class Dog extends Animal{
    void Speak(){
     super.speak();
System.out.println("Dog Barks");

  }
  }

class AnimalSpeak{
public static void main(String args[]){
  Dog D=new Dog();
    D.Speak();
  }
}


