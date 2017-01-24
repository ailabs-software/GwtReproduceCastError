package ailabs.client;

import java.util.List;
import java.util.ArrayList;

import ailabs.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwtcorehellomaven implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {

helloWorld();

    Object myvalue = getSomeValue2();
    if (true) {
      myvalue = getSomeValue();
    }

    if ( myvalue instanceof List ) {
      throw new Error("REACHED!" + myvalue);
    }
  }

  private native void helloWorld() /*-{
    $wnd.alert("Hello World Core in Maven");
  }-*/;

  private native Object getSomeValue() /*-{
    $wnd.fooBarNutterButter = JSON.parse("{\"paranoid\": 42}").paranoid;
    return $wnd.fooBarNutterButter;
  }-*/;

  private List getSomeValue2() {
    return new ArrayList();
  }
}
