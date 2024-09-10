public class bai3 {
    public static void main(String[] args) {
        Student st = new Student(1, "Nhan", "Thanh");
        System.out.println(st.getID());
        System.out.println(st.getFirstName());
        System.out.println(st.getLastName());
        st.setID(2);
        st.setFirstName("Anh");
        st.setLastName("Nguyen");
        System.out.println(st.getName());
        System.out.println(st.toString());
    }
}

