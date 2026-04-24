public class CommandLineDemo 
{
    public static void main(String[] args) 
    {
        if (args.length == 0) 
        {
            System.out.println("hello vaishnavi");
        } else 
        {
            for (String arg : args) 
            {
                System.out.println(arg);
            }
        }
    }
}