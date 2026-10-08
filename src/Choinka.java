public class Choinka {
    public static void main(String[] args) {
        String wysokosc = args[0];
        int wysokosc2 = Integer.parseInt(wysokosc);
        for (int i=0; i < wysokosc2; i++) {
            for (int b=0; b<=i; b++){
                System.out.print("*");


            }



            System.out.print("\n");
        }

    }
}