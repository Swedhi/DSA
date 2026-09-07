class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            char characters[]=word.toCharArray();
            Arrays.sort(characters);
            String key=new String(characters);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(word);
        }
        List<List<String>> ans=new ArrayList<List<String>>();
        Iterator<List<String>> iterator=map.values().iterator();
        while(iterator.hasNext()){
            List<String> group=iterator.next();
            ans.add(group);

        }
        return ans;
    }
}