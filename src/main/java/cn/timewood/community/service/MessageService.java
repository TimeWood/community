package cn.timewood.community.service;

import cn.timewood.community.entity.Message;
import org.springframework.web.util.HtmlUtils;

import java.util.List;

/**
 * @version v1.0
 * @Description: TODO(一句话描述该类的功能)
 * @Author: TimeWood
 * @Date: 2021/1/18
 */
public interface MessageService {

    public List<Message> findConversations(int userId, int offset, int limit);


    public int findConversationCount(int userId);


    public List<Message> findLetters(String conversationId, int offset, int limit);


    public int findLetterCount(String conversationId);


    public int findLetterUnreadCount(int userId, String conversationId);


    public int addMessage(Message message);


    public int readMessage(List<Integer> ids);
}
