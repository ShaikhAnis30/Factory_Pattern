package com.factory.pattern.logic.dbs;

import com.factory.pattern.logic.QueryService;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("neo4j_service_instance")
public class NEO4JService implements QueryService {

  @Override
  public String getData(Map<String, String> queryMap) {
    return "Inside NEO4J Service";
  }
}
