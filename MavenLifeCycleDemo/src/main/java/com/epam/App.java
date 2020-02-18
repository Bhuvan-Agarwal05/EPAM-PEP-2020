import java.util.*;
abstract class Chocolate
{
	protected int weight,batchId;
	protected float price;
	protected String name;
	public Chocolate(int weight,int batchId,float price,String name)
	{
		this.weight=weight;
		this.batchId=batchId;
		this.price=price;
		this.name=name;
	}
	abstract public int getWeight();
}

class DairyMilk extends Chocolate
{	
	public DairyMilk(int weight,int batchId,float price,String name)
	{
		super(weight,batchId,price,name);
	}
	public int getWeight()
	{
		return weight;
	}
}

class Kitkat extends Chocolate
{	
	public Kitkat(int weight,int batchId,float price,String name)
	{
		super(weight,batchId,price,name);
	}
	public int getWeight()
	{
		return weight;
	}
}

class Munch extends Chocolate
{	
	public Munch(int weight,int batchId,float price,String name)
	{
		super(weight,batchId,price,name);
	}
	public int getWeight()
	{
		return weight;
	}
}

public class App
{
    public static void main(String[] args)
    {
    	Scanner in=new Scanner(System.in);
    	int weight,batchId,i,j,flag;
    	float price;
    	String name;
    	int totalNumberOfChocolates=3;
    	Chocolate c[]=new Chocolate[totalNumberOfChocolates];  // Array Of Objects
    	
      System.out.println("Enter the Name Of the First Chocolate: ");
      name=in.nextLine();
      System.out.println("Enter the Weight of 1 "+name+" Chocolate: ");
      weight=in.nextInt();
      System.out.println("Enter the BatchId of "+name+" Chocolate: ");
      batchId=in.nextInt();
      System.out.println("Enter the Price of 1 "+name+" Chocolate: ");
      price=in.nextFloat();
      in.nextLine();
       c[0]= new DairyMilk(weight,batchId,price,name);
      
       System.out.println("Enter the Name Of the Second Chocolate: ");
       name=in.nextLine();
      System.out.println("Enter the Weight of 1 "+name+" Chocolate: ");
      weight=in.nextInt();
      System.out.println("Enter the BatchId of "+name+" Chocolate: ");
      batchId=in.nextInt();
      System.out.println("Enter the Price of 1 "+name+" Chocolate: ");
      price=in.nextFloat();
      in.nextLine();
      c[1]= new Kitkat(weight,batchId,price,name);
      
      System.out.println("Enter the Name Of the Third Chocolate: ");
      name=in.nextLine();
      System.out.println("Enter the Weight of 1 "+name+" Chocolate: ");
      weight=in.nextInt();
      System.out.println("Enter the BatchId of "+name+" Chocolate: ");
      batchId=in.nextInt();
      System.out.println("Enter the Price of 1 "+name+" Chocolate: ");
      price=in.nextFloat();
      in.nextLine();
       c[2]= new Munch(weight,batchId,price,name);
      
      Chocolate temp=null;
      // Sorting Chocolates According to their Weights
      
       for(i=0;i<totalNumberOfChocolates-1;i++)
       {
    	   flag=0;
    	   for(j=0;j<totalNumberOfChocolates-1-i;j++)
    	   {
    		   if(c[j].getWeight() > c[j+1].getWeight())
    		   {
    			   temp=c[j+1];
    			   c[j+1]=c[j];
    			   c[j]=temp;
    			   flag=1;
    		   }
    	   }
    	   if(flag==0)
    		   break;
       }
       
       for(i=0;i<3;i++)
       {
    	   System.out.println(c[i].name+" "+c[i].getWeight());
       }   
    }
}

