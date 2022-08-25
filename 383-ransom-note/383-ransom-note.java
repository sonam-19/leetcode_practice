class Solution {
    public boolean canConstruct(String ransomeNote, String magazine) {
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            if(!hashmap.containsKey(magazine.charAt(i)))
                hashmap.put(magazine.charAt(i),1);
            else
                hashmap.put(magazine.charAt(i),hashmap.get(magazine.charAt(i))+1);
        }
        
        int start=0;
        while(start<ransomeNote.length())
        {
            if(!hashmap.containsKey(ransomeNote.charAt(start)))
                return false;
            else
            {
                hashmap.put(ransomeNote.charAt(start),hashmap.get(ransomeNote.charAt(start))-1);
                if(hashmap.get(ransomeNote.charAt(start))==0)
                    hashmap.remove(ransomeNote.charAt(start));
            }
            
            start++;
        }
        return true;
    }
}