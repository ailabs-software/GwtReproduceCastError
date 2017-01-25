package ailabs.client;

import java.util.List;
import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;

import jsinterop.annotations.JsType;
import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative=true, namespace=GLOBAL, name="Array")
class SomeNativeObject
{
  public Object length;
}


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwtcorehellomaven implements EntryPoint {

  /**
   * This is the entry point method.
   */
    @Override
    public void onModuleLoad() {
        new ArrayList<>();

        SomeNativeObject someNativeObject = new SomeNativeObject();

        Object o = someNativeObject.length;

        try {
            alert("is number a list? should be false: " + (o instanceof List));
        } catch (Exception e) {
            alert(e.getMessage());
        }
    }

    private native void alert(String message) /*-{
      $wnd.alert(message);
    }-*/;
}
