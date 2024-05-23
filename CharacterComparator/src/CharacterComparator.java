public class CharacterComparator {
    
    // returns true if first and last character of string is equal, otherwise false.
    public boolean comparator(String st)
    {
        if(st.charAt(0) == st.charAt(st.length()-1)) return true;
        return false;
    }
}
