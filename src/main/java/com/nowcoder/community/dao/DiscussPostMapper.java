package com.nowcoder.community.dao;


import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    //查询个人发布的帖子

    /**
     *
     * @param userId
     * @param offset  每一页起始行的行号
     * @param limit   每一页最多显示多少条数据
     * @return
     */
    List<DiscussPost> selectDiscussPost(int userId, int offset, int limit);

    //@Param注解的作用是给参数取一个别名
    //如果sql要动态的拼一个条件，并且这个方法有且只有这一个参数，那么这个参数必须取别名
    int selectDiscussPostRows(@Param("userId") int userId);



}
