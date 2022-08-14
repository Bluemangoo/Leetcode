class Solution {
    String pattern;
    private String dfs(String before){
        int p=before.length()-1;
        int digit=Integer.parseInt(String.valueOf(before.charAt(p)));
        if (pattern.charAt(p)=='I'){
            for (int i=digit+1;i<=9;i++){
                if (!before.contains(String.valueOf(i))){
                    if (before.length()==pattern.length()){
                        return before+i;
                    }
                    String x=dfs(before+i);
                    if (!x.equals("none")){
                        return x;
                    }
                }
            }
            return "none";
        }
        if (pattern.charAt(p)=='D'){
            for (int i=1;i<digit;i++){
                if (!before.contains(String.valueOf(i))){
                    if (before.length()==pattern.length()){
                        return before+i;
                    }
                    String x=dfs(before+i);
                    if (!x.equals("none")){
                        return x;
                    }
                }
            }
            return "none";
        }
        return "none";
    }
    public String smallestNumber(String pattern) {
        this.pattern=pattern;
        for (int i=1;i<=9;i++){
            String x=dfs(String.valueOf(i));
            if (!x.equals("none")){
                return x;
            }
        }
        return "none";
    }
}