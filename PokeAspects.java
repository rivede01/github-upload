public class PokeAspects{
    public void aspects (
        int pokedexNumber,
        String name,
        String rarity,
        String type,
        Boolean holoFoilAvailable,
        int stage
        ) {
            System.out.println(
                "Pokedex Number: " + pokedexNumber + "\r\n"+
                "Pokemon: " + name + "\r\n"+
                "Rarity: "+ rarity + "\r\n"+
                "Type: "+ type + "\r\n"+
                "Holofoil Available?: "+ holoFoilAvailable + "\r\n"+
                "Stage: "+ stage + "\r\n"
                );
        }
}