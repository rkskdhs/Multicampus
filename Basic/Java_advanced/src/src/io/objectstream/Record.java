package io.objectstream;
public class Record implements java.io.Serializable//추상메서드 없는 인터페이스 직렬화
{
	private String 	name;
	private int		age;
	private double	height;
	private char	bloodType;
	
	
	public Record( String _name, int _age, double _height, char _bloodType)
	{
		name 	= _name;
		age		= _age;
		height	= _height;
		bloodType = _bloodType;	
	}
	
	public String getName()
	{	return name;	}
	
	public int	getAge()
	{	return age;		}
	
	public double getHeight()
	{	return height;	}
	
	public char	getBloodType()
	{	return bloodType;}
		
			
}