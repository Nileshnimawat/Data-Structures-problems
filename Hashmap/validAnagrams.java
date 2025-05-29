import java.util.HashMap;
class validAnagram{
public boolean validanagram(String s, String t) {
    if(s.length() != t.length()) return false;
    HashMap<Character , Integer> mp = new HashMap<>();
    for(int i=0; i < s.length(); i++){
    char ch1 = s.charAt(i);
    if(mp.containsKey(ch1)){
        mp.put(ch1,mp.get(ch1)+1);
    }else{
        mp.put(ch1,1);
    }
  }

 for(int i=0; i < t.length(); i++){
     char ch = t.charAt(i);
     if(!mp.containsKey(ch)) return false ;
    mp.put(ch,mp.get(ch)-1);
    if(mp.get(ch)==0) mp.remove(ch);
 }

 if(mp.size()==0) return true;
 return false;
}
}