package ailabs.client;

import java.util.List;
import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;

public class gwtcorehellomaven implements EntryPoint {

  public void onModuleLoad() {

    //required to not skip the instanceof check
    new ArrayList<>();

    Object myvalue = getSomeValue();

    try {
      boolean isInstanceOfList = myvalue instanceof List;
      alert("Is it a list? false = " + isInstanceOfList);//expected, false
    } catch (Exception e) {
      alert("Error: " + e.getMessage());//actual, "(TypeError) : doubleCastMap is undefined"
    }
  }

  private native void alert(String message) /*-{
    $wnd.alert(message);
  }-*/;

  private native Object getSomeValue() /*-{
    return 42;
  }-*/;

}
