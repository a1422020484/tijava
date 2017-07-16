/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tjjava.socket;

/**
 *  根据客户端发送的message，进行相应的操作
 */
public class ClientRequestHandler {

    private String message;

    public ClientRequestHandler(String message) {
        this.message = message;
    }

    public String response() {
        return "梁明炯恶搞视频.wmv 郑高强.jpg 林.jpg";
    }
}
