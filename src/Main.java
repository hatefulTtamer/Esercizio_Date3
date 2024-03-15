/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
*/

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Year: " + date1.getYear());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Day: " + date1.getDayOfMonth());
        System.out.println("Day of the week: " + date1.getDayOfWeek());

    }
}