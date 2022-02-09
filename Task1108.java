public class Task1108 {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));

    }

    public static String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i) == '.'){
                ans.append("[.]");
            }
            else{
                ans.append(address.charAt(i));
            }
        }
        return ans.toString();
    }
}
