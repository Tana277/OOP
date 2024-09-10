public class StringEx {
    public static void main(String[] args) {
        String fullName = "Le Thanh Nhan";

        // Count number of words
        int wordCount = countWords(fullName);
        System.out.println("Number of words in the name: " + wordCount);

        // Get first name
        String firstName = getFirstName(fullName);
        System.out.println("First name: " + firstName);

        // Get last name
        String lastName = getLastName(fullName);
        System.out.println("Last name: " + lastName);

        // Get middle name
        String middleName = getMiddleName(fullName);
        System.out.println("Middle name: " + middleName);
    }

    public static int countWords(String fullName) {
        String[] words = fullName.split(" ");
        return words.length;
    }

    public static String getFirstName(String fullName) {
        String[] words = fullName.split(" ");
        return words[words.length - 1];
    }

    public static String getLastName(String fullName) {
        String[] words = fullName.split(" ");
        return words[0];
    }

    public static String getMiddleName(String fullName) {
        String[] words = fullName.split(" ");
        if (words.length > 2) {
            StringBuilder middleName = new StringBuilder();
            for (int i = 1; i < words.length - 1; i++) {
                middleName.append(words[i]).append(" ");
            }
            return middleName.toString().trim();
        } else {
            return "";
        }
    }
}


