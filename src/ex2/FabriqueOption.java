package ex2;

import java.util.HashMap;

public class FabriqueOption {
    protected HashMap<String, OptionVehicule> options = new HashMap<>();

    public OptionVehicule getOption(String nom) {
        OptionVehicule found = options.get(nom);
        if (found == null) {
            found = new OptionVehicule(nom);
            options.put(nom, found);
        }
        return found;
    }

}
