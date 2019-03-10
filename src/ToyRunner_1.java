//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
            ToyStore wooo= new ToyStore();
            wooo.loadToys("Bling da ling ding dong ding weeee");
            wooo.loadToys("Whoopsie Doopsie Daisy");
            System.out.println(wooo.toString());
            System.out.println(wooo.getThatToy("Bling").toString());
            System.out.println(wooo.getMostFrequentToy());
            wooo.sortToysByCount();
            System.out.println(wooo.toString());
	}
}