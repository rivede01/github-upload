public class PokeList {
    public static void main(String[] args) {
        PokeAspects bulbasaur = new PokeAspects();
        bulbasaur.aspects (1, "Bulbasaur", "Common", "Grass", false, 1); 
        PokeAspects ivysaur = new PokeAspects();
        ivysaur.aspects (2, "Ivysaur", "Uncommon", "Grass", false, 2); 
        PokeAspects venusaur = new PokeAspects();
        venusaur.aspects (3, "Venusaur", "Rare", "Grass", true, 3); 
        PokeAspects charmander = new PokeAspects();
        charmander.aspects (4, "Charmander", "Common", "Fire", false, 1); 
        PokeAspects charmeleon = new PokeAspects();
        charmeleon.aspects (5, "Charmeleon", "Uncommon", "Fire", false, 2); 
        PokeAspects charizard = new PokeAspects();
        charizard.aspects (6, "Charizard", "Rare", "Fire", true, 3); 
    }
}

