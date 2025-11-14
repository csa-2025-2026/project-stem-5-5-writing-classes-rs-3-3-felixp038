public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private String SSN;

    public Person(String iFirst, String iLast, int iAge, String iSSN)
    {
        firstName = iFirst;
        lastName = iLast;
        age = iAge;
        SSN = iSSN;
    }

    public String getFirst()
    {
        return firstName;
    }

    public String getLast()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public String getSSN()
    {
        return SSN;
    }

    public void growUp()
    {
        age++;
    }

    public void getMarried(String upLast)
    {
        lastName = upLast;
    }

    public void identityFraud(String upFirst)
    {
        firstName = upFirst;
    }

    public String toString()
    {
        return "Name: " + firstName + " " + lastName + "\n\tSSN: " + SSN + "\n\tAge: " + age;
    }
}
