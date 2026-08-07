package strings_stringBuilder_ArrayList;

public class StringCompression {
    private static StringBuilder compress(StringBuilder str){
        StringBuilder st = new StringBuilder();
        int i = 0;
        int j = i+1;
        int count = 1;
        while(i<str.length()&&j<str.length()){

            if(str.charAt(i)!=str.charAt(j)){
                st.append(str.charAt(i));
                if(count>1){
                    st.append(count);
                }

                count = 1;
            }else{
                count++;
            }

            i++;
            j++;

        }

        if(str.length()>0){
            st.append(str.charAt(str.length()-1));
            if(count>1){
                st.append(count);
            }

        }
        return st;
    }
    public static void main(String[] args) {
        System.out.println(compress(new StringBuilder("aabcccccaaa")));
    }
}
