package com.factory.pattern.logic.dbs;

import com.factory.pattern.logic.QueryService;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service("mongo_service_instance")
public class MONGOService implements QueryService {

  @Override
  public String getData(Map<String, String> queryMap) {
    return "Inside MONGO Service";
  }
}
