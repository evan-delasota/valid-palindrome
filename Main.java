class Main {
  public static void main(String[] args) {
    System.out.println(isPalindrome("Hello world!"));
  }

  public static boolean isPalindrome(String s) {
    if (s.length() == 0 || s.length() == 1) return true;
        
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        
        String filteredString = sb.toString();
        String reverseFilteredString = sb.reverse().toString();
        
        return (filteredString.equals(reverseFilteredString));
    }
  }