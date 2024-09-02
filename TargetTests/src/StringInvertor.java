import java.util.ArrayList;

public class StringInvertor {

    public void invertor(String string){
        System.out.println( "----------------------");
        System.out.println(invertedString(string));
        }

    public String invertedString (String string){
        String str = null;
        ArrayList<String> charList = new ArrayList<>();
        StringBuilder strB = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--){
            String temp = String.valueOf(string.charAt(i));
            charList.add(temp);
        }

        for (String ch:charList){
            str = String.valueOf(strB.append(ch));
        }

        return str;
        }

    }


