package nested.ex1;
/**
 * Network 만 사용하면 되므로 NetworkMessage 는 내부에 감춰두는게 좋겠다!
 * */
public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello java");
    }
}
