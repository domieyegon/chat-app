package ke.co.unify.chatapp.domain;

import ke.co.unify.chatapp.domain.enumeration.MessageType;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;

}
