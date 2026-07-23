class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedS = new StringBuilder("");
        for (String s : strs) {
            encodedS.append(s.length()).append("#").append(s);
        }
        return encodedS.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedS = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            decodedS.add(str.substring(j + 1, j + length + 1));
            i = j + length;
        }
        return decodedS;
    }
}
