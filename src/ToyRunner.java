//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
            Toy dog = new Toy("Doggy",8);
            Toy Cat = new Toy("Cat",3);
            dog.setCount(5);
            Cat.setCount(8);
            System.out.println(dog.toString());
            System.out.println(Cat.toString());
	}
}