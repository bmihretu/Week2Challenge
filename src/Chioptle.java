import java.util.ArrayList;
import java.util.Random;
        /*Write a program that will allow a robot to assemble 25 burritos.
       Use a random generator for each burrito option and build a list of 25 burrito customizations:
        */
   public class Chioptle{
       //random tool
        private static Random rand = new Random();
        //variables array
        //visible instance
        private static String[]  rice = {"White", "Brown", "No"};
        private static String[] meat = {"Chicken", "Steak", "Carnidas", "Chorizo", "Sofritas", "Veggies"};
        private static String[] beans = {"Black", "Pinto", "No"};
        private static String[] veggies = {"Lettuce", "Fajita Veggies", "No Veggies", "Lettuce and Fajita Veggies"};
        private static String[] salsa = {"Hot", "Medium", "Mild", "No", "Hot, Medium, and Mild"};
        //declare
        private static int foodtype = 0;
        private static double cost =0;
        private static double total =0;
        //String State
        private static String riceChoice;
        private static String meatChoice;
        private static String beansChoice;
        private static String veggiesChoice;
        private static String salsaChoice;
        private static String cheeseChoice;
        private static String guacChoice;
        private static String quesoChoice;
        private static String sourCreamChoice;

        //method should not have a return value
     public static void main(String[] args) {
         //arylst
            ArrayList<String> output = new ArrayList<>();
        //increment value
        //Run Burrito 25x
      for (int j = 1; j <= 25; j++) {
          //choices
         foodtype =0;
         meat();
         rice();
         salsa();
         veggies();
         beans();
         cheese();
         guac();
         queso();
         sourCream();
         cost();
         //calculations

          output.add("Burrito " + j + ":\t" + riceChoice + " rice, " +
            "" + meatChoice + ", " +
                  "" + salsaChoice + " salsa, " + beansChoice + " beans, "
            + veggiesChoice + cheeseChoice + guacChoice + quesoChoice + sourCreamChoice + "\t" +



            "" +
                  ("The  Meal Price is: $" +cost ));
            }

            for (String burrito : output) {
                System.out.println(burrito);
            }
            System.out.println("Total cost is:\t$"+total);
        }

        private static void rice() {
            int riceRand = rand.nextInt(3);
            riceChoice = rice[riceRand];
            if(riceRand!= 2){
                foodtype++;
            }
        }

        private static void beans() {
            int beansRand = rand.nextInt(3);
            beansChoice = beans[beansRand];
            if (beansRand !=2)
            {foodtype++;
            }
        }
        private static void salsa() {
            int salsaRand = rand.nextInt(5);
            salsaChoice = salsa[salsaRand];

            if(salsaRand==4){
                foodtype+=3;
            }
            else if (salsaRand != 3)
                foodtype++;
        }
        private static void veggies() {
            int veggiesRand = rand.nextInt(4);
            veggiesChoice = veggies[veggiesRand];
            if(veggiesRand==3){
                foodtype+=2;
            }
            else if(veggiesRand !=2) {
                foodtype++;
            }
        }
        private static void meat() {
            int meatRand = rand.nextInt(6);
            meatChoice = meat[meatRand];
            foodtype++;
        }private static void queso() {
                int randQueso = rand.nextInt(2);
                if (randQueso == 0) {
                    quesoChoice = ", Queso.";
                    foodtype++;
                } else {
                    quesoChoice = "";
                }
            }
        private static void cheese() {
            int randCheese = rand.nextInt(2);
            if (randCheese == 0) {
                cheeseChoice = ", Cheese.";
                foodtype++;
            } else {
                cheeseChoice = "";
            }
        }
        private static void guac() {
            int randQuac = rand.nextInt(2);
            if (randQuac == 0) {
                guacChoice = ", Guac.";
                foodtype++;
            } else {
                guacChoice = "";
            }
        }


        private static void sourCream() {
            int randSourCream = rand.nextInt(2);
            if (randSourCream == 0) {
                sourCreamChoice = ", Sour Cream.";
                foodtype++;
            } else {
                sourCreamChoice = "";

            }
        }
        //cost of food
        private static void cost(){
            cost = ((foodtype*.50) + 3.00);
            total+=cost;
        }
        //end main
}//end class
