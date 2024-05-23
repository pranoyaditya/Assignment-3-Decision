public class WordComparator {
    
    // returns true if first and last character of string is equal, otherwise false.
    public boolean comparator(String st)
    {
        String string1 = st.substring(0,st.length()/2);
        String string2 = st.substring(st.length()/2);

        if(string1.equals(string2)) return true;

        return false;
    }
}
