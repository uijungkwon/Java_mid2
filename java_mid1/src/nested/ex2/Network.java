package nested.ex2;

public class Network {
    public void sendMessage(String text){
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
    private static class NetworkMessage { //중첩된 클래스
        private String content;

        public NetworkMessage(String content){
            this.content = content;
        }
        public void print(){
            System.out.println(content);
        }
    }
}
