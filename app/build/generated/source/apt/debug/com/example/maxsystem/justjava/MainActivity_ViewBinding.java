// Generated code from Butter Knife. Do not modify!
package com.example.maxsystem.justjava;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131165221;

  private View view2131165219;

  private View view2131165220;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_order, "field 'btnOrder' and method 'onOrderClicked'");
    target.btnOrder = Utils.castView(view, R.id.btn_order, "field 'btnOrder'", Button.class);
    view2131165221 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onOrderClicked();
      }
    });
    target.edtUsername = Utils.findRequiredViewAsType(source, R.id.edt_username, "field 'edtUsername'", EditText.class);
    target.chbxCream = Utils.findRequiredViewAsType(source, R.id.chbx_cream, "field 'chbxCream'", CheckBox.class);
    target.chbxSugar = Utils.findRequiredViewAsType(source, R.id.chbx_sugar, "field 'chbxSugar'", CheckBox.class);
    target.txtCoffeeCount = Utils.findRequiredViewAsType(source, R.id.txt_coffee_count, "field 'txtCoffeeCount'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_less, "method 'onLessClicked'");
    view2131165219 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLessClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_more, "method 'onMoreClicked'");
    view2131165220 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMoreClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnOrder = null;
    target.edtUsername = null;
    target.chbxCream = null;
    target.chbxSugar = null;
    target.txtCoffeeCount = null;

    view2131165221.setOnClickListener(null);
    view2131165221 = null;
    view2131165219.setOnClickListener(null);
    view2131165219 = null;
    view2131165220.setOnClickListener(null);
    view2131165220 = null;
  }
}
