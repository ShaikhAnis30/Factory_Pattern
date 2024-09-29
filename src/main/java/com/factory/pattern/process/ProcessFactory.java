package com.factory.pattern.process;

import com.factory.pattern.factory.DatabaseFactory;
import java.util.HashMap;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProcessFactory {

  private final DatabaseFactory databaseFactory;
  public void getFactoryInstance(String dbTypeIdentifier) {
    String data = databaseFactory.getInstance(dbTypeIdentifier).getData(new HashMap<>());
    System.out.println(data);
  }

}
