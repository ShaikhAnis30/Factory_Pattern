package com.factory.pattern.logic.dbs;

import com.factory.pattern.logic.QueryService;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service("tidb_service_instance")
public class TIDBService implements QueryService {


  @Override
  public String getData(Map<String, String> queryMap) {
    return "Inside TIDB Service Instance";
  }
}
