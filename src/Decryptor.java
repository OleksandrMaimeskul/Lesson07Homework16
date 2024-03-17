public class Decryptor {
    public String decryptMessage(String message, String key) {
        int keyFigure = 0;
         for(int i = 0;i< key.length(); i++){
             keyFigure+=key.charAt(i);
        }
         StringBuilder decrMsg = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char figure = (char)(message.charAt(i)^keyFigure);
            decrMsg.append(figure);
        }
        return decrMsg.toString();
    }
}
