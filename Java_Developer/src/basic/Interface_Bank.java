package basic;

interface Interface_Bank 
{
    int getRateOfInterest();
}

class SBI implements Interface_Bank
{
    public int getRateOfInterest() 
    {
        return 6;
    }
}

class Axis implements Interface_Bank 
{
    public int getRateOfInterest()
    {
        return 5;
    }
}

class BOB implements Interface_Bank 
{
    public int getRateOfInterest() 
    {
        return 4;
    }
}