package com.github.taras.gwt.polymer.client.webapi;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface EventTarget {
    void addEventListener(String type, EventListener listener);
}