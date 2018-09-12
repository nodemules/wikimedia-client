package com.nodemules.mediawiki;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Action {

    PARSE("parse"),
    QUERY("query");

    private final String value;
}
