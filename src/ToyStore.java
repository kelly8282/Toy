//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
             toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
            String str[] = toys.split(" ");
            ArrayList<String> pov = new ArrayList<String>();
            boolean hold = null;
            for (int p=0;p<str.length;p++)
            {
                pov.add(str[p]);
            }
            for (int i=0;i<pov.size();i++)
            {
                for (int j=0;j<toyList.size();j++)
                {
                    if( pov.get(j).equals(toyList.get(j).getName()))
                    {
                        toyList.get(j).setCount(toyList.get(j).getCount()+1);
                        hold=true;
                    }
                }
                if (!hold)
                toyList.add(new Toy(pov.get(i),1));
                hold=false;
            }
            
	}
  
  	public Toy getThatToy( String nm )
  	{
            for (int i = 0; i < toyList.size(); i++) 
            {
                if (nm.equals(toyList.getName())) 
                {
                    return toyList;
                }
            }
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
            Toy blank;
            ArrayList<Toy> wor= toyList;
            for (int k=1; k<wor.size(); k++)
                if(wor.get(k).getCount()>wor.get(k-1).getCount())
                {
                blank = wor.get(k);
                wor.set(k,wor.get(k-1));
                wor.set(k-1,wor);
                }
            return wor.get(0).toString();
  	}  
  	} 
  
  	public void sortToysByCount()
  	{
            Toy bla;
            for (int i=1; i<toyList.size(); i++)
            {
                if(toyList.get(i).getCount()>toyList.get(i-1).getCount())
                {
                    bla = toyList.get(i);
                    toyList.set(i,toyList.get(i-1));
                    toyList.set(i-1,bla);
                }   
            }
  	}  
  	  
	public String toString()
	{
	   String huv"";
            for (int i =1; i < toyList.size(); i++)
            {
            huv+=toyList.get(i).toString()+" ";
            }
           return huv;
	}
}