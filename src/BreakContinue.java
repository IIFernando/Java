public class BreakContinue {
    public static void main(String[] args) {
        
        for(int i =1; i <= 5; i++)
        {
            System.out.println(i);

            if(i == 3)
            {
                //System.out.println("Parou no break");
                //break;
                System.out.println("Passou pelo continue");
                continue;
            }
        }
    }
}
