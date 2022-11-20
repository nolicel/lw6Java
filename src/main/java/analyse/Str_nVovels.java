package analyse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str_nVovels implements Str_Analyser {
    @Override
    public int strAnalyse(String str) {
        Pattern vocals = Pattern.compile("(?iu)[пбтдкфвсзлмнхрй]");
        Matcher m = vocals.matcher(str);
        int vocalCounter = 0;
        while (m.find()) {
            vocalCounter++;
        }
        return vocalCounter;
    }

}
