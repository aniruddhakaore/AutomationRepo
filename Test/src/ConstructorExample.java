class ConstructorExample
{

    String name;
    int id;
 

    ConstructorExample(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public static void main (String[] args)
    {

        ConstructorExample c1 = new ConstructorExample("Rajkumar", 12345);
        System.out.println("Name :" + c1.name +
                           " and Id :" + c1.id);
    }
}