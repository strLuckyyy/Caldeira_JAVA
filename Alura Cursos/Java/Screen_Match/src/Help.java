public class Help {
    public StringBuilder split(int quantity) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < quantity; i++) {
            line.append("-");
        }
        return line;
    }
}
