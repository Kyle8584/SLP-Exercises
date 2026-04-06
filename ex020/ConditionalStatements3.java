public class ConditionalStatements3 {
    public static String getAnimal(String breed){
        if (breed.equals("husky") || breed.equals("shepherd") || breed.equals("beagle")){
            return "dog";
        } else if (breed.equals("siamese") || breed.equals("persian") || breed.equals("sphynx")){
            return "cat";
        } else {
            return "other";
        }
    }
}
