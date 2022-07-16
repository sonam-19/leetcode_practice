  import java.util.*; 
class Solution {
    public static boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();
        for (char c : s.toCharArray()) {
             switch (c) {
                case '(': bracket.push(c); break;
                case '{': bracket.push(c); break;
                case '[': bracket.push(c); break;
                case ')': if (bracket.empty() || bracket.peek()!='(') return false; else bracket.pop(); break;
                case '}': if (bracket.empty() || bracket.peek()!='{') return false; else bracket.pop(); break;
                case ']': if (bracket.empty() || bracket.peek()!='[') return false; else bracket.pop(); break;
                default: ; 
            }
        }
        return bracket.isEmpty();
    }
  public static void main(String[] args) {
      String s = "{}[)(]";
      boolean check = isValid(s);
          if(check){
                System.out.println("The given string contains valid parentheses.");
            }
            else{
                System.out.println("The given string contains invalid parentheses.");
            }
  }   
}