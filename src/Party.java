public class Party {
    public static void main(String[] args) {
        String partyAffiliation;

        System.out.println("Enter your party affiliation: [D/R/I]");
        partyAffiliation = "A";



        if (partyAffiliation.equalsIgnoreCase("D")){
            System.out.println("You are a Donkey!");

        } else if (partyAffiliation.equalsIgnoreCase("R")){
            System.out.println("You are an Elephant!");
        } else if (partyAffiliation.equalsIgnoreCase("I")){
            System.out.println("You are a person!");
        } else {
            System.out.println("You chose other.");
        }
    }
}
