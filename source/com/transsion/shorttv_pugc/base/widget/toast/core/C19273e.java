package com.transsion.shorttv_pugc.base.widget.toast.core;

import android.R;
import android.app.Application;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import p719qt.InterfaceC27126a;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.toast.core.e */
/* JADX INFO: loaded from: classes6.dex */
public class C19273e extends Toast implements InterfaceC27126a {

    /* JADX INFO: renamed from: a */
    private TextView f61914a;

    public C19273e(Application application) {
        super(application);
    }

    @Override // p719qt.InterfaceC27126a
    /* JADX INFO: renamed from: a */
    public boolean mo80705a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public TextView m80707b(View view) {
        if (!(view instanceof TextView)) {
            if (view.findViewById(R.id.message) instanceof TextView) {
                return (TextView) view.findViewById(R.id.message);
            }
            throw new IllegalArgumentException("You must include a TextView with an ID value of android.R.id.message");
        }
        if (view.getId() == -1) {
            view.setId(R.id.message);
        } else if (view.getId() != 16908299) {
            throw new IllegalArgumentException("You must set the ID value of TextView to android.R.id.message");
        }
        return (TextView) view;
    }

    @Override // android.widget.Toast, p719qt.InterfaceC27126a
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
        TextView textView = this.f61914a;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // android.widget.Toast, p719qt.InterfaceC27126a
    public void setView(View view) {
        super.setView(view);
        if (view == null) {
            this.f61914a = null;
        } else {
            this.f61914a = m80707b(view);
        }
    }
}
