

public class RabinKarp {
    private final String pattern;
    private final String text;
    private final int textSize;
    private final int patSize;

    public RabinKarp(String _pattern, String _text) {
        this.pattern = _pattern;
        this.text = _text;
        this.textSize = text.length();
        this.patSize = pattern.length();
    }

    private long hashFunc(String hashST){
        final long base = 256;
        final int primo = 53;
        long hashValue = 0;
        int order = hashST.length()-1;
        int indexCalc;
        for(int i=order; i>=0; i--){
            indexCalc = hashST.charAt(i);
            hashValue += (indexCalc*(Math.pow(base, i)));
        }
        hashValue %= primo;
        return hashValue;
    }

    public void check(){
        int ini = 0;
        int end = this.patSize;
        long hashpat;
        long hashtext;
        String textTemp;
        for (; ; ) {
            textTemp = text.substring(ini, end);
            hashpat = hashFunc(pattern);
            hashtext = hashFunc(textTemp);
            if (hashtext== hashpat) {
                if(textTemp.equals(pattern)){
                    System.out.println("O padrão ocorre no indice " + ini + " do texto");
                }
            }
            if(end<textSize) {
                ini++;
                end++;
            }else{
                break;
            }
        }
    }
}
