public class Ex6 {
    public static String formatName(String fullName) {
        fullName = fullName.trim();
        StringBuilder formattedName = new StringBuilder();
        String[] nameParts = fullName.split("\\s+");
        for (String namePart : nameParts) {
            formattedName.append(namePart).append(" ");
        }
        formattedName.setLength(formattedName.length() - 1);
        return formattedName.toString();
    }

    public static void main(String[] args) {
        String fullName = "  Le   Thanh    Nhan   ";
        String formattedName = formatName(fullName);
        System.out.println(formattedName); 
    }
}
