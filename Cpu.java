class Cpu
{
	int price;
	static class Processor
	{
		int cores;
		String producer;
		Processor (int noc,String manu)
		{
			cores=noc;
			producer=manu;
		}
	void display()
	{
		System.out.println("Processor information");
		System.out.println("No: of cores="+cores);
		System.out.println("Manufacturer="+producer);
	}
	}
	class Ram
	{
		int mem;
		String manuf; 
		Ram(int memory,String producer)
		{
			mem=memory;
			manuf=producer;
		}
	void display()
	{
		System.out.println("RAM infor");
		System.out.println("Memory="+mem);
		System.out.println("Manufacturer="+manuf);
	}
	}
	public static void main(String[] args)
	{
	Cpu.Processor obj1=new Cpu.Processor(8,"intel");
	Cpu obj2=new Cpu();
	Cpu.Ram obj3=obj2.new Ram(8,"Samsung");
	obj1.display();
	obj3.display();
	}
}
