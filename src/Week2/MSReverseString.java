package Week2;

class MSReverseString {
    public String reverseString(String s) {
        char[] characters = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = characters[i];
            characters[i++] = characters[j];
            characters[j--] = temp;
        }

        return new String(characters);

    }
}
