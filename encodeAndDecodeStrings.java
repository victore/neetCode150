import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class encodeAndDecodeStrings {
    public static void main(String[] args) {
        String encoded = encode(Arrays.asList("Hello", "World"));
        System.out.println(encoded);
        List<String> decoded = decode(encoded);
        System.out.println(decoded);
    }

    // Encode a list of strings into a single string
    public static String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return Character.toString((char) 258);
        }
        String separate = Character.toString((char) 257);
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(separate);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    // Decode a single string into a list of strings
    public static List<String> decode(String s) {
        if (s.equals(Character.toString((char) 258))) {
            return new ArrayList<>();
        }
        String separate = Character.toString((char) 257);
        return Arrays.asList(s.split(separate, -1));
    }
}