package ailabs.client;

import java.util.List;
import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwtcorehellomaven implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {

    Object myvalue = getSomeValue2();

    myvalue = getSomeValue();

    if ( myvalue instanceof List ) {
      throw new Error("Never happens");
    }
  }

  private native Object getSomeValue() /*-{
    return 42;
  }-*/;

  private List getSomeValue2() {
    return new ArrayList();
  }
}
