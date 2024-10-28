import libraries.Out;


public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Wählen Sie ein Jahr:");
        int jahr = libraries.In.readInt();

        Out.println("Wählen Sie einen Monat:");
        int monat = libraries.In.readInt();

        boolean datumPasst = dateValid(jahr, monat);

        if (datumPasst) {
            int daysInMonth = checkDaysInMonth(jahr, monat);
            Out.println("Dein Monat hat " + daysInMonth + " Tage");
        }

    }
    public static boolean dateValid(int jahr, int monat) {
        if (jahr < 0 && (monat > 12 || monat < 0)) {
            Out.println(jahr + " ist weder ein valides Jahr, noch ist " + monat + " ein valider Monat!");
            return false;
        } else if (jahr < 0) {
            Out.println(jahr + " ist kein valides Jahr!");
            return false;
        } else if ( monat > 12 || monat < 0) {
            Out.println(monat + " ist kein valider Monat!");
            return false;
        }
        return true;
    }

    public static int checkDaysInMonth(int jahr, int monat) {
        int daysInMonth = 0;

        switch (monat) {
            case 1, 3, 5, 7, 8, 10, 12 -> daysInMonth = 31;
            case 4, 6, 9, 11 -> daysInMonth = 30;
            case 2 -> {
                if ((jahr % 4 == 0 && jahr % 100 != 0) || jahr % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            }

        }
        return daysInMonth;
    }
}
