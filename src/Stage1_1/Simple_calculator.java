package Stage1_1;

public class Simple_calculator {

    private final String[] tokens;
    private int pos;


    public Simple_calculator(String expr) {
        this.tokens = expr.split(",");
        this.pos = 0;
    }

    public double get_param(String[] token) {
        StringBuilder str = new StringBuilder();
        while (isNumeric(token[pos])) {
            str.append(token[pos]);
            if (pos == tokens.length-1){
                break;
            }
            else {
                pos++;
            }
        }
        return Double.parseDouble(str.toString());
    }

    public double calculate() {
        double first = multiply();
        while (pos < tokens.length) {
            String operator = tokens[pos];
            if (!operator.equals("+") && !operator.equals("-")) {
                break;
            } else {
                pos++;
            }
            double second = multiply();
            if (operator.equals("+")) {
                first += second;
            }
            if (operator.equals("-")) {
                first -= second;
            }
        }
        return first;
    }

    public double multiply() {
        double first =get_param(tokens);
        while (pos < tokens.length) {
            String operator = tokens[pos];
            if (!operator.equals("*") && !operator.equals("/")) {
                break;
            } else {
                pos++;
            }
            double second = get_param(tokens);
            if (operator.equals("*")) {
                first *= second;
            }
            if (operator.equals("/")) {
                first /= second;
            }
        }
        return first;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String putSpaceAfterSymbol(String text, char symbolAfter) {
        StringBuilder sb = new StringBuilder();
        if (text != null) {
            char posSymbol;
            for (int i = 0; i < text.length(); i++) {
                posSymbol = text.charAt(i);
                sb.append(posSymbol);
                sb.append(symbolAfter);
            }
        }
        return sb.toString();
    }
}
