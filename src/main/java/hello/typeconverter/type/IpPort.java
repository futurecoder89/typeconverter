package hello.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

//"127.0.0.1:8080" 이런 문자가 들어오면 ip에 값을 넣게, port를 숫자로바꾸면 127.0.0.1:8080출력되게
@Getter
@EqualsAndHashCode
public class IpPort {
    private String ip;
    private int port;
    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}

   /* 롬복의 @EqualsAndHashCode 를 넣으면 모든 필드를 사용해서 equals() , hashcode() 를 생성한다.
        따라서 모든 필드의 값이 같다면 a.equals(b) 의 결과가 참이 된다*/