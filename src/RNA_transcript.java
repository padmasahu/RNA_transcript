public class RNA_transcript {
    static String RNA(String a){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == 'G')
              sb.append('C');
            else if(a.charAt(i) == 'C')
                sb.append('G');
            else if(a.charAt(i) == 'T')
                sb.append('A');
            else if(a.charAt(i) == 'A')
                sb.append('U');
        }

        String m = sb.toString();
        return m;
    }

    public static void main(String[] args) {
        String t = "GGCAT";
        System.out.println("RNA FOR THIS:"+ RNA(t));
    }
}
