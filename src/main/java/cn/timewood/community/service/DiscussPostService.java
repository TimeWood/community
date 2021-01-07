package cn.timewood.community.service;

import cn.timewood.community.entity.DiscussPost;

import java.util.List;

/**
 * @version v1.0
 * @Description: TODO(一句话描述该类的功能)
 * @Author: TimeWood
 * @Date: 2021/1/7
 */
public interface DiscussPostService {

    public List<DiscussPost> findDiscussPost(int userId, int offset, int limit);

    public int findDiscussPostRows(int userId);
}
