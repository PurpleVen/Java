public class SampleSwitch
{
    public static void main(String[] args)
    {
        for(int x = 0; x<10; x++)
        {
            switch(x)
            {
                case 0:
                    System.out.println("I is zero !");
                    break;
                    case 1:
                        System.out.printf("I is one");
                        break;
                default:
                    System.out.printf("This is default case");
            }

        }

    }
}