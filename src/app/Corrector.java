package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1; //з 1 для нумерації
        for (String str : strs) {
            // перевірка наявності символу 'b' та його заміна
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }
            stringBuilder.append(count).append(") ").append(str).append("\n");
            count++;
        }
        return stringBuilder.toString();
    }
}
