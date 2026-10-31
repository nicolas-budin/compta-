package ch.louhan.compta;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Vérifie que la chaîne de build fonctionne : compilation, JUnit et Surefire.
 * Ce test disparaîtra quand les premiers tests comptables arriveront (itération 1).
 */
class SqueletteTest {

    @Test
    void laChaineDeBuildFonctionne() {
        assertTrue(true, "Maven compile et exécute les tests JUnit");
    }
}
