class mthdovd
{
	public void a()
	{
		System.out.println("welcome to method overloading");
	}
	public void a(int a)
	{
		System.out.println(a);
	}
	public void a(int a,int b)
	{
		System.out.println(a+b);
	}
	public void a(int a,float b)
	{
		System.out.println(a+b);
	}
	public void a(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
    public static void main(String args[])
	{
		mthdovd obj=new mthdovd();
		obj.a();
		obj.a(999);
		obj.a(999,1);
		obj.a(999,1.0f);
		obj.a(1,2,5);
	}
}
