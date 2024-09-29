package com.factory.pattern.factory;


import com.factory.pattern.logic.QueryService;
import java.util.Map;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Data
@RequiredArgsConstructor
@Slf4j
@Service
public class DatabaseFactory {

  private final Map<String, QueryService> getInstanceMap;

  public QueryService getInstance(String dbTypeIdentifier) {
    return getInstanceMap.get(dbTypeIdentifier + "_" + "service_instance");
  }

}
