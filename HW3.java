package edu.monmouth.hw3;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;
import java.awt.print.Book;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.File;



public class HW3 
{
  public static void main(String[] args)
  {
  try 
  {
	  PrintStream directLink = new PrintStream(HW2Constants.OUT_TO);
	  System.setOut(directLink);
	  System.setErr(directLink);
  }
  catch(FileNotFoundException none)
  {
  	List<String> stringObjects = new ArrayList<String>();
  	List<String> stringObjects1 = new LinkedList<String>();
  	try 
  	{
  		Scanner stringFile  = new Scanner (new stringFile (HW2Constants.FIRST_FILE));
  		while (stringFile.hasNext())
  		{
  			String file1 = stringFile.nextLine();
  			System.out.println(" Deriveed from " + file1 + HW2Constants.FIRST_FILE );
  			stringObjects.add(file1);
  			stringObjects1.add(file1);
  	}
  		stringFile.close();
  	}
  		catch (BookException none)
  		{
  			System.err.println("Did not create a book object");
  			none.printStackTrace();
  			System.out.println();
  		}
  	List<String> stringObjects = new ArrayList<String>();
  	List<String> stringObjects1 = new LinkedList<String>();
  	try
  	{
  		Scanner stringBook = new Scanner (new stringBook (HW2Constants.SECOND_FILE));
  		while (stringBook.hasNext())
  		{
  			String file1 =stringFile.nextLine();
  			System.out.println(" Deriveed from " + file1 + HW2Constants.SECOND_FILE );
  			String [] numbers = file1.split(HW2Constants.SPACE);
  	  		String books = numbers[0];
  	  		BookTypes types = null;
  	  		if (numbers[1].equals("HARDBACK"))
  	  		{
  	  			types = BookTypes.HARDBACK;
  	  		}
  	  		else if (numbers[1].equals("SOFTBACK"))
  	  		{
  	  			types= BookTypes.SOFTBACK;
  	  		}
  	  		int numberOfPages =  Integer.parseInt(numbers[0]);
  	  		double price = Double.parseDouble(numbers[0]);
  	  		try 
  	  		{
  	  			Book books =  new Book (numberOfPages, price, title, bookType);
  	  			bookObjects.add(books);
  	  			bookObjects1.add(books);	
  		}
  	  		catch (BookException none)
  	  		{
  	  			System.err.println( "Did not create book object");
  	  			none.printStackTrace();
  	  			System.out.print("none");
  	  		}
  	  		stringBook.close();
  	}
  	}
  		catch (BookException none) 
  		{
  			System.err.println("Did not work" + HW2Constants.SECOND_FILE  );
  			none.printStackTrace();
  			System.exit(1);
  		}

System.out.println("Output for string array using isEmpty:  "  + stringObjects.isEmpty());
System.out.println("Output for book array using isEmpty: " + bookObjects.isEmpty());
System.out.println("Output for string array using remove:  "  + stringObjects.remove());
System.out.println("Output for book array using remove: " + bookObjects.remove());
System.out.println("Output for string array using size:  "  + stringObjects.size());
System.out.println("Output for book array using size: " + bookObjects.size());
System.out.println("For the iterator on the book array list: ");
for (String iteratorBook : stringObjects)
{
	System.out.println(iteratorBook);
	
}
System.out.println("For the iterator on the string array list: ");
for (String iteratorString : stringObjects )
{
	System.out.println(iteratorString);
	
}
System.out.println("ListIterator for string array list(using to iterate in reverse order");
ListIterator<String> listIteratorString = stringObjects.listIterator(stringObjects.size());
while (listIteratorString.hasPrevious())
{
	System.out.println(listIteratorString.previous());
	
}
System.out.println("ListIterator for book array list(using to iterate in reverse order");
ListIterator<String> listIteratorBook = bookObjects.listIterator(bookObjects.size());
while (listIteratorBook.hasPrevious())
{
	System.out.println(listIteratorBook.previous());
}
System.out.println("ListIterator for book linkedlist(using to iterate in reverse order");
ListIterator<String> linkedlistIteratorBook = bookObjects1.listIterator(bookObjects1.size());
while (linkedlistIteratorBook.hasPrevious())
{
	System.out.println(linkedlistIteratorBook.previous());
}
System.out.println("ListIterator for string linkedlist(using to iterate in reverse order");
ListIterator<String> linkedlistIteratorString = stringObjects1.listIterator(stringObjects1.size());
while (linkedlistIteratorString.hasPrevious())
{
	System.out.println(linkedlistIteratorString.previous());
}
System.out.println("ListIterator for string linked list");
for(String iteratorString : stringObjects1)
{
	System.out.println(iteratorString);
}
System.out.println("ListIterator for book linked list");
for(String iteratorBook : stringObjects1)
{
	System.out.println(iteratorBook);
}
}
  }
}




