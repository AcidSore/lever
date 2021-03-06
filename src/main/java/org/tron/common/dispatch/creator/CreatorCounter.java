package org.tron.common.dispatch.creator;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class CreatorCounter {
  private ConcurrentHashMap<String, LongAdder> counterMap = new ConcurrentHashMap<>();

  public void put(String key) {
    this.counterMap.computeIfAbsent(key, k -> new LongAdder()).increment();
  }

  public ConcurrentHashMap<String, LongAdder> getCounterMap() {
    return this.counterMap;
  }
}
