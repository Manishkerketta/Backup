package multithreading;

class Company
{
	int n;
	boolean f=false;
	//producer and consumer problem using multithreading
	// f=false: chance: producer
	//f=true: chance :consumer
	synchronized public void produce_item(int n)throws Exception
	{
		if(f)
		{
			wait();
		}
		this.n=n;
		System.out.println("Produced : "+n);
		f=true;
		notify();
	}

	synchronized public void consume_item()throws Exception
	{
		if(!f)
		{
			wait();
		}
		System.out.println("Consumed : "+n);
		f=false;
		notify();
		//return this.n;
	}
}
