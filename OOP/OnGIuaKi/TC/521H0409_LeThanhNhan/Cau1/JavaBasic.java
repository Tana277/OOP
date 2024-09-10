public class JavaBasic {
    public static int sumNegativeElements(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static String uppercaseFirstVowels(String str) {
        StringBuilder result = new StringBuilder();
        // Duyệt qua từng ký tự trong chuỗi đầu vào
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Kiểm tra xem ký tự hiện tại có phải là nguyên âm đầu tiên của từ không
            if (i == 0 || !Character.isLetter(str.charAt(i - 1))) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    // Nếu là nguyên âm đầu tiên, chuyển đổi thành chữ hoa và thêm vào kết quả
                    result.append(Character.toUpperCase(ch));
                    continue;
                }
            }
            // Thêm ký tự hiện tại vào kết quả
            result.append(ch);
        }
        // Trả về kết quả dạng chuỗi
        return result.toString();
    }
    

    public static int findMinNegativeElement(int[] a) {
        int minNegative = a[0]; 
        int minNegativeIndex = -1;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 && a[i] < minNegative) {
                minNegative = a[i];
                minNegativeIndex = i;
            }
        }
        return minNegativeIndex;
    }

    public static String getName(String str) {
        // Tìm vị trí của dấu hai chấm trong chuỗi
        int colonIndex = str.indexOf(':');

        // Kiểm tra nếu không tìm thấy dấu hai chấm, trả về chuỗi rỗng
        if (colonIndex == -1) {
            return "";
        }

        // Trích xuất phần họ tên sau dấu hai chấm (substring) và loại bỏ khoảng trắng ở đầu và cuối chuỗi (trim)
        String name = str.substring(colonIndex + 1).trim();

        return name;
    }

    public static int findFirstMod3Element(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 && a[i] % 3 == 0) {
                return i;
            }
        }
        return -1;
    }
    

    public static int countString(String str, String k) {
        // Chuyển đổi cả chuỗi str và k về chữ thường để không phân biệt chữ hoa chữ thường
        str = str.toLowerCase();
        k = k.toLowerCase();

        int count = 0;

        // Tách chuỗi str thành các từ bằng cách sử dụng khoảng trắng làm dấu phân cách
        String[] words = str.split(" ");

        // Duyệt qua từng từ trong mảng words
        for (String word : words) {
            // Nếu từ hiện tại trùng khớp với k, tăng biến đếm lên 1
            if (word.equals(k)) {
                count++;
            }
        }

        // Trả về số lượng từ k trong chuỗi str
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, -2, 3, 4, -2, 1, -9};
        int sum = sumNegativeElements(a);
        System.out.println("Sum of negative elements: " + sum);

        int min = findMinNegativeElement(a);
        System.out.println("Find min negative element: " + min);

        int find = findFirstMod3Element(a);
        System.out.println("Find first mod 3 element: " + find );
        String s = "nguyen thi uyen an";
        String uppercaseVowels = uppercaseFirstVowels(s);
        System.out.println("Uppercase first vowels: " + uppercaseVowels);

        String s1 = "Ho ten: Nguyen Thi Anh Dao";
        String name = getName(s1);
        System.out.println("Name: " + name);

        String s2 = "Nguyen Phuong Hoang Anh Phuong Oanh";
        int count = countString(s2, "Phuong");
        System.out.println("Count: " + count);
    }
}
