import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaTask1 {
    public static void main(String[] args) {
        findingVowels("Жили-были три китайца: Як, Як-цедрак, Як-цедрак-цедрак-цедрони. " +
                "Жили-были три китайки: Цыпа, Цыпа-дрыпа, Цыпа-дрыпа-дрымпампони. " +
                "Все они переженились: Як на Цыпе, Як-цедрак на Цыпе-дрыпе, " +
                "Як-цедрак-цедрак-цедрони на Цыпе-дрыпе-дрымпампони. " +
                "И у них родились дети. У Яка с Цыпой — Шах, у Яка-цедрака с Цыпой-дрыпой — Шах-шарах, " +
                "у Яка-цедрака-цедрака-цедрони с Цыпой-дрыпой-дрымпампони — Шах-шарах-шарах-широни. " +
                "asda ljnasd ad ad kjasd alka o asd");
    }

    public static void findingVowels (String text) {
        String vowels = "aeiouAEIOUиаоуыэяёеюИАОУЫЭЯЁЕЮ";
        Pattern pattern = Pattern.compile(" [" + vowels + "]+[\\S&&[^.,?!:()]]*");
        Matcher matcher = pattern.matcher(" " + text);
        while (matcher.find()) {
            System.out.println(matcher.group().trim());
        }
    }
}