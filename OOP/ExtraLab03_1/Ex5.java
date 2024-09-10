public class Ex5 {
    public static String capitalizeFullName(String fullName) {
        StringBuilder sb = new StringBuilder();
        String[] words = fullName.split("\\s+");
        
        for (String word : words) {
            char firstChar = Character.toUpperCase(word.charAt(0));
            String capitalizedWord = firstChar + word.substring(1);
            sb.append(capitalizedWord).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String fullName = "le thanh nhan";
        String capitalizedFullName = capitalizeFullName(fullName);
        System.out.println(capitalizedFullName);
    }
}
