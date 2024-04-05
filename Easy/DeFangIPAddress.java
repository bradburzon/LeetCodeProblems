public class DeFangIPAddress {

    public String deFangIPAddress(String address) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                ans.append(address.charAt(i));
            } else {
                ans.append("[.]");
            }
        }
        return ans.toString();
    }
}