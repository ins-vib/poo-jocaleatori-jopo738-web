package com.jocaleatori;

public interface MaquinaAleatoria {
    int llençar(); // aixo es un mètode ambstracte (no podem crear objectes d'aquest metode), pero no li posem que es obstracte, perque tots els metodes de un interficie són abstractes
    // és obligatori que el metode llençar estigui a tots els metodes els que es vol utilitzar
}
