package com.kasuo.trademark.dao.trademark;

import com.kasuo.trademark.domain.Agent;
import org.springframework.stereotype.Repository;

/**
 * @author douzhitong
 * @date 2019/4/5
 */
@Repository
public interface AgentDao {

    Agent find(String agentNo);
}
