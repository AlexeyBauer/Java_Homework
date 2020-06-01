import java.util.function.Function;
import java.util.function.Predicate;

public class TransformatorS {

    public static void main(String[] args) {

        String sentence = "miR Trud May";

        Predicate<String> p = s -> s.length() == 3;
        Function<String, String> f = s -> s.toUpperCase();
        String Demo = TransformatorS.transform(sentence, p, f);

        System.out.println(sentence);
        System.out.println(Demo);
    }

    public static String transform(String sentence, Predicate<String> p, Function<String, String> f) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (p.test(word)) words[i] = f.apply(word);
        }
        return String.join(" ", words);
    }

}