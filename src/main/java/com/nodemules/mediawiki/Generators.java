package com.nodemules.mediawiki;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Generators {
  LINKS("links");

  private final String value;
}
